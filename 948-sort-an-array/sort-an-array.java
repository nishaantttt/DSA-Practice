class Solution {
    public int[] sortArray(int[] arr) {
        int n = arr.length;
        while(n<2){
            return arr;
        }
        int mid = n/2;
        int[] leftarr = new int[mid];
        int[] rightarr = new int[n-mid];
        for(int i = 0 ; i<mid ; i++){
            leftarr[i]=arr[i];
        }
        for(int i = mid ; i<n ; i++){
            rightarr[i-mid]=arr[i];
        }
        sortArray(leftarr);
        sortArray(rightarr);
        merge(arr,leftarr,rightarr);
        return arr;
    }
    public static void merge(int[] arr,int[] leftarr,int[] rightarr) {
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        while(i<leftarr.length && j<rightarr.length){
            if(leftarr[i]<=rightarr[j]){
                arr[k++]=leftarr[i++];
            }
            else{
                arr[k++]=rightarr[j++];
            }
        }
        while(i<leftarr.length){
            arr[k++] = leftarr[i++];
        }
        while(j<rightarr.length){
            arr[k++] = rightarr[j++];
        }


    }


}