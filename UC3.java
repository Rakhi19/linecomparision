package linecomparision;
public class UC3
{
    public static double firstLineLength;
    public static double secondLineLength;

    private static double calculatingLengthOfLine(int x1, int x2, int y1, int y2) {
        double lineLength;
        lineLength = Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));
        return lineLength;
    }


    private static void compareLine() {
        if (firstLineLength == secondLineLength) {
            System.out.println("Both Lines are equal");
        } else {
            if (firstLineLength > secondLineLength) {
                System.out.println("First line is longer than second line");
            } else {
                System.out.println("Second line is longer than First line");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program on Master Branch");
        firstLineLength = calculatingLengthOfLine(3, 2, 6, 8);
        System.out.println(firstLineLength);
        secondLineLength = calculatingLengthOfLine(5, 3, 6, 2);
        System.out.println(secondLineLength);
        compareLine();
    }
}
