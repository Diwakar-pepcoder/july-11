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

    public static int getSum(int b, int n1, int n2){
    int ans=0;
    int multi=1;// 10^0
    int carry = 0;
    
    while( n1 > 0 || n2>0 || carry > 0 ){
        
        int q1 = n1/10;
        int r1 = n1%10;
        int q2 = n2/10;
        int r2 = n2%10;
        
        int sum = r1+r2+carry;
        int digit = sum %b;
        carry = sum/b;
        
        ans = ans + digit*multi;
        
        multi *= 10; // multi = multi * 10;
        n1 = q1;
        n2 = q2;
    }
    return ans;
}
}
