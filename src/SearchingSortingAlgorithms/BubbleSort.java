package SearchingSortingAlgorithms;

public class BubbleSort {
    static void  BubbleSort(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void main(String[] args) {
    int[] arr={5,3,8,4,6};
        BubbleSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
