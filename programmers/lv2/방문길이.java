package lv2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class 방문길이 {
    public int solution(String dirs) {
        List<String> visited = new ArrayList<>();
        int x = 0;
        int y = 0;
        String lastLocation = "";
        String nextLocation = "";
        for(int i=0;i<dirs.length();i++){
            lastLocation = x+""+y;
            if(dirs.charAt(i) == 'U'){
                if(y==5) continue;
                else y+=1;
            }else if(dirs.charAt(i) == 'D'){
                if(y==-5) continue;
                else y-=1;
            }else if(dirs.charAt(i) == 'L'){
                if(x==-5) continue;
                else x-=1;
            }else{
                if(x==5) continue;
                else x+=1;
            }
            nextLocation = x+""+y;
            /*
            *반례 : UDU경우, 1이 나와야한다.
            * (0,0) -> (0,1) 과 (0,1) -> (0,0)은 같은 경로이다.
            * 가는길과 돌아오는 길을 다른 경로로 보면 틀리게 된다.
             */
            if(visited.contains(lastLocation+nextLocation)) continue;
            else if(visited.contains(nextLocation+lastLocation)) continue;
            else visited.add(lastLocation+nextLocation);
        }
        return visited.size();
    }

    @Test
    public void test(){
        Assert.assertEquals(7, solution("LULLLLLLU"));
    }
}
