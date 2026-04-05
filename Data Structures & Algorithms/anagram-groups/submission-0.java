class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> r= new HashMap<>();
        for(String s: strs){
            char[] chararr=s.toCharArray();
            Arrays.sort(chararr);
            String st = new String(chararr);
            r.putIfAbsent(st,new ArrayList<>());
            r.get(st).add(s);
        }
        return new ArrayList<>(r.values());
    }
}
