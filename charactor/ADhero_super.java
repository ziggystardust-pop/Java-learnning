package charactor;

public class ADhero_super extends Hero_Super{

	int movespeed = 400;
	public ADhero_super()
	{
		System.out.println("ADhero 的构造方法");
	}
	public ADhero_super(String name)
	{
		super(name);
		System.out.println("ADhero_super的构造方法");
	}
	public int getmovespeed()
	{
		return this.movespeed;
	}
	public int getmovespeed2()
	{
		return super.movespeed;
	}
	public void useItem(Item2 i)
	{
		System.out.println("adhero use item");
		super.useItem(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new ADhero_super();
			new ADhero_super("德莱文");
			ADhero_super h = new ADhero_super();
			System.out.println(h.getmovespeed());
			System.out.println(h.getmovespeed2());
			Item2 s = new Item2();
			h.useItem(s);
	}

}
