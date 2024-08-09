//Implementation of min heap.
public class minHeap {
    static void swap(int arr[],int r,int min){
        int temp=arr[r];
        arr[r]=arr[min];
        arr[min]=temp;
    }
    static void minHeap1(int arr[],int r,int n){
        if(r>=n){
            return;
        }
        int min=r;
        if((2*r+1)<n && arr[min]>arr[(2*r)+1]){
            min=(2*r)+1;
        }
        if((2*r+2)<n && arr[min]>arr[(2*r)+2]){
            min=(2*r)+2;
        }
        if(min!=r){
            swap(arr,r,min);
            minHeap1(arr, min, n);
        }

    }
    public static void main(String[] args) {
        int arr[]={19,2,3,5,6,7,8};
        minHeap1(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
