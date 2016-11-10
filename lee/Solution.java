import java.util.*;
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Map<Integer, Integer> map = new HashMap<Integer, Integer>();  
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.get(numbers[i]) != null) {
                int[] result = {map.get(numbers[i]) + 1, i + 1};
                return result;
                                                                    
                    }
            map.put(target - numbers[i], i);
                                        
                }
        int[] result = {};
        return result;
                                    
    }
    public static void main(String []args){
        Solution solu = new Solution();
        solu.twoSum({1,2},9);
    }

}



