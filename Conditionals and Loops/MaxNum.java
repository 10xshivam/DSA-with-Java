import java.util.Scanner;

public class MaxNum {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        System.out.print("Enter the three numbers: ");
        int n1 = n.nextInt();
        int n2 = n.nextInt();
        int n3 = n.nextInt();

        //first method
        // int max = n1;
        // if(max < n2){
        //     max = n2;
        // } 

        // if (max < n3){
        //     max = n3;
        // } 

        // second method
        // int max = 0;
        // if(n1 < n2) {
        //     max = n2;
        // } else{
        //     max = n1;
        // }

        // if (n3 > max){
        //     max = n3;
        // }

        //third method
        // int max = Math.max(n3,Math.max(n1,n2));
        
        // System.out.println("Max is : " + max);


        // fourth method 
        if(n1 > n2){
            if(n1 > n3){
                System.out.println("Max is : "+n1);
            } else{
                System.out.println("Max is : "+n3);
            }
        } else {
            if(n2 > n3){
                System.out.println("Max is : "+n2);
            } else {
                System.out.println("Max is : "+n3);
            }
        }

    }
}