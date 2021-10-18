package lv3;

public class 단어변환 {
    private String[] w;
    private String t;
    private boolean[] visit;
    private int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        단어변환 test = new 단어변환();
        System.out.println(test.solution("hit","cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}));
    }
    public int solution(String begin, String target, String[] words) {
        t = target;
        w = words;
        visit = new boolean[w.length];
        boolean convert = false;
        for(int i=0;i<w.length;i++){
            if(w[i].equals(t)) convert = true;
        }
        if(!convert) return answer;

        dfs(0, begin);//0, hit
        return answer;
    }

    public void dfs(int cnt, String begin){
        for(int i=0;i<w.length;i++){
            if(!visit[i] && one(begin, w[i])){//한개의 알파벳만 바뀔 수 있다.
                if(w[i].equals(t)) {
                    System.out.println(cnt);
                    answer = Math.min(answer, cnt);
                    break;
                }
                visit[i] = true;
                dfs(cnt++, w[i]);
                visit[i] = false;
            }
        }
        return;
    }

    public boolean one(String begin, String s){
        int num = 0;
        for(int i=0;i<begin.length();i++){
            if(begin.charAt(i) != s.charAt(i)) num++;
        }
        if(num==1) return true;
        return false;
    }
}
