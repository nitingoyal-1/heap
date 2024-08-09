//Implementation of insert a element in heap

import java.util.Scanner;

public class insertElement {
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
        for(int i=n/2-1;i>=0;i--){
            Heapify(arr,i,n);
        }
    }
    static void insertElement1(int arr[], int n,int val) {
        arr[n] = val;
        int i=n; 
        while(i>0 && arr[i] < arr[(i-1)/2]) 
        { 
            swap(arr, i, (i-1)/2); 
            i = (i-1)/2; 
        } 
    }
 
        
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [9];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        buildHeap(arr, arr.length-1);
        insertElement1(arr, arr.length-1,val);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

