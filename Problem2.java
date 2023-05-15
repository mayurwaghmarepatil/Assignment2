package ineuron;
//quick sort
public class Problem2 {

	public static void main(String[] args) {
		int array[]={6,9,4,8,5,2,11};
		int i=0;
		int j=array.length-1;
		
		int len=array.length;
		Problem2 p2=new Problem2();
		p2.quickSortRecurtion(array, 0, len-1);
		p2.printArray(array);
		}
	int partition(int[] array,int i,int j)
	{
	int pivot=array[(i+j)/2];
		
		while(i<=j) {
			while(array[i]<pivot)
			{
				i++;
			}
			while(array[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				i++;
				j--;
			}
		}
		return i;

	}
	void quickSortRecurtion(int[] array,int i,int j)
	{
		int pi=partition(array,i,j);
		if(i<pi-1)
		{
			quickSortRecurtion(array,i,pi-1);
		}
		if(pi<j)
		{
			quickSortRecurtion(array,pi,j);
		}
	}
	void printArray(int[] array)
	{
		for(int x:array)
		{
			System.out.print(x+" ");
		}
	}

}
