public class Util {
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
}
