package Module1;
public class RightTriangle {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide exactly three integers as command-line arguments.");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean positiveIntegers = (a > 0 && b > 0 && c > 0); //True or False

        boolean isRightTriangle = false;
        if (positiveIntegers) {
            if (a * a + b * b == c * c ||
                a * a + c * c == b * b ||
                b * b + c * c == a * a) {
                isRightTriangle = true;
            }
        }

        System.out.println(isRightTriangle);
    }
}
