package testsets;

public class Kvadrat extends geometrijskiOlik {

	private int a;
	
	public Kvadrat(int a2){
		a=a2;
	}
	@Override
	public double povrsina() {
		// TODO Auto-generated method stub
		return a*a;
	}

}
