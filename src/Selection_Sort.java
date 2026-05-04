import java.util.Scanner;

public class Selection_Sort {
    //This sorting algorithm sorts based on: Get the min element of array and sort with the initial index.
    //get the second min element and sort it with 1 st index it goes till n-2 with n-1 index element swapping to get sorted array
    //
    public void sort(int[]a){
        for(int i = 0;i<a.length-1;i++){
            int min = i;
            for(int j = i+1;j<a.length;j++){
                if(a[j]<a[min]) min = j;
            }
            int temp = a[i];
             a[i] = a[min];
            a[min] = temp;
        }
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size : ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        System.out.println("Elements ");
        for(int i = 0 ; i < a.length;i++){
            a[i] = scanner.nextInt();
        }
        new Selection_Sort().sort(a);
        for(int  i =0; i<a.length;i++){
            System.out.print(a[i]+ ", ");
        }
    }
}
