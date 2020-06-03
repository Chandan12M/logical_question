package com.chandan.logical;

public class A {
	//int num;
private static int i=0;
{
	i=5;
	
	System.out.println(i);
	System.out.println("1");
	//System.out.println(num);
	//num=10;
	//System.out.println(num);
}
static {
	System.out.println(i);
	System.out.println("2");
}
public static void main(String[] args) {
	System.out.println(i);
	new A();//cont call;
	A a=new A();//obj 
	System.out.println(i);
	//System.out.println(a.num);
}
}
