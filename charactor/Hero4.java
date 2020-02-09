package charactor;

public class Hero4 {
		
		public Hero4()
		{
			name = Hero4.getname("构造芳法");
			
		}
		{
			name = Hero4.getname("初始化块");
		}
		public String name = Hero4.getname("属性声明");
				
				
				
				public static String getname(String pos)
				{
						String result = "name"+pos;
						System.out.println(result);
						return result;
				}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				new Hero4();
			Hero4 h = new Hero4();
			h.getname("sss");
	}

}
