package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2;

        while (number <= printToInclusive) {
            boolean isPrime = true;
            int counter = 2;

            while (counter <= number / 2) {
                if (number % counter == 0) {
                    isPrime = false;
                    break;
                }
                counter++;
            }

            if (isPrime) {
                System.out.println(number);
            }

            number++;
        }
    }
}


