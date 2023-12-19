public class UC2
{
    public static double firstLineLength;
    public static double secondLineLength;
     private static double calculateLengthofLine(int x1,int x2,int y1,int y2)
     {
         double lineLength;
         lineLength=Math.sqrt((x2-x1)^2+(y2-y1)^2);
         return lineLength;
     }
     private static void checkEqualityofLine()
     {
         if(UC1.firstLineLength== UC1.secondLineLength)
         {
             System.out.println("Both the lines are Equal");
         }
         else
         {
             System.out.println("Lines are not Equal");
         }
     }
     public static void main(String[]args)
     {
         System.out.println("Welcome to Line Comparison Computation program on Master Branch ");
         firstLineLength=calculateLengthofLine(3,2,6,8);
         System.out.println(firstLineLength);
         secondLineLength=calculateLengthofLine(5,3,6,2);
         System.out.println(secondLineLength);
         checkEqualityofLine();
     }
}
