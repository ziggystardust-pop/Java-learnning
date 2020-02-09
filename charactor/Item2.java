package charactor;

public class Item2 {
		String name;
		int price;
		public void buy()
		{
			System.out.println("购买");
		}
		public void effect()
		{
			System.out.println("物品使用后，可以有效果");
		}
		public void useItem(Item2 i)
		{
			i.effect();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Item2 i = new Item2();
			i.effect();
			LifePotion lp = new LifePotion();
			lp.effect();
			/*观察类的多态现象：
			1. i1和i2都是Item类型
			2. 都调用effect方法
			3. 输出不同的结果

			多态: 都是同一个类型，调用同一个方法，却能呈现不同的状态 
			父类引用指向子类对象*/
			Item2 i1 = new LifePotion();
			Item2 i2 = new MagicPotion();
			i1.effect();
			i2.effect();
			MagicPotion mp = new MagicPotion();
			Item2 garen = new Item2();
			garen.name = "盖伦";
			garen.useItem(lp);
			garen.useItem(mp);
	}

	}


