/**
 * An application to simulate a restaurant to add and remove customers from a line
 * using a queue.
 * @author Ben Albright
 */

public class Application {

	public static void main(String[] args) {
		
		/**
		 * Creating a new generic Queue that can hold String objects.
		 */
		LinkedQueue<String> queue = new LinkedQueue<String>();
		
		/**
		 * Adding the initial 3 people to the queue, and printing out the queue each time.
		 */
		queue.enqueue("Bill");
		queue.enqueue("Alice");
		queue.enqueue("Bob");
		
		/**
		 * removing the first object from the queue and printing out the updated queue.
		 */
		queue.dequeue();
		
		/**
		 * Adding two more people to the back of the queue.
		 */
		queue.enqueue("Jane");
		queue.enqueue("Hamad");
		
		/**
		 * Removing two people from the front of the queue.
		 */
		queue.dequeue();
		queue.dequeue();
		
		/**
		 * Adding another person to the queue.
		 */
		queue.enqueue("Jim");
		
		/**
		 * Removing two more people from the queue
		 */
		queue.dequeue();
		queue.dequeue();
		
		/**
		 * Removing the last person from the queue. Then calling dequeue again to test the exception.
		 */
		queue.dequeue();
		queue.dequeue();
	}

}
