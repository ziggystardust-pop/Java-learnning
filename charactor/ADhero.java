package charactor;

public class ADhero extends Hero implements AD,Mortal{
	public void physicAttack()
	{
		System.out.println("进行物理攻击");
	}
	public void die()
	{
		System.out.println("AD赞美太阳");
	}
	//隐藏父类的battleWin方法
	public static void battlewin()
	{
		System.out.println("ad hero battle win");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero.battlewin();
		ADhero.battlewin();
	}

}
