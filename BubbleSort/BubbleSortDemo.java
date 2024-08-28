import java.util.Arrays;

public class BubbleSortDemo{

	public static int pivot;
	
	public static void main(String[] args) {
		int[] unsortedArray = new int[14];

		int arrLen = unsortedArray.length;
		for (int i=0; i < arrLen; i++)
			unsortedArray[i] = (int)(Math.random()*100);

		System.out.println("initial unsorted Array: "+ Arrays.toString(unsortedArray));

		for(int i=0; i < arrLen; i++){
			for(int j=0; j<arrLen-i; j++){
				if(j+1<arrLen && unsortedArray[j]>unsortedArray[j+1]){
					swap(unsortedArray,j,j+1);
				}
			}
		}

		System.out.println("final sorted Array: "+ Arrays.toString(unsortedArray));
	}

	public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}