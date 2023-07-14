public class Main {
    public static void main(String[] args) {
        int [] arr  = {20, 9, 60, 5, 23,  30, 12, 16, 18, 55, 43 };

        //Util.bubbleSort(arr);
        //Util.selectionSort(arr);
        //Util.insertionSort(arr);
        //Util.quickSort(arr,  0, arr.length-1);
        //Util.heapSort(arr, arr.length);
        Util.mergeSort(arr, 0, arr.length-1);

        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
