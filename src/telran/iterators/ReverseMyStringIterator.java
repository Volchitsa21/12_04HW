package telran.iterators;

import telran.MyString;

import java.util.Iterator;

public class ReverseMyStringIterator implements Iterator<Character> {

    private MyString myString;
    private int position;

    public ReverseMyStringIterator(MyString myString){
        this.myString =myString;
        this.position = myString.getLength()-1;
    }

    @Override
    public boolean hasNext() {
        return this.position>=0;
    }

    @Override
    public Character next() {
        char[] chars = myString.getArray();
//        if (chars.length == 0) {
//            return null;
//        }

        Character character = chars[position];
        position--;
        return character;
    }
}
