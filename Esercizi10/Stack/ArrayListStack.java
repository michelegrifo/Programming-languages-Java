package Stack;
import java.util.*;
import java.io.*;

public class ArrayListStack<T> implements Stack<T>{
    private ArrayList<T> elements = new ArrayList<T>();

    public void push(T element){
        elements.add(element);
    }

    public T pop(){
        if(elements.isEmpty())
            throw new NoSuchElementException();
        else 
            return elements.remove(elements.size()-1);
    }

    public T top(){
        if(elements.isEmpty())
            throw new NoSuchElementException();
        else 
            return elements.get(elements.size()-1);
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