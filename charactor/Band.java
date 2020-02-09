package charactor;

public class Band {
//	类方法
	public String name;
	protected float setyear;
	public void breakyear()
	{
		setyear+=10;
	}
	public static void never()
	{
		System.out.println("太让人难过了");
	}
	public static void battlewin()
	{
		Band led = new Band();
		led.never();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Band beatles =new Band();
//		Band.beakyear     无法调用
		Band.never();
		beatles.breakyear();
		beatles.never();
		beatles.setyear = (float)Math.random();
		Band.battlewin();
		
	}

}
