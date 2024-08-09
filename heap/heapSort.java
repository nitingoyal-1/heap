//Implementation of Heap sort.

public class heapSort {
    static void swap(int arr[],int r,int min){
        int temp=arr[r];
        arr[r]=arr[min];
        arr[min]=temp;
    }
    static void Heapify(int arr[],int r,int n){
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
            Heapify(arr, min, n);
        }

    }
    static void buildHeap(int arr[],int n){
        for(int i=n/2;i>=0;i--){
            Heapify(arr,i,n);
        }
    }
    static void heapSort1(int arr[], int n) {
        buildHeap(arr, n);
        for (int i = n - 1; i >= 0; i--) {
            swap(arr, 0, i);
            Heapify(arr, i, arr.length);
        }
    }

    public static void main(String[] args) {
        int arr[]={19,2,3,5,6,7,8};
        heapSort1(arr, arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
