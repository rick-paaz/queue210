// Java does not have this Exception. This new class allows us to 
// throw new EmptyQueueException() by using inheritance to obtain all 
// of the functionality of a RunTimeException with the keyword extends.
//
// Rick Mercer
//
public class EmptyQueueException extends RuntimeException {

  private static final long serialVersionUID = 1L;
  
}
