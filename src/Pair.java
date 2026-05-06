public class Pair {
    int key;
    char value;
    Pair(int key, char value){
        this.key = key;
        this.value = value;
    }
    @Override
    public String toString(){
        return "("+key+","+value+")";
    }
}
