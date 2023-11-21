package com.oopsassignments.Employee;

public class Saving {
	 String name;
	    int money;



	   Saving (String name, int money)
	    {
	        this.name = name;
	        this.money = money;
	    }



	   public void fixeddeposit() {
	        System.out.println("money deposited is " + money);
	    }
	    public int totalMoney() { return money; }
	}
	class current {
	    String name;
	    int moneyc;



	   current(String name, int moneyc) {
	        this.name = name;
	        this.moneyc = moneyc;
	    }
	    public int cashcredit() {
	        System.out.println("money credited is " + moneyc);



	       return moneyc;
	    }
	    public int totalMoney() { return moneyc;}
}
