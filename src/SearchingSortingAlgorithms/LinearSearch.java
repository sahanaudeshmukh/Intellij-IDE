package SearchingSortingAlgorithms;

public class LinearSearch {
     static int LinearSearch(int key,int[] arr){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }

    static void main(String[] args) {
        int[] arr={10,20,39,40,30};
        int key =30;

        int result=LinearSearch(key,arr);
        if(result!=-1){
            System.out.println("Element Found at index :"+result);
        }else{
            System.out.println("Elements was not found");
        }
    }
}


/* Time Complexity
Best Case:O(1)
Worst Case:O(n)
 */
