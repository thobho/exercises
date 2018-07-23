package codesignal;

public class Arrays {

    int firstDuplicate(int[] a) {
        for (int i:a){
            if (a[Math.abs(i)-1]<0) return Math.abs(i);
            a[Math.abs(i)-1]*=-1;
        }
        return -1;
    }


    public static void main(String[] args) {

    }
}
