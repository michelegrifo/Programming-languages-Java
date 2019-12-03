import java.util.*;
import java.io.*;

public class ArrayListQueue<T> implements Queue<T>{
    private ArrayList<T> elements = new ArrayList<>();
    
    public void enqueue(T element){
        elements.add(element);
    }

    public T dequeue(){
        if(elements.isEmpty())
            throw new NoSuchElementException();
        else 
            return elements.remove(0);
    }

    public T top(){
        if(elements.isEmpty())
            throw new NoSuchElementException();
        else    
            return elements.get(0);
    }

    public void clear(){
        elements.clear();
    }

    public int size(){
        return elements.size();
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }


}