package lesson150526.concurrency;

public class CpuCores {
	
	public static void main(final String[] args) {
		
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		
		System.out.println("cpu cores: " + availableProcessors);
		
	}

}
