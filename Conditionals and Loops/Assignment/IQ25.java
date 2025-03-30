package Assignment;

public class IQ25 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 30; i++) {
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println("Kunal is allowed for " + count + " to go outside in august.");
    }
}
