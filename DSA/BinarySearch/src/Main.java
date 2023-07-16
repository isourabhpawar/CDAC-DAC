
public class Main {

 public static int binarySearch(int [] arr, int key) {

        int low = 0, high = arr.length - 1;
        int mid;

        while(low <= high) {
            mid = (low + high) / 2;

            if(arr[mid] == key) {
                return mid;
            }

            if(key < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int [] arr, int low, int high, int key) {
        if(low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if(key == arr[mid]) {
            return mid;
        }

        if(key < arr[mid]) {
            return binarySearch(arr, low, mid - 1, key);
        }
        return binarySearch(arr, mid + 1, high, key);
    }


    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(binarySearch(arr, 10));
        System.out.println(binarySearch(arr, 50));
        System.out.println(binarySearch(arr, 90));
        System.out.println(binarySearch(arr, 100));
        System.out.println(binarySearch(arr, 25));
        System.out.println(binarySearch(arr, -12));

        System.out.println();

        System.out.println( binarySearch(arr, 0, arr.length-1, 10));
        System.out.println( binarySearch(arr, 0, arr.length-1, 50));
        System.out.println( binarySearch(arr, 0, arr.length-1,90));
        System.out.println(binarySearch(arr, 0, arr.length-1,100));
        System.out.println( binarySearch(arr, 0, arr.length-1,25));
        System.out.println(binarySearch(arr, 0, arr.length-1,-12));


    }
}
