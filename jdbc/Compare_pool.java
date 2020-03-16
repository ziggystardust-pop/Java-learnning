package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Compare_pool {
	int size;
	List<Connection> cs = new ArrayList<Connection>();
	public Compare_pool(int size) {
		this.size = size;
		init();
	}
	public void init() {
		try {//这里恰恰不能使用try-with-resource的方式，因为这些连接都需要是"活"的，不要被自动关闭了
			Class.forName("com.mysql.jdbc.Driver");
			for(int i = 0;i<size;i++) {
				Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8", "root", "admin");
				cs.add(c);
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public synchronized Connection getconnection() {
		while(cs.isEmpty()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Connection c = cs.remove(0);
		return c;
	}
	public synchronized void returnconnection(Connection c) {
		cs.add(c);
		this.notifyAll();
	}
}
