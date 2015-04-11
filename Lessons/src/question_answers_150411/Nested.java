package question_answers_150411;

public class Nested {

	private static class StaticClass {
		
	}
	
	protected class Inner {
		
	}
	
	
	static {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		
		class Local {
			
		}
		
		new Local() ;
		new Local() ;
		new Local() ;
		
		new StaticClass();
		
//		new Inner();  ERROR!
		
		
	}
	
	
	static void classMethod() {
//		new Local();  ERROR!
	}
	
	void instanceMethod() {
		new Inner();
	}
	
}
