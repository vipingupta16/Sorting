import java.util.Arrays;

public class QuickSortDemo{

	public static int pivot;
	
	public static void main(String[] args) {
		int[] unsortedArray = new int[14];
		for (int i=0; i < unsortedArray.length; i++)
			unsortedArray[i] = (int)(Math.random()*100);

		System.out.println("initial unsorted Array: "+ Arrays.toString(unsortedArray));

		int start = 0;
		int end = unsortedArray.length-1;
		int[] sortedArr = quicksort(unsortedArray, start, end);

		System.out.println("final sorted Array: "+ Arrays.toString(sortedArr));
	}

	public static int[] quicksort(int unsortedArray[], int start, int end){

		if(end>start){
			pivot=end; 
			// randomPivot(0,unsortedArray.length);
			// if(pivot>=unsortedArray.length) pivot=unsortedArray.length-1;
			// else swap(unsortedArray,pivot,unsortedArray.length-1);
			System.out.println("pivot value is: "+unsortedArray[pivot]); //pivot index is: "+pivot+", 

			partition(unsortedArray, start, end);
			System.out.println("\n sorted Array: "+ Arrays.toString(unsortedArray));

			quicksort(unsortedArray, start, pivot-1); //left array
			quicksort(unsortedArray, pivot+1, end); //right array
		}
		return unsortedArray;
	}

	public static int[] partition(int[] unsortedArray, int start, int end){

		int pIndex = start;

		if(end>start){
			for(int i=start; i<end; i++)
			{
				if(unsortedArray[i]<=unsortedArray[pivot])
				{
					swap(unsortedArray, i, pIndex);
					pIndex++;
				}
			}
			swap(unsortedArray, pivot, pIndex);
			pivot = pIndex;
		}

		return unsortedArray;
	}

	public static int randomPivot(int start, int end) {
		pivot = (int)(Math.random()*(end - start + 1)) + start;
		return pivot;
	}

	public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}