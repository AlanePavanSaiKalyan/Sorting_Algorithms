public class SortingSentence {
//
//    A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
//
//    A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
//
//    For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
//    Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
//
//
//
//            Example 1:
//
//    Input: s = "is2 sentence4 This1 a3"
//    Output: "This is a sentence"
//    Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
//    Example 2:
//
//    Input: s = "Myself2 Me1 I4 and3"
//    Output: "Me Myself and I"
//    Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.


    public String sortSentence(String s) {

        //Using Selection sort 3ms
        // String a[] = s.split(" ");
        // for(int i = 0;i<a.length-1;i++){
        //     int min = i;
        //     for(int j = i+1;j<a.length;j++){
        //         if(a[min].charAt(a[min].length()-1) > a[j].charAt(a[j].length()-1)){
        //             min = j;
        //         }
        //     }
        //     if(min>i){String temp = a[min];
        //     a[min] = a[i];
        //     a[i] = temp;
        //     }
        // }
        //   String res="";
        // for(int j = 0;j<a.length;j++){
        //      String word = a[j].substring(0, a[j].length() - 1);
        //     if(j == a.length-1){
        //         res+=word;
        //     }
        //    else res += word+" ";
        // }
        // return res;
        //1 ms without selection sort
        String []str = s.split(" ");
        String []res = new String[str.length+1];
        for(int i = 0; i<str.length;i++){
            int index = str[i].charAt(str[i].length()-1)-'0';
            res[index] = str[i].substring(0,str[i].length()-1);
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 1;i<res.length;i++){
            sb.append(res[i]);
            if(i!= res.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    static void main(String[] args) {
        System.out.println(new SortingSentence().sortSentence("Myself2 Me1 I4 and3"));
    }
}
