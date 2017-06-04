import java.util.LinkedList;

public class Sortingalgorithms {

    //This executes selection sort
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index])
                    index = j;
                }
                int smallerNumber = arr[index];
                arr[index] = arr[i];
                arr[i] = smallerNumber;
                for (int num : arr) {
                    System.out.print(num);
                    System.out.print(", ");
                }
                System.out.println("");
            }
        return arr;
    }


    //Implementation of BubbleSort
    public static int[] bubbleSort(int[] arr) {
        boolean swap =  false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                int smallValue = arr[i + 1];
                int bigValue = arr[i];
                arr[i] = smallValue;
                arr[i + 1] = bigValue;
                swap = true;
                for (int num : arr) {
                    System.out.print(num);
                    System.out.print(", ");
                }
                System.out.println("");
            }
        }


        while (swap) {
            swap = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    int smallValue = arr[i + 1];
                    int bigValue = arr[i];
                    arr[i] = smallValue;
                    arr[i + 1] = bigValue;
                    swap = true;
                    for (int num : arr) {
                        System.out.print(num);
                        System.out.print(", ");
                    }
                    System.out.println("");
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 34, 2, 8, 44, 1};
        int[] arr2 = bubbleSort(arr1);
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");
        }


    }
}
