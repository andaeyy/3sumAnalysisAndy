import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import edu.princeton.cs.algs4.In;


public class ThreeSum {

    // Count triples that sum to 0 (brute force O(n^3))
    public static int count(int[] a) {

        int count = 0;
        for (int i = 0; i < a.length-2; i++){
            for (int j = i+1; j < a.length-1; j++){
                for (int k = j+1; k < a.length; k++){
                    if (a[i] + a[j] + a[k] == 0){ count++; System.out.println(a[i] + " " + a[j] + " " + a[k]);}
                }
            }
        }


        return count;
    }

    public static void main(String[] args) throws IOException {
        In in = new In(args[0]);
        int[] a = in.readAllInts();


        // Time only the count() call
        Stopwatch timer = new Stopwatch();
        int count = count(a);
        double time = timer.elapsedTime();

        System.out.printf("Count = %d  time = %.3f seconds%n", count, time);
    }
}
