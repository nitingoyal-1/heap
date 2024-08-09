// Implementation of max heap.
public class maxHeap{
    static void swap(int []arr,int r,int max){
        int temp=arr[r];
        arr[r]=arr[max];
        arr[max]=temp;
    }
    static void maxHeap1(int arr[],int r,int n){
        if(r>=n){
            return;
        }
        int max=r;
        if((2*r+1)<n && arr[max]<arr[(2*r)+1]){
            max=(2*r)+1;
        }
        if((2*r+2)<n && arr[max]<arr[(2*r)+2]){
            max=(2*r)+2;
        }
        if(max!=r){
            swap(arr,r,max);
            maxHeap1(arr, max,n);
        }

    }

    public static void main(String[] args) {
        int arr[]={2,12,13,4,3,5,6};
        maxHeap1(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}