

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isNumberPrime(3));
    }

    public static boolean isNumberPrime(int n) {
        //boolean check = true;
        if (n <= 1) {return false;}
        for (int i = 2; i <= n/2; i++){
            if (n%i == 0) {return false;}
        }
        return true;
    }
}
