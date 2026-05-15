import java.util.Scanner;

public class QuickSort_DivideAndConquer {

   public void sort(int[] a, int low, int high){
       if(low<high){
           int pivot = partition(a,low,high);
           sort(a,low,pivot-1);
           sort(a,pivot+1,high);
       }
   }

   public int partition(int []a,int low,int high){
       int pivot = a[low];
       int i = low;
       int j= high;
       while(i<j){
           while(a[i]<=pivot && i<high){
               i++;
           }
           while(a[j]>pivot && j>low){
               j--;
           }
           if(i<j){
               swap(a,i,j);
           }
       }
       swap(a,low,j);
       return j;
   }

   public void swap(int []a,int i,int j){
       int temp = a[i];
       a[i] = a[j];
       a[j] = temp;
   }


    static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] a = new int[size];
        System.out.println("Enter Elements:");
        for(int  i = 0;i<size;i++){
            a[i] = scanner.nextInt();
        }
        new QuickSort_DivideAndConquer().sort(a,0,a.length-1);

        for(int i = 0; i<size;i++){
            System.out.print(a[i]+", ");
        }
    }
}
