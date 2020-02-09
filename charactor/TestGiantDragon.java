package charactor;

public class TestGiantDragon {
	/*GiantDragon 应该只有一只，通过私有化其构造方法，使得外部无法通过new 得到新的实例。
	GiantDragon 提供了一个public static的getInstance方法，外部调用者通过该方法获取12行定义的对象，而且每一次都是获取同一个对象。 从而达到单例的目的。
	这种单例模式又叫做饿汉式单例模式，无论如何都会创建一个实例*/ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Hero n = new Hero();
//			GiantDragon g = new GiantDragon();
			  //通过new实例化会报错
//	      GiantDragon g = new GiantDragon();
	         GiantDragon g1 = GiantDragon.getinstance();
	         GiantDragon g2 = GiantDragon.getinstance();
	         GiantDragon g3 = GiantDragon.getinstance();
	         System.out.println(g1==g2);
	         System.out.println(g1==g3);
	}

}
