package ARRAY;

import java.util.Arrays;

public class BinaryClass {
    public static int binarySearch(int arr[], int target) {
        int arrLeft = 0, arrRight = arr.length - 1;
        // Arrays.sort(arr);
        while (arrLeft <= arrRight) {
            int mid = arrLeft + (arrRight - arrLeft) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                arrLeft = mid + 1;
            else    
                arrRight=mid-1;
        }
        return -1;

    }
    public static void main(String[] args) {
        int target = 20;

        int arr1[] = {4,2,10,3,20};
        Arrays.sort(arr1);
       
       
        System.out.println("length of array is : "+arr1.length);

        int result = binarySearch(arr1, target);
       
       
        if (result == -1)
            System.out.println("element not found");
        else
            System.out.println("element found at index: " + result);
    }
}