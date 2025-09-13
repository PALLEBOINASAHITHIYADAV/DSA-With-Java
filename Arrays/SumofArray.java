import java.util.Scanner;
public class SumofArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of elements: ");
        int n = sc.nextInt();
        System.out.print("the elements in the array: ");
        int arr[]=new int[n];
        int sum =0;
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum +arr[i];
            
        }
        System.out.print(sum+" ");
        sc.close();
        
    }
}
    

