package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //��ʼ������
		//������com.mysql.jdbc.Driver
        //���� mysql-connector-java-5.0.8-bin.jar��
        //��������˵�һ������ĵ������ͻ��׳�ClassNotFoundException
		Statement s = null;
		Connection c = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("���ݿ���������ɹ�");
				  // ������Ҫ�ṩ��
	            // ���ݿ������ڵ�ip:127.0.0.1 (����)
	            // ���ݿ�Ķ˿ںţ� 3306 ��mysqlר�ö˿ںţ�
	            // ���ݿ����� how2java
	            // ���뷽ʽ UTF-8
	            // �˺� root
	            // ���� admin
				c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8","root","admin");
				System.out.println("���ӳɹ�����ȡ���Ӷ��� " + c);
				
				 s = c.createStatement();
				System.out.println("��ȡstatement����"+s);
				String sql = "insert into hero values(null,"+"'��Ī'"+","+313.0f+","+50+")";
				s.execute(sql);

	            System.out.println("ִ�в������ɹ�");
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
			catch(SQLException e)
			{// ���������ݿ��Connection����
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
			// ���ݿ������ʱ������Դ����ز������������ɹر����ݿ�ĺ�ϰ��
            // �ȹر�Statement
          
	}

}
