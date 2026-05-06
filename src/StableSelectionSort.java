public class StableSelectionSort {
    // instead of swapping just find the index of the min element
    //store the min element in the temp
    //if min index>i
    //get the replace the min index element with min element -1 index element.
    //this shifts all the elements till i and create space for the min one
    public void sort(Pair []p){
        for(int i = 0;i<p.length-1;i++){
            int min  = i;
            for(int j = i+1;j<p.length;j++){
                if(p[min].key>p[j].key){
                    min = j;
                }
            }
            Pair temp = p[min];
            while(min > i){
                p[min] = p[min-1];
                min--;
            }
            p[min] = temp;
        }
    }

    static void main(String[] args) {
        Pair[] arr = {
                new Pair(2, 'A'),
                new Pair(1, 'B'),
                new Pair(2, 'C')
        };

        System.out.println("Before Sorting:");
        for (Pair p : arr) {
            System.out.print(p + " ");
        }

        new StableSelectionSort().sort(arr);

        System.out.println("\nAfter Sorting:");
        for (Pair p : arr) {
            System.out.print(p + " ");
        }
    }
}
