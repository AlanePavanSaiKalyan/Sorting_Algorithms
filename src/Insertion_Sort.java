public class Insertion_Sort {
    // The terminology is loop the i to the array length and take each element and place it where it belongs
    //Time complexity best case : O(n)
    //Time complexity worst and average : O(n^2) because if array has 5,4,3,2,1 first iteration 0, second 1 swap,third 2...n(n+1)/2 =n^2

    public void sort(int a[]){
        for(int i = 0;i<a.length;i++){
            int j = i;
            // j>o because we compare the index i element with its prev element
            // if prev is greater swap ..next again compare the same element with its prev and swap if need.
            //this pattern repeats till the element that we grabbed is gets its actual position.
            while(j>0 && a[j-1]>a[j]){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }

        }
    }

    static void main(String[] args) {
        int []a = new int[]{6,5,4,3,2,1};
        new Insertion_Sort().sort(a);
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+", ");
        }
    }
}
