package Queue;
import java.util.*;
import java.io.*;

public class ArrayQueue<T> implements Queue<T>{
	
	private int tail = 1, total = 1;  
	
	@SuppressWarnings("unchecked")
	private T[] elements = (T[]) new Object[1]; 

	private void resize(int newTotal){
		@SuppressWarnings("unchecked")
		T[] tmp = (T[]) new Object[newTotal];
		System.arraycopy(elements, 0, tmp, 0, tail);
		elements = tmp;
		total = newTotal;
	}
	
	public void enqueue(T element){
		if(tail == total)
			resize(total*2);

		elements[tail++] =  element;
	
	}

	public T dequeue(){
		
		if(tail == 1)
			throw new NoSuchElementException();		
		
		if(tail == total/4)
			resize(total/2);
		
		T element = elements[1];
		@SuppressWarnings("unchecked")
		T[] tmp = (T[]) new Object[total];
		System.arraycopy(elements, 1, tmp, 0, tail);
		elements = tmp;
		
		return element;
		
	}

	public T top(){
        if(tail == 1)
            throw new NoSuchElementException();

        return elements[tail];
    }

    public void clear(){
        for(int i = 0; i < tail; i++)
            elements[i] = null;
        
        tail = 1;
        total = 1;        
        resize(total);
    }

    public int size(){
        return tail;
    }

    public boolean isEmpty(){
       return tail == 1;
    }

}