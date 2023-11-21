package com.oopsassignments.Employee;
import java.util.Scanner;

abstract class DessertItem
	{
	    abstract void getCost();
	    abstract void addItem(int number,int addnumber);

	}
	class Candy extends DessertItem
	{
	    int cost;
	    int number;
	    int tax;
	    Candy(int cost,int tax) {
	        this.cost=cost;
	        this.tax=tax;
	    }
	    void getCost()

	    {
	        cost=cost+tax;
	        System.out.println("cost of cookie is "+cost+ "along with the tax "+tax);
	    }
	    void addItem(int number,int addnumber)
	    {
	        System.out.println("available candies are"+number+"candy's added"+addnumber);
	    }
	}
	class Cookie extends DessertItem
	{
	    int cost;
	    int number;
	    int tax;
	    Cookie(int cost,int tax)
	    {
	        this.cost=cost;
	        this.tax=tax;
	    }
	    void getCost()

	    {
	        cost=cost+tax;
	        System.out.println("cost of cookie is "+cost+ "along with the tax "+tax);
	    }
	    void addItem(int number,int addnumber)
	    {

	        System.out.println("available cookies are"+number+"cookie's added"+addnumber);
	    }

	}
	class IceCream extends DessertItem
	{
	    int cost;
	    int number;
	    int tax;
	    IceCream(int cost,int tax)
	    {
	        this.cost=cost;
	        this.tax=tax;
	    }
	    void getCost()

	    {
	        cost=cost+tax;
	        System.out.println("cost of icecream is "+cost+ "along with the tax "+tax);
	    }
	    void addItem(int number,int addnumber)
	    {

	        System.out.println("available icecreams are"+number+"icecreams's added"+addnumber);
	    }
	}
	class Owner
	{
	    void addItem()
	    {
	        System.out.println("Adds items  to the list");
	    }

	}
	class Customer {
	    String[] a = new String[]{"icecream", "candie", "cookie"};

	    void Order() {
	        System.out.println("pick your order from the list");
	        for (int i = 0; i < a.length; i++)
	          System.  out.println(a[i]);
	    }
	}
	public class DesertShop {
	    public static void main(String[] args) {
	        String q="owner" ;
	        String p="customer";
	        Scanner s=new Scanner(System.in);
	       System. out.println("enter your state");
	        String State = s.next();
	        Owner o=new Owner();
	        Customer c=new Customer();
	        Candy k=new Candy(60,1);
	        Cookie k1=new Cookie(70,5);
	        IceCream k2=new IceCream(60,2);
	        if(State.equals(q))
	        {
	            k.addItem(100,50);
	            k1.addItem(200,70);
	            k2.addItem(300,100);
	        }
	        if(State.equals(p))
	        {
	            c.Order();
	            k.getCost();
	            k1.getCost();
	            k2.getCost();
	        }
	    }
	}





	