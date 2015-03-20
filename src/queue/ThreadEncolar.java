package queue;

import java.util.Random;

import model.Persona;

public class ThreadEncolar extends Thread {

	Persona p = null;
	Random random = new Random();
	
	public ThreadEncolar() {
		super("ThreadEncolar");
	}
	
	public void run() {
		while(true) {
			p = new Persona("Xavi", "del Valle", random.nextInt(5) + 1);
			System.out.println("-->]] Encolando: " + p.toString());
			
			synchronized(PriorityQueue.getInstance().getQueue()) {
				PriorityQueue.getInstance().enqueue(p);
				PriorityQueue.getInstance().getQueue().notify();
			}

			pausa(500);
		}
	}
	
	private void pausa(long pMillis) {
		try {
			Thread.sleep(pMillis);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
