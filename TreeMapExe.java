package com.collection.Contact;

import java.util.*;
import java.util.Map.Entry;
public class TreeMapExe{

public static void main(String[] args) {
	TreeMap<Number,Contact> tree=new  TreeMap<Number,Contact>();
	Number L1=new Number((long)969869198);
	Number L2=new Number((long)197349827);
	Number L3=new Number((long)583492788);
	Number L4=new Number((long)764288929);
	Number L5=new Number((long)863876879);
	
	Contact C1=new Contact("keerthana","keerthana@gmail.com","female");
	Contact C2=new Contact("nandhini","nandhini@gmail.com","female");
	Contact C3=new Contact("devi","devi@gmail.com","female");
	Contact C4=new Contact("lakshmi","lakshmi@gmail.com","female");
	Contact C5=new Contact("baru","baru@gmail.com","male");
	
	tree.put(L1, C1);
	tree.put(L2, C2);
	tree.put(L3, C3);
	tree.put(L4, C4);
	tree.put(L5, C5);
	
	Set<Entry<Number, Contact>> entryset=tree.entrySet(); 
	Iterator<Entry<Number,Contact>> i=entryset.iterator();
	while(i.hasNext()) {
		Map.Entry<Number, Contact> entry=(Map.Entry<Number, Contact>) i.next();
		Number l=entry.getKey();
		System.out.println(l);
		Contact C=entry.getValue();
		System.out.println(C);
		
	}
	
}
}