package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power > 0){
            int counter = 1;
            int result = 1;
            System.out.println(result);
            while (counter <= power){
                result *= 2;
                counter++;
                System.out.println(result);
            }
        }else if (power == 0) {
            System.out.println(1);
        }
        else {
            System.out.println("too much power");
        }

    }
}
