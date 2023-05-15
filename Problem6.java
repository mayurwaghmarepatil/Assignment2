package ineuron;

import java.util.Arrays;

public class Problem6 {
//to check array is subset of array
	public static void main(String[] args) {
		int[] A1= {45,65,13,11,9,85};
		int[] A2= {13,9,65};
		
		Arrays.sort(A1);
		Arrays.sort(A2);
		
		for(int j=0;j<A2.length;j++)
		{
			for(int i=0;j<A1.length;i++)
			{
				if(A2[j]==A1[i])
				{
					break;
					
				} if(i==A1.length)
				{
					System.out.println("false");
				}
				System.out.println("true");
				
			}
		}
		
	}

}
