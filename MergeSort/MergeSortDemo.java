import java.util.Arrays;

public class MergeSortDemo{
	
	public static void main(String[] args) {
		int[] unsortedArray = new int[14];
		for (int i=0; i < unsortedArray.length; i++)
			unsortedArray[i] = (int)(Math.random()*100);

		System.out.println("initial unsorted Array: "+ Arrays.toString(unsortedArray));

		int[] sortedArr = mergesort(unsortedArray);

		System.out.println("final sorted Array: "+ Arrays.toString(sortedArr));
	}

	public static int[] mergesort(int unsortedArray[]){
		int n = unsortedArray.length;
		if(n<2) return unsortedArray;

		int firstHalfLength = (int)n/2;
		int[] leftArray = new int[firstHalfLength];

		int secondHalfLength = (int)(n-n/2);
		int[] rightArray = new int[secondHalfLength];

		for(int i=0; i<firstHalfLength; i++){
			leftArray[i] = unsortedArray[i];
		}


		for(int i=0; i<secondHalfLength; i++){
			rightArray[i] = unsortedArray[(firstHalfLength+i)];
		}

		mergesort(leftArray);
		mergesort(rightArray);

		System.out.println("left Array: "+ Arrays.toString(leftArray));
		System.out.println("right Array: "+ Arrays.toString(rightArray));

		int[] sortedArr = merge(leftArray, rightArray, unsortedArray);

		System.out.println("sorted Array: "+ Arrays.toString(sortedArr));

		return unsortedArray;
	}

	public static int[] merge(int[] leftArray, int[] rightArray, int[] unsortedArray){
		int length = leftArray.length;
		if(leftArray.length > rightArray.length)
			length = rightArray.length;

		// int length = unsortedArray.length;

		int l=0;
		int r=0;
		int i=0;
		while(l<leftArray.length && r<rightArray.length)
		{
			if(leftArray[l]<=rightArray[r]){
				unsortedArray[i] = leftArray[l];
				l++;
			} else { //if(leftArray[l]>rightArray[r])
				unsortedArray[i] = rightArray[r];
				r++;
			}
			i++;
		}

		while(l<leftArray.length){
			unsortedArray[i] = leftArray[l];
			l++;
			i++;
		}

		while(r<rightArray.length){
			unsortedArray[i] = rightArray[r];
			r++;
			i++;
		}


		return unsortedArray;
	}
}