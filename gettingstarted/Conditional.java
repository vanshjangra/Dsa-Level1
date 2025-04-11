package gettingstarted;

public class Conditional {
    public static void main(String[] args) {
        int x = 10;

        if (x % 2 == 0) {
            System.out.println(x + " is even.");
        }
        else{
            System.out.println(x + " is odd.");
        }
        System.out.println("Hardwork is better than smart work.");

        int n1 = 10;
        int n2 = 20;

        if (n1 == n2) {
            System.out.println(n1 + " is equal to " + n2);
        }
        else if(n1 > n2){
            System.out.println(n1 + " is greater than " + n2);
        }
        else{
            System.out.println(n1 + " is smaller than " + n2);
        }
    }
}
