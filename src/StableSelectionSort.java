public class StableSelectionSort {
    // instead of swapping just find the index of the min element
    //store the min element in the temp
    //if min index>i
    //get the replace the min index element with min element -1 index element.
    //this shifts all the elements till i and create space for the min one
    public void sort(Pair []a){
      for(int i = 0;i<a.length-1;i++){
          int minindex = i;
          for(int j = i+1;j<a.length;j++){
              if(a[minindex].key>a[j].key){
                  minindex = j;
              }
          }
          Pair min = a[minindex];
          while(minindex>i){
              a[minindex] = a[minindex-1];
              minindex --;
          }
          a[i] = min;

      }
    }

    static void main(String[] args) {
        Pair[] arr = {
                new Pair(1, 'A'),
                new Pair(2, 'A'),
                new Pair(1, 'B'),
                new Pair(1, 'C')
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
