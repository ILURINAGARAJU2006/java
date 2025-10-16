class Solution {
    public boolean isPalindrome(int x) {
      int org=x,y=0,rev=0;
      if(x<0)
      return false;
      else{
      while(x!=0){
      y=x%10;
      rev=rev*10+y;
      x=x/10;  
      }
      }
      if(org==rev)
      return true;
      else return false;
    }
}
