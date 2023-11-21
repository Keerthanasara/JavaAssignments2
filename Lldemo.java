package com.collection.Contact;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lldemo {
public static void main(String[] args) {
	LinkedList<DateandMessage> ll=new LinkedList<DateandMessage>();
	DateandMessage ddmsg=new DateandMessage(6-12-2000,"it is not a leap year");
	DateandMessage ddmsg1=new DateandMessage(7-9-2002,"it is not a leap year");
	DateandMessage ddmsg2=new DateandMessage(19-8-2004,"it is  a leap year");
	DateandMessage ddmsg3=new DateandMessage(16-1-2006,"it is not a leap year");
	DateandMessage ddmsg4=new DateandMessage(6-2-2000,"it is  a leap year");
	ll.add(ddmsg);
	ll.add(ddmsg1);
	ll.add(ddmsg2);
	ll.add(ddmsg3);
	ll.add(ddmsg4);
	ListIterator<DateandMessage> iter=ll.listIterator(ll.size());
	System.out.println("The reverse direction:");
	while(iter.hasPrevious()){
		System.out.println(iter.previous());
		
		}
	
}
}
