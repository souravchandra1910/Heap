import java.util.PriorityQueue;

public class ReorganizeString {
    public class pair implements Comparable <pair>{
        char ch;
        int f;
        public pair(char ch,int f){
            this.ch=ch;
            this.f=f;
        }
        public int compareTo(pair o){
            return o.f-this.f;
        }
    }
    public String reorganizeString(String s) {
        int []map=new int[26];
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
        }
    PriorityQueue<pair>pq=new PriorityQueue<>();
    for(int i=0;i<26;i++){
        if(map[i] > 0){
        pq.add(new pair((char)('a'+i),map[i]));
    }
    }
    StringBuilder sb=new StringBuilder();
    pair curr=pq.poll();
        sb.append(curr.ch);
        curr.f--;
     
        while(pq.size()>0){
            pair temp=pq.poll();
            sb.append(temp.ch);
            temp.f--;
            if(curr.f > 0){
            pq.add(curr);
            }
            curr=temp;
        }
        if(curr.f>0){
            return "";
        }
        return sb.toString();
        
 }
}
