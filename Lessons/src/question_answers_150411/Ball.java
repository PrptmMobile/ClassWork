package question_answers_150411;

public abstract class Ball {
	
	private Ball() {
		
	}

	private static final int BASKETBALL = 0;
	private static final int VOLEYBALL = 1;

	public static Ball createBall(final int type) {
		switch(type) {
		case BASKETBALL: 
			return new Ball() {
				@Override
				public void jump() {
					System.out.println("bump");
				}
			};
		case VOLEYBALL: 
			return new Ball() {
				@Override
				public void jump() {
					System.out.println("vooomp");
				}
			};
		}
		return new Ball() {
			public void jump() {};
		};
	}
	
	abstract public void jump();
	
}
