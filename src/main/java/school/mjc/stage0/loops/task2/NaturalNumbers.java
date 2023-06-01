package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int startNumb = 0;
        while (startNumb <= lastPrinted) {
            System.out.println(startNumb);
            startNumb++;
        }
    }
}
