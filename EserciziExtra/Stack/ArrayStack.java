import java.util.*;
import java.io.*;

public class ArrayStack<T> implements Stack<T>{
    private int total = 1, last = 1;


    @SuppressWarnings("unchecked")
    private T[] elements = (T[]) new Object[1];

    private void resize(int newtotal){
        @SuppressWarnings("unchecked")
        T[] tmp = (T[]) new Object[newtotal];
        System.arraycopy(elements, 0, tmp, 0, last);
        elements = tmp;
        total = newtotal;
    }

    public void push(T element){
        if(last == total){
            resize(total * 2);
            System.out.println("\nSize:" + total);
        }
        
        elements[last] = element;
        last++;
    }

    public T pop(){
        if(last == total/4){
            resize(total/2);
            System.out.println("\nSize:" + total);
        }
        if(last == 1)
            throw new NoSuchElementException();

        T element = elements[last-1];
        elements[last--] = null;
        return element;
    }

    public T top(){
        if(last == 1)
            throw new NoSuchElementException();

        return elements[last];
    }

    public void clear(){
        for(int i = 0; i < total; i++)
            elements[i] = null;
        
        last = 1;
        total = 1;        
        resize(total);
    }

    public int size(){
        return total;
    }

    public boolean isEmpty(){
       return last == 1 ? true : false;
    }

}