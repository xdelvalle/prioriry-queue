package queue;

public class Test {
	public static void main(String[] args) {
		ThreadEncolar encolar       = new ThreadEncolar();
		ThreadDesencolar desencolar = new ThreadDesencolar();
		
		encolar.start();
		desencolar.start();
	}
}
