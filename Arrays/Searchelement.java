import java.util.Scanner;
public class Searchelement {
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int arr[]=new int[n];
        int x = sc.nextInt();
        boolean found = false;
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==x){
                found = true;
            }
            
        }
        if(found ){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
        sc.close();
    }
}
    

