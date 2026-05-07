public class Bubble_Sort {
    //Works on principle pushing the max to the last by adjacent swapping.
    //0-n-1,0-n-2,0-n-3...0-1
    // worst and average case = O(n^2)
    // best case O(n) if array is already sorted
    public void sort(int []a){

        for(int i = 0;i<a.length;i++){
            boolean swapped  = false;
             for(int j = 0;j<a.length-i-1;j++){
                 if(a[j]>a[j+1]){
                     int temp = a[j];
                     a[j] = a[j+1];
                     a[j+1] = temp;
                     swapped = true;
                 }
             }
            if(swapped == false){
                break;
            }
        }
    }

   public static void main(String[] args) {
        int a[] = new int[]{45,4,32,6,745,1};
        new Bubble_Sort().sort(a);
        for(int i = 0;i<a.length ;i++){
            System.out.print(a[i]+", ");
        }

    }
}
