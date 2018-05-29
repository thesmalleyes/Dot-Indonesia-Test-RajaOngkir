package dot.id.dot_test;

import java.util.Arrays;

public class Sortir {
    public static void main(String[] args) {
        int[] number = {1,6,3,4,5,8,2};

        Arrays.sort(number);
        System.out.println("Urutan bilangan terbesar kedua adalah : "+number[number.length-1]);
    }
}
