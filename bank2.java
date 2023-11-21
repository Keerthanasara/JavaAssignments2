package com.oopsassignments.Employee;

public class bank2 {
	 public static void main(String[] args) {
	        Saving s=new Saving( "SU" ,  1000);
	        s.fixeddeposit();
	        int p=s.totalMoney();
	        current c=new current( "SV",  2000);
	        c.cashcredit();
	        int d=c.totalMoney();
	        int y=p+d;
	        System.out.println("Total money in the bank is"+y);
	    }
}
