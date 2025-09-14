import java.util.Scanner;
public class Missingnumber {
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("enter number of elements in array: ");
        n = sc.nextInt();
        System.out.print("the no of elements in the array: ");
        int arr[]=new int[n];
        int actualresult = n*(n+1)/2;
        int expectedresult =0;
      
        for(int i =0;i<n-1;i++){
            arr[i]=sc.nextInt();
            expectedresult = expectedresult + arr[i];
            
            
        }
          int missingvalue = actualresult-expectedresult;
        System.out.println(expectedresult+" expectedresult");
        System.out.println(actualresult+" actualresult");
        System.out.println(missingvalue+" is missing  number in the array");
        
        
        
        
}
}
    

