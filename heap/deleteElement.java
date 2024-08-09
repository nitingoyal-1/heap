//Implementation of delete a element in heap
public class deleteElement {
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
    static void deleteElement1(int arr[], int n) {
        if(n<=0){
            return;
        }
        arr[0]=arr[n-1];
        Heapify(arr,0, n);

    }

    public static void main(String[] args) {
        int arr[]={19,2,3,5,6,7,8};
        deleteElement1(arr, arr.length);
        //we take new array for removing last element in the arr[].
        int newArr[]=new int [arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            newArr[i]=arr[i];
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
    
}
