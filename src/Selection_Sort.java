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

    public void sortDesc(int[] a){
        for(int i = 0;i<a.length-1;i++){
            int max = i;
            for(int j = i+1; j<a.length;j++){
                if(a[max]<a[j]) max = j;
            }
            int temp = a[max];
            a[max] = a[i];
            a[i] = temp;
        }
    }

    public int totalSwaps(int[] a){
        int swaps = 0;
        for(int i = 0;i<a.length-1;i++){
            int min = i;
            for(int j = i+1;j<a.length;j++){
                if(a[min]>a[j]) {
                    min = j;
                }
            }
           if(min != i) {
               swaps++;
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    return  swaps;
    }

    public void kthSmallestElement(int []a,int k){
        for(int i = 0;i<k;i++){
            int min  = i;
            for(int j = i+1;j<a.length;j++){
                if(a[min]>a[j]) min = j;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        System.out.println(a[k-1]);
    }

    public void sortOnlyK(int[]a, int k){
        if(k <= 0 || k > a.length) return;
        for(int i = 0;i < k ;i++){
            int min = i;
            for(int j = i+1;j<a.length;j++){
                if(a[j]<a[min]) min  = j;
            }
            if(min != i){
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    }

    public void compareLexicographically(String []ele){
        for(int i= 0;i<ele.length-1;i++){
            int min  = i;
            for(int j = i+1;j<ele.length;j++){
                if(ele[min].compareToIgnoreCase(ele[j]) > 0){min = j;
                }
            }
            if(min != i){
                String temp = ele[i];
                ele[i] = ele[min];
                ele[min] = temp;
            }
        }
    }

    public void sortPairs(int []a){

    }

    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Size : ");
//        int size = scanner.nextInt();
//        int[] a = new int[size];
//        System.out.println("Elements ");
//        for(int i = 0 ; i < a.length;i++){
//            a[i] = scanner.nextInt();
//        }
//        new Selection_Sort().sortOnlyK(a,3);
//        for(int  i =0; i<a.length;i++){
//            System.out.print(a[i]+ ", ");
//        }
        String str[] = new String[]{"banana","apple","mango"};
        new Selection_Sort().compareLexicographically(str);
        for(int i = 0;i<str.length;i++){
            System.out.print(str[i]+", ");
        }
    }
}
