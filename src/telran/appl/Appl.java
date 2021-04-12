package telran.appl;

import telran.MyString;
import telran.iterators.ReverseMyStringIterator;

import java.util.Iterator;

public class Appl  {
    public static void main(String[] args) {
        MyString myString = new MyString("");

        for (Character character : myString) {
            System.out.print(character + " ");
        }
        System.out.println();

        Iterator<Character> iter = new ReverseMyStringIterator(myString);
        while (iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }
}
