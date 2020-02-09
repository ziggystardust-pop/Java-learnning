package charactor;

public class Hero5 {
//	使用饿汉式单例模式, 把Hero类改造成为单例模式
	private Hero5()
	{
		
	}
	public static Hero5 instance = new Hero5();
	
	public static Hero5 getinstance()
	{
		
		return instance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
