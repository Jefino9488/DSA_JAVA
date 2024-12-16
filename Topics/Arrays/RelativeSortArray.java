package Arrays;


import java.util.*;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] x, int[] y) {
        Map<Integer, Integer> a = new HashMap<>();
        for (int b : x) a.put(b, a.getOrDefault(b, 0) + 1);
        List<Integer> c = new ArrayList<>();
        for (int d : y) {
            int e = a.get(d);
            for (int f = 0; f < e; f++) c.add(d);
            a.remove(d);
        }
        List<Integer> g = new ArrayList<>();
        for (int h : a.keySet()) {
            int i = a.get(h);
            for (int j = 0; j < i; j++) g.add(h);
        }
        Collections.sort(g);
        c.addAll(g);
        int[] k = new int[c.size()];
        for (int l = 0; l < c.size(); l++) k[l] = c.get(l);
        return k;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        RelativeSortArray relativeSortArray  = new RelativeSortArray();
        System.out.println(Arrays.toString(relativeSortArray.relativeSortArray(arr1, arr2)));
    }
}
