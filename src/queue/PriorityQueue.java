package queue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueue {
	
	/** Singleton */
	public static PriorityQueue instance = new PriorityQueue();
	
	/** Instancia de cola con prioridad */
	PriorityBlockingQueue<Object> pQueue = new PriorityBlockingQueue<Object>();
	
	/** Constructor */
	private PriorityQueue() {
		super();
	}

	/**
	 * Desencola y elimina el primer objeto de la cola
	 * @return Objeto de la cola
	 */
	public Object dequeue() {
		if(!getQueue().isEmpty()) {
			return getQueue().poll();
		}
		return null;
	}
	
	/**
	 * Encola un objeto
	 * @param o
	 */
	public void enqueue(Object o) {
		getQueue().put(o);
	}
	
	/**
	 * Borra todo el contenido de la cola
	 */
	public void clear() {
		getQueue().clear();
	}
	
	/**
	 * Comprueba si la cola está vacía
	 * @return true si está vacía y false en caso contrario
	 */
	public boolean isEmpty() {
		return getQueue().isEmpty();
	}
	
	/** Acceso a la clase mediante el Singleton */
	public static PriorityQueue getInstance() {
		return instance;
	}

	/** Obtiene una instancia de la cola */
	public PriorityBlockingQueue<Object> getQueue() {
		return pQueue;
	}
}
