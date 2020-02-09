package charactor;

public class ADAPhero extends Hero implements AD,AP,Mortal{

	public void die()
	{
		System.out.println("ADAP:starman");
	}
	public void magicAttack()
	{
		System.out.println("进行魔法攻击");
	}
	public void physicAttack()
	{
		System.out.println("进行物理攻击");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
