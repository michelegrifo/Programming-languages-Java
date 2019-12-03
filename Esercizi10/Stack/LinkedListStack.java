package Stack;
import java.util.*;
import java.io.*;

public class LinkedListStack<T> implements Stack<T>{
    
    private LinkedList<T> elements = new LinkedList<>();

    public void push(T element){
        elements.addLast(element);
    }

    public T pop(){
        if(elements.isEmpty())
            throw new NoSuchElementException();
        else 
            return elements.removeLast();
    }

    public T top(){
        if(elements.isEmpty())
            throw new NoSuchElementException();
        else
            return elements.getLast();
    }

    public void clear(){
        elements.clear();
    }

    public int size(){
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

}