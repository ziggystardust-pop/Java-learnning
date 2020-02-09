package charactor;

public class GiantDragon2 {
		private GiantDragon2()
		{
			
		}
		private static GiantDragon2 instance;
		public static GiantDragon2 getinstance()
		{
			if(null==instance)
			{
				instance=new GiantDragon2();
			}
			return instance;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
