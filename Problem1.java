package ineuron;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the size of array");
		int num=sc1.nextInt();
		int[] a1=new int[num];
		System.out.println("user please enter the values");
		for(int i=0;i<num;i++) {
			a1[i]=sc1.nextInt();
			
		}
		        for (int i = 0; i <= a1.length - 1; i++) {
		            for (int j = i + 1; j < a1.length; j++) {
		                if (a1[i] == a1[j]) {
		                    System.out.println(a1[i] +" is the duplicate value in the array ");
		                }
		            }
		        }
		    }}

	
