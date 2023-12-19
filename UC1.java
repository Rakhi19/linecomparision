public class UC1
{
    public static double firstLineLength;
    public static double secondLineLength;
    private static double calculateLengthofLine(int x1,int x2,int y1,int y2)
    {
        double lineLength;
        lineLength=Math.sqrt((x2-x1)^2+(y2-y1)^2);
        return lineLength;
    }
    private static void compareLine()
    {
        String stringFirst=String.valueOf(firstLineLength);
        String stringSecond=String.valueOf(secondLineLength);
        int check=stringFirst.compareTo(stringSecond);
        if (check==0)
        {
            System.out.println("Both the lines are equal");
        }
        else
        {
            if (check>0)
            {
                System.out.println("First line is longer than second line");
            }
            else
            {
                System.out.println("Second line is longer than First line");
            }
        }
    }
    public static void main(String[]args)
    {
        System.out.println("Welcome to line computation program on Master branch");
        firstLineLength=calculateLengthofLine(3,2,6,8);
        System.out.println(firstLineLength);
        secondLineLength=calculateLengthofLine(5,3,6,2);
        System.out.println(secondLineLength);
        compareLine();
    }
}
