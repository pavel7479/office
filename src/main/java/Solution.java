import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Solution {
    public static int[] sort1(int[] arr) {
        int tempo;
        boolean yes = false;
        for (int IN = arr.length-1; IN > 0; IN--) {
            for (int j = 0; j < IN; j++) {
                if (arr[j] > arr[j + 1]) {
                    tempo = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempo;
                }
            }
        }
        return arr;
    }
    public static int[] sort2(int[] arr) {
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {10,8,-9,0,66,69,-4,13,7,-58,12,0};
        for (int i : sort2(arr)) {
            System.out.print(i + ", ");
        }
    }
}