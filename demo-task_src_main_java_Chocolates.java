import java.util.*;
import static java.util.Map.Entry.comparingByKey;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Arrays;
import java.util.List;
public class Chocolates {
    public HashMap<Integer, String> sort(Map<Integer, String> choc) {
        System.out.println("Chocolates before sorting: \n" + choc+"\n");

        // let's sort this map by keys first
        List<Map.Entry<Integer, String>> toSort = new ArrayList<>();
        for (Map.Entry<Integer, String> e : choc.entrySet()) {
            toSort.add(e);
        }
        toSort.sort(comparingByKey());
        HashMap<Integer, String> sorted = new HashMap<Integer, String>();
        for (Map.Entry<Integer, String> e : toSort) {
            sorted.put(e.getKey(), e.getValue());
        }
        System.out.println("Chocolates after sorting by Weights: \n" + sorted+"\n");
        List<Map.Entry<Integer, String>> listToSort = new ArrayList<>();
        for (Map.Entry<Integer, String> t : choc.entrySet()) {
            listToSort.add(t);
        }
        listToSort.sort(Collections.reverseOrder(comparingByKey()));
        HashMap<Integer, String> map = new HashMap<>();
        for (Map.Entry<Integer, String> t : listToSort) {
            String put = map.put(t.getKey(), t.getValue());
        }
        sorted = map;
        System.out.println("Chocolates after sorting by Weights in descending order: \n" + sorted+"\n");
        return sorted;
    }
    public double totalweight(Map<Integer, String> choc) throws Exception{
        //double chocsum = 0;
        ArrayList<Integer> keyList;
        keyList = new ArrayList<Integer>(choc.keySet());
        double total = 0;
        for (int i : keyList) {
            total += i;
        }
        return total;
    }
}