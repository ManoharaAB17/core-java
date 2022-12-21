/**
 * 
 */
package com.xworkz.collectionsapp.dec21;

import java.util.*;
import java.util.Collection;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * @author DELL
 *
 */
public class Chats {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String chats1= "pani puri ";
		String chats2= "sevpuri ";
		String chats3= "Dhai puri ";
		String chats4= "Vada pav ";
		String chats5= "Gobi Manchurian ";
		
		Collection<String> chat = new ArrayList<String>();
		
		chat.add(chats1);
		chat.add(chats2);
		chat.add(chats3);
		chat.add(chats4);
		chat.add(chats5);
		chat.add(null);
		chat.add("TIkki puri");
		Iterator<String> itr = chat.iterator();
		
		System.out.println("Size : " +chat.size());
		
		System.out.println("Access elements \n");
		for(String elements : chat) {
			System.out.println(elements);
		}
	}

}
