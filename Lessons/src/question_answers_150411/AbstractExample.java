package question_answers_150411;

public class AbstractExample {
	
	public interface I1 extends ProtoI {
		void i1();
	}

	public interface I2 extends ProtoI {
		void i2();
	}
	

	interface I extends I1, I2{
		void i();
	}
	
	
	static abstract class A {
		
	}
	
	static class B {
		
	}

	
	static class C extends A implements I {

		@Override
		public void i1() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void i2() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void i() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void proto() {
			// TODO Auto-generated method stub
			
		}
		
	}
	

}
