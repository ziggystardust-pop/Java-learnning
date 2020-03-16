package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import jdbc.Connection_Pool;
public class Test_connection_pool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Connection_Pool cp = new Connection_Pool(3);
			for(int i = 0;i<100;i++) {
				Thread t = new workthread("working thread"+i,cp);
				t.start();
			}
	}

}
	class workthread extends Thread{
	private Connection_Pool cp;
	public workthread(String name,Connection_Pool cp) {
		super(name);
		this.cp = cp;
	}
	public void run() {
		Connection c = cp.getconnection();
		System.out.println(this.getName()+ ":\t 获取了一根连接，并开始工作");
		try(Statement st = c.createStatement()){
			//模拟时耗１秒的数据库ＳＱＬ语句
			Thread.sleep(1000);
			st.execute("select * from hero");
		}catch(SQLException|InterruptedException e) {
			e.printStackTrace();
		}
		cp.returnconnection(c);
	}
}