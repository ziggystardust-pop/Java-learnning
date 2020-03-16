package jdbc;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Transaction_train {
		public static int[] list(int a,int b) {
			try {Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();}
			int i[] = new int[10];
			try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8","root", "admin");Statement s = c.createStatement()){String sql = "select * from hero limit " +a+ ","+ b;
				ResultSet rs = s.executeQuery(sql);
				int j = 0;
				while(rs.next()) {
					int id = rs.getInt("id");
					i[j] = id;
					j++;}
			}catch(SQLException e) {
				e.printStackTrace();
			}return i;
		}
	public static void main(String[] args) {
		String ch = null;
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		int a[] = list(0,10);
		System.out.println(a.length);
		try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2jjava?characterEncoding=UTF-8","root", "admin");Statement s = c.createStatement()){
			for(int i = 0;i<a.length;i++) {
				System.out.println("ÊÔÍ¼É¾³ýid="+a[i]);
			}
			System.out.println("ÊÇ·ñÒªÉ¾³ýÊý¾Ý");
			while(true) {
				ch = sc.nextLine();
				char cc = ch.charAt(0);
				if(cc=='Y') {
					for(int i = 0;i<a.length;i++) {
						String sql2 = "delete from hero where id="+a[i];
						s.execute(sql2);}
					break;}
				if(cc=='N') {
					break;}
				if(cc!='Y'&&cc!='N') {
					continue;}}
		}catch(SQLException e) {
			e.printStackTrace();}
	}
	

}
