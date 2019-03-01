public class QuickSort extends Sort{

    @Override
    public int[] sort(int[] arr, int leftStart, int rightEnd) {
        int left = leftStart;
        int right = rightEnd;
        if(left >= right){
            return arr;
        }
        int pivot = arr[(left + right)/2];
        int index = partition(arr, leftStart, rightEnd, pivot);
        sort(arr,left, index - 1);
        sort(arr, index, right);
        return arr;
    }

    @Override
    public void merge(int[] arr, int[] temp, int leftStart, int rightEnd) {}

    public int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right){
            while (arr[left] < pivot){
                left++;
            }

            while (arr[right] > pivot){
                right--;
            }

            if(left <= right){
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private void swap(int[] arr, int left, int right){
        int buf = arr[left];
        arr[left] = arr[right];
        arr[right] = buf;
    }

}
