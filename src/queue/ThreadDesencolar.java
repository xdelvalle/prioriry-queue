package queue;

public class ThreadDesencolar extends Thread {
	
	public ThreadDesencolar() {
		super("ThreadDesencolar");
	}
	
	public void run() {
		while(true) {
			try {
				synchronized (PriorityQueue.getInstance().getQueue()) {
					if(PriorityQueue.getInstance().isEmpty()) 
						PriorityQueue.getInstance().getQueue().wait();
					
					System.out.println("[[--> Desencolado: " + PriorityQueue.getInstance().dequeue());
				}
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}
