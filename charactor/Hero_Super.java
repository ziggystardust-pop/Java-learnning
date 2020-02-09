package charactor;

public class Hero_Super {

	String name;
	float hp;
	float armor;
	int movespeed = 600;
	public void useItem(Item2 i)
	{
		System.out.println("hero use item");
	}
	public Hero_Super()
	{
		System.out.println("Hero_Super的构造方法");
	}
	public Hero_Super(String name)
	{
		System.out.println("Hero的有一个参数的构造方法 ");
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Hero_Super();
	}

}
