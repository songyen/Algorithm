//package lv2;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class 스킬트리 {
//    public int solution(String skill, String[] skill_trees) {
//        List<Character> list = new ArrayList<>();
//        List<Character> userList = new ArrayList<>();
//        int result = 0;
//
//        for(int i=0;i<skill.length();i++){
//            list.add(skill.charAt(i));
//        }
//
//        String userSkill = "";
//        for(int i=0;i<skill_trees.length;i++){
//            userSkill = skill_trees[i];
//            for(int j=0;j<userSkill.length();j++){
//                if(list.contains(userSkill.charAt(j))){
//                    userList.add(userSkill.charAt(j));
//                }
//            }
//
//            for(int k=0;k<userList.size();i++){
//                if(userList.get(k)!=list.get(k)){
//                    userList.clear();break;
//                }else{
//                    if(k==userList.size()-1){
//                        result++;
//                    }
//                }
//            }
//        }
//
//        return result;
//    }
//
//    @Test
//    public void test(){
//        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
//        Assert.assertEquals(2, solution("CBD",skill_trees));
//    }
//}
