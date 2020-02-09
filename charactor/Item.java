package charactor;

public class Item {
//	使用懒汉式单例模式，把Item类改造成为单例模式 
	
	private Item()
	{
		
	}
	public static Item instance;
	public static Item getinstance()
	{
		if(null==instance)
		{
			instance =new Item();
		}
		return instance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
