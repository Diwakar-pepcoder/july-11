public class Main {
    
    public static int getDigitFrequency(int n, int d) {
        int count=0;
        
        // code to count d in n 
        while(n>0){
            int q = n/10;
            int r= n%10;
            
            if(r==d){
                count++;
            }
            
            n = q;
        }
        return count;
    }

    public static int getValueInBase(int n, int b){
        int pow = 0;
        int ans = 0;
        
        while(n != 0){
            int q = n/b;
            int r = n%b;
            
            int multi = (int)Math.pow(10, pow);
            ans = ans + r*multi;
            
            pow++;
            n=q;
        }
        
        return ans;
   }

}
