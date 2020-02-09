package charactor;

public class HeroMortal {
	
	String name;
	public void kill(Mortal m)
	{
		m.die();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HeroMortal g = new HeroMortal();
			g.name = "葛温";
			ADhero s = new ADhero();
			APhero m = new APhero();
			ADAPhero st = new ADAPhero();
			System.out.print(g.name+"杀死");
			g.kill(s);
			System.out.print(g.name+"杀死");
			g.kill(m);
			System.out.print(g.name+"杀死");
			g.kill(st);
	}

}
