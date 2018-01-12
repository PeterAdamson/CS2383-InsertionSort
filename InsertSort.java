//Author Peter Adamson

public class InsertSort
{
	public static void main(String[] args)
	{
		int[] A = {7, 4, 8, 2, 5, 3, 9};
		sort(A);	//sorts A using insertion sort
		show(A);	// display the sorted result A
	}

	public static void sort(int[] A)
	{
		for(int i=0; i < A.length; i++)
		{
			int insertVal = A[i];
			int pos = i;
			while(pos > 0 && A[pos-1] > insertVal)	//loops while position has not reached zero and the value before position is greater than the insert value
			{
				A[pos] = A[pos-1];
				pos -= 1;
			}
			A[pos] = insertVal;
		}	
	}

	public static void show(int[] A)
	{
		for(int i=0; i < A.length; i++)		//prints out an array of integers
		{
			System.out.println(A[i]);
		}
	}

}
