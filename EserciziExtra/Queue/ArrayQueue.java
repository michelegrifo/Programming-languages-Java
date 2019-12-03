import java.util.*;
import java.io.*;

public class ArrayQueue<T> implements Queue<T>{
	
	private int head = 1, tail = 1, total = 1;  
	
	@SuppressWarnings("unchecked")
	private T[] elements = (T[]) new Object[1]; 

	private void resize(int newTotal){
		@SuppressWarnings("unchecked")
		T[] tmp = (T[]) new Object[newTotal];
		System.arraycopy(elements, 0, tmp, 0, tail);
		elements = tmp;
		total = newTotal;
	}
	

}