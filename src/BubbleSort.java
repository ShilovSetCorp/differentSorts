public class BubbleSort {
    public int[] sort(int[] arr){
        boolean isSorted = false;
        int lastUnsorted = arr.length - 1;
        while (!isSorted){
            isSorted = true;
            for(int i = 0; i < lastUnsorted; i++){
                if(arr[i] > arr[i + 1]){
                    swap(arr, i, i+1);
                    isSorted = false;
                }
            }
        }
        return arr;
    }

    private void swap(int[] arr, int left, int right){
        int buf = arr[left];
        arr[left] = arr[right];
        arr[right] = buf;
    }

}
