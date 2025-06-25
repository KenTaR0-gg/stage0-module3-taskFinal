package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int a = number / 100;
        int b = (number - a * 100) / 10;
        int c = number - a * 100 - b * 10;

        number = a*100 + b*10 + c;
        System.out.println(100*c + 10*b +a);
    }
}
