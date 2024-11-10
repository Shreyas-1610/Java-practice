public class Solution {
        public static void quickSort(int[] input,int startIndex, int endIndex) {
            if(startIndex < endIndex){
                int pivot = partition(input, startIndex, endIndex);
                quickSort(input, startIndex, pivot - 1);
                quickSort(input, pivot + 1, endIndex);
            }
        }
        public static int partition(int[] arr, int low, int high) {
            int pivot = arr[low], i = low, j = high;
    
            while (i < j) {
                while (arr[i] <= pivot && i < high) i++;
                while (arr[j] >= pivot && j > low) j--;
                if (i < j) swap(arr, i, j);
            }
            swap(arr, low, j);
            return j;
        }
        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
            public static void main(String[] args) {
                int[] arr = {7, 2, 1, 6, 8, 5, 3, 4, 1}; // Example array to be sorted
                
                // Call quickSort method to sort the array
                quickSort(arr, 0, arr.length - 1);
        
                // Print the sorted array
                System.out.println("Sorted Array:");
                for (int num : arr) {
                    System.out.print(num + " ");
                }
            }
        
            // Paste the quickSort, partition, and swap methods here
        }
