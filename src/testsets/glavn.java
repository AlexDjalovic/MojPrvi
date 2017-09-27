package testsets;

public class glavn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		geometrijskiOlik go;
		go=new Krug(5.7);
		System.out.println("povrsina kruga je "+go.povrsina());
		System.out.println("");
		go=new Kvadrat(5);
		System.out.println("povrsina kvadrata je "+go.povrsina());
	}

}
