import java.util.Arrays;

public class LeetCode2 {
    public static void main(String[] args) {
        String[][] items = {
                {"phone","blue","pixel"},
                {"computer","silver","lenovo"},
                {"phone","gold","iphone"}
        };
        fun(items,"color","silver");
    }
    static void fun(String[][] values,String ruleKey, String ruleValue ){
        for (int i = 0; i < values.length; i++) {
           if(ruleKey == "type"){
               if(ruleValue == values[i][0]){
                   System.out.println(Arrays.toString(values[i]));
               }
           }
            if(ruleKey == "color"){
                if(ruleValue == values[i][1]){
                    System.out.println(Arrays.toString(values[i]));
                }
            }
            if(ruleKey == "name"){
                if(ruleValue == values[i][2]){
                    System.out.println(Arrays.toString(values[i]));
                }
            }
        }
    }
}
