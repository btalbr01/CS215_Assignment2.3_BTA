/**
 * An exception that is thrown if dequeue is called but the queue is empty.
 * @author btalb
 *
 */
@SuppressWarnings("serial")
public class EmptyCollectionException extends RuntimeException
{
	public EmptyCollectionException(String collection)
	   {
	       super("The " + collection + " is empty.");
	   }
}
