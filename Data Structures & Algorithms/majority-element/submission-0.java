class Solution {
    public int majorityElement(int[] nums) {
      Map<Integer,Integer> mp= new HashMap<>();
        int res=0;
        int max=0;
        for(int n:nums){
          mp.put(n,mp.getOrDefault(n,0)+1);
          if(mp.get(n)>max){
          res=n;
          max=mp.get(n);
          }
        }
        return res;
    }
    
}