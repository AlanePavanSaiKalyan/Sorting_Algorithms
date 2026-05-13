import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort_DivideAndConquer {
    //Divide and Conquer
    public void mergeSort(int[] a, int low,int high){
        if(low >= high) return;
        int mid = (low+high)/2;
        mergeSort(a,low,mid);
         mergeSort(a,mid+1,high);
         merge(a,low,mid,high);
    }
    public void merge(int []a,int low, int mid,int high){
        List<Integer> res = new ArrayList<>();
        int left = low;
        int  right = mid+1;
        while(left<=mid && right<=high){
            if(a[left]<a[right]){
                res.add(a[left]);
                left++;
            }
            else{
                res.add(a[right]);
                right++;
            }
        }
        while(left<=mid) {
            res.add(a[left++]);
        }
        while(right<=high){
            res.add(a[right++]);
        }
        for(int i= low;i<=high;i++){
            a[i] = res.get(i-low);
        }
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
        new MergeSort_DivideAndConquer().mergeSort(a,0,a.length-1);

        for(int i = 0; i<size;i++){
            System.out.print(a[i]+", ");
        }
    }
}
