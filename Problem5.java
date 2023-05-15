package ineuron;
//Selection sort
public class Problem5 {

	public static void main(String[] args) {
		int[] a1= {12,65,4,8,2,38,52,9};
		
		int min,temp=0;
		
		for(int i=0;i<a1.length;i++)
		{
			min=i;
			for(int j=i+1;j<a1.length;j++)
			{
				if(a1[j]<a1[min])
				{
					min=j;
				}
			}
			temp=a1[i];
			a1[i]=a1[min];
			a1[min]=temp;
		}
        for(int i=0;i<a1.length;i++)
          {
	         System.out.print(a1[i]+" ");
          }
	}

}
