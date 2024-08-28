import java.util.Arrays;

public class InsertionSortDemo{

	public static int pivot;
	
	public static void main(String[] args) {
		int[] unsortedArray = new int[14];

		int arrLen = unsortedArray.length;
		for (int i=0; i < arrLen; i++)
			unsortedArray[i] = (int)(Math.random()*100);

		System.out.println("initial unsorted Array: "+ Arrays.toString(unsortedArray));

		for(int i=0; i < arrLen; i++){
			int selectedValue = unsortedArray[i];
			int selectedIndex = i;
			for(int j=i-1; j>=0; j--){
				if(unsortedArray[j]>selectedValue){
					swap(unsortedArray,j,selectedIndex);
					selectedIndex=j;
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