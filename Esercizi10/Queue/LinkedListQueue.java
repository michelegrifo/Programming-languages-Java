package Queue;
import java.util.*;
import java.io.*;

public class LinkedListQueue<T> implements Queue<T>{
    private LinkedList<T> elements = new LinkedList<T>();

    public void enqueue(T element){
        elements.add(element);
    }

    public T dequeue(){
        if(elements.isEmpty())
            throw new NoSuchElementException();
        else
            return elements.removeFirst();
    }

    public T top(){
        if(elements.isEmpty())
            throw new NoSuchElementException();
        else
            return elements.getFirst();
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