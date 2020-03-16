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
		try {//����ǡǡ����ʹ��try-with-resource�ķ�ʽ����Ϊ��Щ���Ӷ���Ҫ��"��"�ģ���Ҫ���Զ��ر���
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
