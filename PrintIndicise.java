package recursion;

public class PrintIndicise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,4,5,1,3,1,1,1};
		int[]result=null;
		result=printAllIndecies(arr,0,1,0);
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
	}
	public static int[] printAllIndecies(int []arr,int si,int data,int count) {
		if(si==arr.length)
		{
			int[] base=new int[count];
			return base;
		}
		int []index=null;
		if(arr[si]==data)
			index=printAllIndecies(arr,si+1,data,count+1);
		else
			index=printAllIndecies(arr,si+1,data,count);
		if(arr[si]==data)
			index[count]=si;
		return index;
	}

}
