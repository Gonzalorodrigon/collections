package com.gonzalornunez.collections;

import java.util.Collection;

public class CollectionOverview {

    public static void main(String[] args) {

        //boolean add(Object o)
            //We can add any object to the collection.
            //In case of SET, which does not allow duplicate objects.
            //Will return false.
            //In case of List, which allows duplications.
            //Will return true.

        //boolean addAll(Collection c)
            //adds all the elements in collection to the invoking collection.
            //list.addAll(c) will add all the elements in c into list.

        //boolean remove(Object o)
            //removes the object from collection.

        //boolean removeAll(Collection c)
            //removes all elements in collection that EXISTS in c.
            //collection.removeAll(c) will remove every element that c has, from the collection.

        //boolean retainAll(Collection c)
            //removes all elements from invoking collection EXCEPT the elements present in c.
            //collection.retainAll(c) will only retain elements that c has.

        //void clear()
            //removes all elements from collection.

        //boolean contains(Object o)
            //returns true if o exists in collection.

        //boolean containsAll(Collection c)
            //returns true if every element in c are present in collection.

        //boolean isEmpty(Collection c)
            //returns true if is empty.

        //int size()
            //returns the size of the collection.

        //Iterator iterator()
            //returns an Iterator for the invoking collection.
                //Provides cursor to get objects of collection one by one.

        //Object[] toArray()
            //Converts invoking collection to array.

        //
    }
}
