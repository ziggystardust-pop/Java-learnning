package charactor;
import j2se.Hero;
public class Support extends Hero {

	
	public void heal()
	{
		System.out.println("���Լ���������");
		
	}
	public void heal(Hero hero)
	{
		System.out.println("��Ӣ��"+hero+"��Ѫ");
	}
	public void heal(Hero hero,int hp)
	{
		System.out.println("��Ӣ��"+hero+"����"+hp+"��Ѫ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hero garen =new Hero();
		garen.name ="gai";
	}
                                                                                                 
}
