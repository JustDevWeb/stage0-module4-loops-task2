package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int multiplier = multiplyByAndToInclusive < 0 ? -multiplyByAndToInclusive : multiplyByAndToInclusive;
        int counter = 0;
        if(multiplier != 0) {
            while (counter <= multiplier) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter++;
            }
        }
    }
}
