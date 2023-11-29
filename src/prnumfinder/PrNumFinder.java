package prnumfinder;

import java.util.ArrayList;
import java.util.List;

public class PrNumFinder
{

    private static boolean isPrime(int num) {
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> getPrimesFromRange(int min, int max) {
        var result = new ArrayList<Integer>();
        for (int i = min; i < max; i++) {
            if (PrNumFinder.isPrime(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
