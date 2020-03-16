package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //初始化驱动
		//驱动类com.mysql.jdbc.Driver
        //就在 mysql-connector-java-5.0.8-bin.jar中
        //如果忘记了第一个步骤的导包，就会抛出ClassNotFoundException
		Statement s = null;
		Connection c = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("数据库加载驱动成功");
				  // 这里需要提供：
	            // 数据库所处于的ip:127.0.0.1 (本机)
	            // 数据库的端口号： 3306 （mysql专用端口号）
	            // 数据库名称 how2java
	            // 编码方式 UTF-8
	            // 账号 root
	            // 密码 admin
				c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8","root","admin");
				System.out.println("连接成功，获取连接对象： " + c);
				
				 s = c.createStatement();
				System.out.println("获取statement对象"+s);
				String sql = "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
				s.execute(sql);

	            System.out.println("执行插入语句成功");
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
			catch(SQLException e)
			{// 建立与数据库的Connection连接
				e.printStackTrace();
			}finally {
				if(s!=null) {
					try{
						s.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				if(c!=null) {
					try{
						c.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				
				}
				}
			}
			// 数据库的连接时有限资源，相关操作结束后，养成关闭数据库的好习惯
            // 先关闭Statement
          
	}

}
