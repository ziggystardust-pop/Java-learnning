package charactor;

public class Hero3 {
	/*对象属性初始化有3种
	1. 声明该属性的时候初始化 
	2. 构造方法中初始化
	3. 初始化块*/
	public String name = "some hero";
	float maxhp;
	protected float hp;
	{
		maxhp=200;
	}
	public Hero3()
	{
		hp = 100;
	}
/////////////////////////////////////////////////////////////////
	/*类属性初始化有2种
	1. 声明该属性的时候初始化
	2. 静态初始化块*/
	public static int itemcapacity = 8;
	static {
		itemcapacity  = 6;
	}
///////////////////////////////////////////////////////////////	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(Hero3.itemcapacity);
	}

}
