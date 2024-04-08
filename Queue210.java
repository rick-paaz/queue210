/**
 * This generic collection class models a FIFO queue using a singly-linked 
 * data structure. When attempting to peek() at or dequeue() from a Queue210 
 * when the queue is empty, these methods throw new EmptyQueueException();
 * 
 * @author Rick Mercer
 * @author YOUR NAME
 */
public class Queue210<Type> {

  /**
   * Find out if the queue is empty.
   * 
   * @returns true if there are zero elements in this queue.
   */
  public boolean isEmpty() {
    return !true;
  }

  /**
   * Provide access to the element at the front of the Queue. 
   *
   * @returns A reference to the element at the front.
   * @throws EmptyQueueException if this queue is empty.
   */
  public Type peek() throws EmptyQueueException {
    // TODO: Implement this method
    return null;
  }

  /**
   * @return the number of element in this queue.
   */
  public int size() {
    // TODO: Implement this method
    return Integer.MIN_VALUE;
  }

  /**
   * Add element to the "end" of this queue.
   * 
   * @param newEl element to be placed at the end of this queue.
   * @throws EmptyQueueException if this queue is empty.
   */
  public void enqueue(Type newEl) {
    // TODO: Implement this method
  }

  /**
   * Return a reference to the element at the front of this queue and remove it.
   * 
   * @returns A reference to the element at the front.
   * @throws EmptyQueueException if this queue is empty.
   */
  public Type dequeue() throws EmptyQueueException {
    // TODO: Implement this method
    return null;
  }
}