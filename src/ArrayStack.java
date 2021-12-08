import java.util.Arrays;

public class ArrayStack<T> implements StackADT<T> //ArrayStack will do everything that StackADT does

{
	private final static int DEFAULT_CAPACITY = 100;
	private T[] _stack;
	private int _top;

	public ArrayStack()
	{
		this(DEFAULT_CAPACITY);
	}

	public ArrayStack(int intialCapacity)
	{
		_top = 0;
		_stack = (T[]) new Object [intialCapacity];
	}

	public void push(T element)
	{
		if (size() == _stack.length)
		{
			expandCapacity();
		}
		_stack[_top] = element;
		++_top;
	}

	public T pop() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException("stack");

		--_top;
		T result = _stack[_top];
		_stack[_top] = null;

		return result;
	}

	public T peek() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException();

		T result = _stack[_top - 1];
		return result;
	}

	public int size()
	{
		return _top;
	}

	public boolean isEmpty()
	{
		return _top <= 0;
	}

	private void expandCapacity()
	{
		_stack = Arrays.copyOf(_stack, _stack.length * 2);
	}

	public String toString()
	{
		String output = "[ ";
		for (int i = 0; i < _top; i++)
		{
			output += _stack[i].toString() + " ";
		}
		return output + "]";
	}

	// public class EmptyCollectionException extends Exception
}
