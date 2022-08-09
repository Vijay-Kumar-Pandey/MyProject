
public class BubbleSort {
	
	    static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        int temp = 0;
	        for(int i=0; i < n; i++){
	            for(int j=1; j < (n-i); j++){
	                if(arr[j-1] > arr[j]){
	                    //swap elements
	                    temp = arr[j-1];
	                    arr[j-1] = arr[j];
	                    arr[j] = temp;
	                }

	            }
	        }

	    }
	    public static void main(String[] args) {
	        int arr[] ={5, 3, 2, 4, 1, 9 , 7, 6, 8};

	        System.out.println("Initial set of Numbers or Array Before Bubble Sort");
	        for(int i=0; i < arr.length; i++){
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();

	        bubbleSort(arr);//sorting array elements using bubble sort

	        System.out.println("Final Set of Numbers or Array After Bubble Sort");
	        for(int i=0; i < arr.length; i++){
	            System.out.print(arr[i] + " ");
	        }

	    }

	}
