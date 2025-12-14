package Notes.Array;

public class Main {
    public static void main(String[] args) {
        int[] num ;// declaration of array. num is getting defined in the stack
        num = new int[5];// initialisation: actually here object is being created in the memory (heap)
        //System.out.println(num[4]);

        String[] st ;
        st = new String[5];
        System.out.println(st[0]);
    }
}
