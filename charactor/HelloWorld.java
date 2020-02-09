package charactor;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Season season =Season.SPRING;
			switch(season)
			{
			case SPRING:
				System.out.println("t“V");
				break;
			case SUMMER:
				System.out.println("‰Ä“V");
				break;
			case AUTUMN:
				System.out.println("H“V");
				break;

			case WINTER:
				System.out.println("“~“V");
				break;
			
			}
			for(Season t : Season.values())
			{
				System.out.println(t);
			}
			
	}

}
