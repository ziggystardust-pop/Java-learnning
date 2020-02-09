package charactor;

public class MagicPotion extends Item2{
			public void effect()
			{
				System.out.println("蓝瓶使用后，可以回魔法");
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicPotion m = new MagicPotion();
		m.effect();
		Item2 i =new Item2();
		i.effect();
	}

}
