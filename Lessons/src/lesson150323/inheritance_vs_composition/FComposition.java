package lesson150323.inheritance_vs_composition;

public class FComposition {

	F f;
	
	public FComposition(final F f) {
		this.f = f;
	}
	
	public void methodA() {
		f.m1();
		// something else
	}
	
	public void m2() {
		f.m2();
	}
	
	public void methodC() {
		f.m3();
	}
	
	public void methodD() {
		f.m4();
	}
}
