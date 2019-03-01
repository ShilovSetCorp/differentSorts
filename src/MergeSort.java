public class MergeSort extends Sort {
    public int[] sort(int[] arr, int leftStart, int rightEnd){
        if(leftStart >= rightEnd){
            return arr;
        }
        int middle = (leftStart + rightEnd) / 2;
        sort(arr, leftStart, middle);
        sort(arr, middle + 1, rightEnd);
        merge(arr, new int[arr.length], leftStart, rightEnd);

        return arr;
    }

    public void merge(int[] arr, int[] temp, int leftStart, int rightEnd){
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd){
            if(arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;
            }else{
                temp[index] = arr[right];
                right++;
            }
            index++;
        }

        System.arraycopy(arr, left, temp, index, leftEnd - left + 1);
        System.arraycopy(arr, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, arr, leftStart, size);
    }
}
