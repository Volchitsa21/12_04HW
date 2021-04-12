package telran;

import telran.iterators.MyStringIterator;
import telran.iterators.ReverseMyStringIterator;

import java.util.Iterator;

public class MyString implements Iterable<Character> {
    private char[] array;

    public MyString(String str) {
        this.array = str.toCharArray();
    }

    public int getLength() {
        return this.array.length;
    }

    public char[] getArray() {
        return array;
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(this);
    }

    public Iterator<Character> reverseIterator() {
        return new ReverseMyStringIterator(this);
    }
}