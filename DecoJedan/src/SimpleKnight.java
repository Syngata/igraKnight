
public class SimpleKnight implements Knight{

	public SimpleKnight() {
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Napad macem");
	}

	@Override
	public void movement(int mov) {
		// TODO Auto-generated method stub
		System.out.println("Pomakli smo se " + mov + "metra");
		
	}

	@Override
	public void strength(int str) {
		// TODO Auto-generated method stub
		System.out.println("Jacina napada: "+ str);
	}

	@Override
	public void goAway() {
		// TODO Auto-generated method stub
		System.out.println("Bjezim");
	}
	
	
}
