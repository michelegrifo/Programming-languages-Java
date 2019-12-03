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
}