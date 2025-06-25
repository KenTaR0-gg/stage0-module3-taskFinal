package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int a = number/1000;
        int b = (number -a*1000)/100;
        int c = (number - a*1000 - b*100)/10;
        int d = number - a*1000 -b*100 - c*10;
        number = 1000 * a + 100 * b + 10 * c + d;
        System.out.println(a + b + c + d);

    }
}
