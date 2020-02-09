package charactor;
import j2se.Weapon;
public class Hero {
		private int id;
	    //属性id是private的，只有Hero自己可以访问
	    //子类不能继承
	    //其他类也不能访问
		public String name;//实例属性，对象属性，非静态属性
//		对象属性： 又叫实例属性，非静态属性 
		protected float hp;
		float armor;
		int movespeed;
		static String copyright;				//类属性,静态属性
		public void equip(Weapon w)
		{
			
		}
		public static void battlewin()
		{
			System.out.println(" hero battle win");
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
//			private int id;
//		public int d;
			Hero garen = new Hero();
			garen.name = "盖伦";
			Hero.copyright = "版权由riot games 公司所有";
			Hero teemo = new Hero();
			System.out.println(garen.name);
			System.out.println(garen.copyright);
			teemo.name = "提莫";
			System.out.println(teemo.name);
			System.out.println(teemo.copyright);
			garen.copyright = "Blizzard Entertainment Enterprise";
			System.out.println(teemo.copyright);
			// TODO Auto-generated method stub
			/*明确引用类型与对象类型的概念 
			在这个例子里，有一个对象 new ADHero(), 同时也有一个引用ad
			对象是有类型的， 是ADHero
			引用也是有类型的，是ADHero
			通常情况下，引用类型和对象类型是一样的*/
			ADhero ad = new ADhero();
			Hero h = new Hero();
			Support2 s = new Support2();
//			h = ad;
//			ad = (ADhero)h;
//			h = s;
//			ad = (ADhero)h;
			APhero ap = new APhero();
//			ad = (ADhero)ap;
			AD adi = ad;
			ADhero adhero = (ADhero)adi;
//			ADAPhero adaphero = (ADAPhero)adi;
//			addphero.magicAttack;
			Hero h1 = ad;
			Hero h2 = ap;
			System.out.println(h1 instanceof ADhero);//判断引用h1指向的对象，是否是ADHero类型
			System.out.println(h2 instanceof APhero); //判断引用h2指向的对象，是否是APHero类型
			System.out.println(h1 instanceof Hero);//判断引用h1指向的对象，是否是Hero的子类型
	}

}
