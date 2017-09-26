package testsets;

public class Krug extends geometrijskiOlik {
double r;

public Krug(double r1) {
	super();
	r = r1;
}

@Override
public double povrsina() {
	// TODO Auto-generated method stub
	return r*r*3.1415;
}

}
