import java.util.*;

public class ConcatenateStringsCompare {

    public static void main(String[] args){

        int n = 1_000_000;

        StringBuilder sb = new StringBuilder();
        StringBuffer sf = new StringBuffer();

        long startB = System.nanoTime();
        for(int i = 0; i < n; i++){
            sb.append("hello");
        }
        long endB = System.nanoTime();

        long startF = System.nanoTime();
        for(int i = 0; i < n; i++){
            sf.append("hello");
        }
        long endF = System.nanoTime();


        System.out.println("StringBuilder (in ns): " + (endB - startB));
        System.out.println("StringBuffer (in ns): " + (endF - startF));
    }
}