class Solution {
public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
    Map<Integer,Integer> m1=new HashMap<>();
    Map<Integer,Integer> m2=new HashMap<>();
    Map<Integer,Integer> m3=new TreeMap<>();
    for(int p[]:items1){
        m1.put(p[0],p[1]);
    }
    for(int p[]:items2){
        m2.put(p[0],p[1]);
    }
    for(int t1:m1.keySet()){
        int t3=m1.get(t1);
        int t4=m2.getOrDefault(t1,0);
        if(m2.containsKey(t1))m2.remove(t1);
        m3.put(t1,(t3+t4));
    }
    if(m2.size()!=0){
    for(int t1:m2.keySet()){
        m3.put(t1,m2.get(t1));
    }
    }
    List<List<Integer>> l=new ArrayList<>();
    
    for(int t1:m3.keySet()){
        List<Integer> l1=new ArrayList<>();
        l1.add(t1);
        l1.add(m3.get(t1));
        l.add(l1);
    }
    return l;
    
}