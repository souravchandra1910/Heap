import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianfromDataStream {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    public FindMedianfromDataStream() {
      this.left = new PriorityQueue<>(Collections.reverseOrder());
      this.right = new PriorityQueue<>();
    }
    
    public void addNum(int val) {
        if( right.size()>0 && val>right.peek()){
          right.add(val);
      }
      else {
          left.add(val);
      }

      if((left.size()-right.size())>1){
          right.add(left.remove());
      }
      else if((right.size()-left.size())>0){
          left.add(right.remove());
      }  
    }
    
    public double findMedian() {
          if(left.size() == right.size()){
            return (double)(left.peek() + right.peek())/2;
        }else{
             return (double)(left.peek());
        }
    }
}

