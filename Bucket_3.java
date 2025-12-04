import java.util.ArrayList;

public class Bucket_3 {
    public void minMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public void filter(int threshold, int[] arr) {
        ArrayList<Integer> belowThreshold = new ArrayList<>();
        ArrayList<Integer> aboveThreshold = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < threshold) {
                belowThreshold.add(arr[i]);
            } else if (arr[i] > threshold) {
                aboveThreshold.add(arr[i]);
            }
        }
    }

    public int binarySearch(int target, int[] arrr) {
        int LOW = 0;
        int HIGH = arrr.length - 1;
        while (LOW <= HIGH) {
            int MID = (LOW + HIGH) / 2;
            if (arrr[MID] == target) {
                return MID;
            } else if (arrr[MID] < target) {
                LOW = MID + 1;
            } else {
                HIGH = MID - 1;
            }
        }
        return -1;
    }

    public int occurrences(int[] arr, int target) {
        int cntr = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == target) {
                cntr++;
            }
        }
        return cntr;
    }

    public int[] BubbleSort(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 0; i < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public double mean(int[] DATA) {
        double sum = 0;
        for (int i = 0; i < DATA.length - 1; i++) {
            sum = sum + DATA[i];
        }
        return sum / DATA.length - 1;
    }

    public int mcv(int[] DATA) {
        int[] sortedArr = BubbleSort(DATA);
        int MID = sortedArr.length / 2;
        int median = 0;
        if (MID / 2 == 0) {
            median = (sortedArr[MID] + sortedArr[MID - 1]) / 2;
            return median;
        } else if (MID / 2 != 0) {
            return sortedArr[MID];
        }
        return -1;
    }

    public void frequencyCntr(int[] DATA) {
        int[] frequency = new int[DATA.length - 1];
        for (int i = 0; i < DATA.length - 1; i++) {
            frequency[DATA[i]]++;
        }
    }

    public void selectionSortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    public static void main(String[] args) {

    }

}
