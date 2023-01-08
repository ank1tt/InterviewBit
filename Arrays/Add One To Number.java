public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
      
      int len = A.size();
      int index = len - 1;
      // traverse the array from end.
      // as long as we encounter the value = 9
      // we make it 0.
      // otherwise we just increment the value and break out of the loop.
      for(int i = index; i>=0 ; i--){
          if(A.get(i) == 9){
              A.set(i,0);
              index--;
          }else{
              
              A.set(i, A.get(i)+1);
              break;
          }
      }
      
      // if we reach the starting and all are the 9's 
      // we add 1 at the starting and keeping all the elements 0.
      if(index == -1){
          A.add(0,1);
         
      }
      // a loop to remove all the 0's at the front.
      while(A.get(0) ==0){
             A.remove(0);
         } 
      
      return A;
        
    }
}
