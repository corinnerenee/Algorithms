public class LinearNode<T> {

    private LinearNode<T> _next;
	private T _element;
	
	public LinearNode()
	{
		_next = null;
		_element = null;
	}
	
	public LinearNode ( T elem) 
	{
		_next = null;
		_element = elem;
		
	}
	
	public LinearNode<T> getNext() //grabs value of node
	{
		return _next;
		
	}
	
	public void setNext (LinearNode<T> node) //passes in what node is
	{
		_next =  node;
	}
	
	public T getElement() 
	{
		return _element;
	}
	
	public void setElement(T elem)
	{
		_element = elem;
		
	}
    
}
