package activities;

public class Activity9_Abainza {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		System.out.println("Sum of elements in 1D aray: " + calculateSum(arr1));
		
		int[] arr2 = {51, 12, 35, 42, 50};
        System.out.println("Max value in 1D array: " + findMax(arr2));

        int[][] arr3 =  {{1,10}, {99,12}, {3,2}, {4,7,51}, {5,45,50}};
        System.out.println("Sum of elements in 2D array: " + calculateSum2D(arr3));
        
        int elem = 11;
        boolean res = findElem(arr3, elem);
        if(res == true) {
        	System.out.println(elem + " found in array");
        }
        else {
        	System.out.println(elem + " not found in array");
        }
	}
	
	public static int calculateSum(int[] arr) {
		int sum = 0;
		for(int num : arr) {
			sum+=num;
		}
		
		return sum;
	}
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int num : arr) {
			if(num > max) {
				max = num;
			}
		}
		return max;
	}
	
	public static int calculateSum2D(int[][] arr) {
		int sum = 0;
		for(int[] row: arr) {
			for(int num: row) {
				sum+=num;
			}
		}
		return sum;
	}
	
	public static boolean findElem(int[][] arr, int elem) {
		boolean res = false;
		for(int[] row: arr) {
			for(int num: row) {
				if(num == elem) {
					res = true;
				}
			}
		}
		return res;
	}
	

}
