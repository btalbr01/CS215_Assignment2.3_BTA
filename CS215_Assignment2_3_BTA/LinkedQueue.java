/**
 * 
 * @author btalb
 *Creating a public class that creates a queue that can hold generic objects.
 */
public class LinkedQueue<T>
{
	/**
	 * Variables for the head and tail of the queue and an integer to keep track of the length.
	 */
	private Node<T> head, tail;
	private int length;
	
	/**
	 * Instantiating values for the head, tail and queue length.
	 */
	public LinkedQueue()
	{
		head = null;
		tail = head;
		length = 0;
	}
	
	/**
	 * Adds a new element to the back of the queue and updates the list, 
	 * then calls inspectQueue to print the elements of the queue.
	 * @param element
	 * @return A string stating the element has been added.
	 */
	public void enqueue(T element)
	{
		Node<T> node = new Node<T>(element);
		if (isEmpty() ) {
			head = node;
			tail=head;
		}
		tail.nextNode=node;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		System.out.println(element + " arrives");
		inspectQueue();
		
	}
	
	/**
	 * Removes the object at the front of the queue. Throws an exception if the queue is empty. 
	 * Then calls inspectQueue to print the contents of the queue.
	 * @return Returns a string stating the the front element in the queue has been served.
	 * @throws EmptyCollectionException
	 */
	public T dequeue() throws EmptyCollectionException
	{	
		if(isEmpty())
			{
				throw new EmptyCollectionException("queue");
			}
			T result = head.getData();
			head = head.nextNode;
			length--;
			
			if(isEmpty())
				tail = null;
			
			System.out.println(result + " has been served");
			inspectQueue();
			return result;
	}
	
	/**
	 * Tests if the queue is empty
	 * @return true is the queue is empty or false if it is not.
	 */
	public boolean isEmpty()
	{
		if (head==null) 
		{ 
			return true;
		}
		else return false;
	}
	
	/**
	 * Gets the head of the queue
	 * @return Returns the head of the queue
	 */
	public Node <T> getList()
	{
		return head;
	}
	
	/**
	 * Goes through the queue and prints out all elements.
	 * @return A string listing all elements of the queue.
	 */
	public void inspectQueue()
	{
		System.out.print("Current line: ");
		Node<T> line = head;
		while (line != null)
		{
			System.out.print(line.getData() + " ");
			line = line.nextNode;
		}
		System.out.println("\n");
		
	}

	/**
	 * Lists the first and last objects in the queue and the queue's length.
	 * @return Returns the head of the queue, tail of the queue and queue length.
	 */
	@Override
	public String toString() {
		return "LinkedQueue [head=" + head.getData() + ", tail=" + tail.getData() + ", length=" + length + "]";
	}

}
