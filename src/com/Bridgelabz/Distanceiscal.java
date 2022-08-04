package com.Bridgelabz;

public class Distanceiscal {

	public static void main(String[] args) {
		

		/*
		 * equality of two line
		 * length greater line
		 */
		
		int x1=8;
		int x2=7;
		int y1=7;
		int y2=7;
		int x3=6;
		int x4=6;
		int y3=7;
		int y4=6;
		
		double distof1 =(Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2)));
		double distof2 =(Math.sqrt(Math.pow(x4-x3, 2)+Math.pow(y4-y3,2)));
		System.out.println("length of first line"+distof1);
		System.out.println("length of first line"+distof2);
		Integer a1=new Integer((int)distof1);
		Integer a2=new Integer((int)distof2);
		System.out.println("line are equal"+a1.equals(a2));
		if(a1.compareTo(a2)>0) {
			System.out.println("length of first line is greater");
		}else {
			System.out.println("length of second line greater");
		}
}
}
