public class PowerofTwo {
    public static void main(String args[]){
        int n = 3;
        if(n  <=0){
            System.out.println("false");
           return;
        }
        while( n % 2 == 0){
            n = n /2;
        }
        if(n == 1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
}
