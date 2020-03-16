package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class Compare_traditional_and_pool {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long st = System.currentTimeMillis();
			for(int i = 0;i<100;i++){
				new tradition().start();
			}long end = System.currentTimeMillis();
			System.out.println(end-st);
			Compare_pool cp = new Compare_pool(10);
			long st2 = System.currentTimeMillis();
			for(int i = 0;i<100;i++) {
				new pool(cp).start();
			}long end2 = System.currentTimeMillis();
			System.out.println(end2-st2);
	}
}class tradition extends Thread{
		public void run() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}String sql = "insert into user values(null,?,?)";
			try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8", "root","admin");PreparedStatement ps = c.prepareStatement(sql))  {
				ps.setString(1,"dd"); ps.setString(2,"ddd"); ps.execute();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	class pool extends Thread{
		private Compare_pool cp;
		public pool(Compare_pool cp) {
			this.cp  = cp;
		}
		public void run() {
			String sql = "insert into user values(null,?,?)";
			Connection c = cp.getconnection();
			try (PreparedStatement ps = c.prepareStatement(sql)){
				ps.setString(1,"cc");
				ps.setString(2,"ccc");
				ps.execute();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			cp.returnconnection(c);
		}
		
	}
