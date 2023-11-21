package com.oopsassignments.Employee;

public class SingleTone {
	 static SingleTone st=new SingleTone();
     private SingleTone(){
         System.out.println("constructor will invoke only one object");
     }
     static SingleTone getInstance()
     {
         return st;
     }
 }
 class Test
 {
     public static void main(String args[])
     {
         SingleTone st1= SingleTone.getInstance();
         SingleTone st2= SingleTone.getInstance();
         System.out.println(st1);
         System.out.println(st2);
     }
}
