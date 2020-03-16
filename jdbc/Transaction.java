package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8","root", "admin");Statement s = c.createStatement()){
				 //没有事务的前提下
	            //假设业务操作时，加血，减血各做一次
	            //结束后，英雄的血量不变
	            //加血的SQL
				String sql0 = "update hero set hp = hp+1 where id = 6";
				s.execute(sql0);
				//减血的SQL
	            //不小心写错写成了 updata(而非update)
				String sql1 = "updata hero set hp = hp-1 where id = 6";
				s.execute(sql1);
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
