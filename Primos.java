public class Primos {
    public static void main(String[] args) {
        int number = 14; // Número a ser verificado
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " É um número primo.");
        } else {
            System.out.println(number + " Não é um número primo.");
        }
    }
}
    

