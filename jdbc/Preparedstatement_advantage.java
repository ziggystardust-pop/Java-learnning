package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class Preparedstatement_advantage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			String sql = "insert into hero values(null,?,?,?)";
			
			try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8","root", "admin");
					Statement s = c.createStatement();PreparedStatement ps = c.prepareStatement(sql)){
				// Statement执行10次，需要10次把SQL语句传输到数据库端
	            // 数据库要对每一次来的SQL语句进行编译处理
				long start = System.currentTimeMillis();
				 for (int i = 0; i < 10000; i++) {
		                String sql0 = "insert into hero values(null," + "'提莫'" + ","
		                        + 313.0f + "," + 50 + ")";
		                s.execute(sql0);
		            }
		            s.close();
		            long end = System.currentTimeMillis();
		            System.out.println(-start+end);
		         // PreparedStatement 执行10次，只需要1次把SQL语句传输到数据库端
		            // 数据库对带?的SQL进行预编译
		  
		            // 每次执行，只需要传输参数到数据库端
		            // 1. 网络传输量比Statement更小
		            // 2. 数据库不需要再进行编译，响应更快
		            long start1 = System.currentTimeMillis();
		            for(int i = 0;i<10000;i++) {
		            	ps.setString(1,"ff");
		            	ps.setFloat(2, 313.0f);
		                ps.setInt(3, 50);
		                ps.execute();
		            }
		            long end1 = System.currentTimeMillis();
		            System.out.println(-start1+end1);
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
