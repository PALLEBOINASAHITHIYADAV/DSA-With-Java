public class SecondLargest {
     public static void main(String[] args) {
        int arr[]={1,2,3,4,8,6};
        int firstnumber = Integer.MIN_VALUE;
        
        int secondnumber = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            int current = arr[i];
            if(current > firstnumber){
                secondnumber = firstnumber;
                firstnumber = current;
                
            }else if (current > secondnumber && current != firstnumber){
                secondnumber = current;
                
            }

        }
        
        if(secondnumber == Integer.MIN_VALUE){
            System.out.println("-1");
        }else{
            System.out.println("the secondlargest number: "+secondnumber);
            }
        }
    
}
