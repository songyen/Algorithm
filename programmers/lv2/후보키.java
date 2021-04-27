/*
* reference : https://leveloper.tistory.com/106
 */
package lv2;

import java.util.*;

public class 후보키 {
    public static void main(String[] args) {
        후보키 test = new 후보키();
        System.out.println(test.solution(new String[][]{{"100","ryan","music","2"},{"200","apeach","math","2"},
                                                        {"300","tube","computer","3"},{"400","con","computer","4"},
                                                        {"500","muzi","music","3"}, {"600","apeach","music","2"}}));
    }

    private int colSize;
    private int rowSize;
    private String[][] table;
    private List<Integer> candidateKey;

    public int solution(String[][] relation) {
        colSize = relation[0].length;
        rowSize = relation.length;
        table = relation;
        candidateKey = new ArrayList<>();

        for(int i=1;i<(1<<colSize);i++){
            if(!isUnique(i)) continue;
            if(!isMinimality(i)) continue;

            candidateKey.add(i);
        }

        return candidateKey.size();
    }

    private boolean isMinimality(int set) {
        for(int key : candidateKey){
            if((key & set) == key) return false;
        }

        return true;
    }


    private boolean isUnique(int index) {
        List<Integer> set = makeSet(index);
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < rowSize; i++){
            StringBuilder sb = new StringBuilder();
            for (int j : set) {
                sb.append(table[i][j]).append(" ");
            }

            hashSet.add(sb.toString());
        }

        return hashSet.size() == rowSize;
    }

    private List<Integer> makeSet(int set) {
        List<Integer> keySet = new ArrayList<>();
        int index = 1 << colSize-1;
        for(int i=0;i<colSize;i++){
            if((set & index>>i) != 0) {
                keySet.add(i);
            }
        }

        return keySet;
    }

}
