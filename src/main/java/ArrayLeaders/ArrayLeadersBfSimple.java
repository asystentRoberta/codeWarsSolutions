package ArrayLeaders;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeadersBfSimple implements ArrayLeadersInterface{

    public List arrayLeaders(int[] n) {

        List<Integer> ary = new ArrayList<>();
        for (int i = n.length - 1, sum = 0; i >= 0; i--) {
            if (n[i] > sum) {
                ary.add(0, n[i]);
            }
            sum += n[i];
        }
        return ary;
    }
}
