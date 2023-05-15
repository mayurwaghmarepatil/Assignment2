package ineuron;
//merge sort
public class Problem4 {
	public static void conquer(int[] arr, int si, int mid, int ei)
	{
		int merger[]=new int[ei-si+1];
		
		int idx1=si;
		int idx2=mid+1;
		int x=0;
		
		while(idx1 <= mid && idx2 <= ei)
		{
			if(arr[idx1] <= arr[idx2]) 
			{
				merger[x++]=arr[idx1++];
			}else 
			{
				merger[x++]=arr[idx2++];
			}
		}
		while(idx1 <= mid)
		{
			merger[x++]=arr[idx1++];
		}
		while(idx2<=ei) 
		{
			merger[x++]=arr[idx2++];
		}
		for(int i=0,j=si;i<merger.length;i++,j++)
		{
			arr[j]=merger[i];
		}
	}
	public static void divide(int arr[],int si,int ei)
	{
		if(si>=ei)
		{
			return;
		}
		int mid=si+(ei-si)/2;
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		conquer(arr, si,mid,ei);
	}
	public static void main(String[] args)
	{
		int[] arr= {41,54,85,75,16};
		int len=arr.length;
		
		divide(arr,0,len-1);
		
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
