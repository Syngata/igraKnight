
public class GameClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleKnight simKn= new SimpleKnight();
		simKn.attack();
		simKn.movement(2);
		simKn.strength(5);
		
		KnightFstLevel lvl1=new KnightFstLevel(simKn);
		
		lvl1.attack();
		lvl1.movement(2);
		lvl1.strength(10);
		lvl1.goAway();

	}

}
