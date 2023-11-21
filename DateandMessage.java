package com.collection.Contact;
import java.text.SimpleDateFormat;
import java.util.*;
public class DateandMessage implements Comparable<DateandMessage> {
	
Integer Date;	    
String msg;
private int date;
public DateandMessage(int i, String msg) {
	super();
	this.date = i;
	this.msg = msg;
}
public Integer getDate() {
	return date;
}
public void setDate(int date) {
	this.date = date;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public String toString() {
	return "DateandMessage[date="+date+",msg="+msg+"]";
}
@Override
public int compareTo(DateandMessage o) {
	// TODO Auto-generated method stub
	return this.getDate().compareTo(o.getDate());
}

}
