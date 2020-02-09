package charactor;

public class TestGiant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
        GiantDragon2 g1 = GiantDragon2.getinstance();
        GiantDragon2 g2 = GiantDragon2.getinstance();
        GiantDragon2 g3 = GiantDragon2.getinstance();
         
        //都是同一个对象
        System.out.println(g1==g2);
        System.out.println(g1==g3);
	}

}
