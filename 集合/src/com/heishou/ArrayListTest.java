package com.heishou;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest {

	/**collection实现类arraylist
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<Integer> collection=new ArrayList<Integer>();
		collection.add(34);
		collection.add(35);
        Collection<Integer> collection2=new ArrayList<Integer>();
        collection2.addAll(collection);
        System.out.println(collection2.size());
        Iterator<?> lIterator=collection2.iterator();
        if(lIterator.hasNext()) {
			System.out.println(lIterator.next());
		}
        System.out.println("1");
	}

}
