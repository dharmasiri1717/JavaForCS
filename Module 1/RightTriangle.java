public class RightTriangle {
    public static void main(String[] args) {
        boolean isRightTriangle = args.length == 3 &&
            Integer.parseInt(args[0]) > 0 &&
            Integer.parseInt(args[1]) > 0 &&
            Integer.parseInt(args[2]) > 0 &&
            (
                Math.pow(Integer.parseInt(args[0]), 2) + Math.pow(Integer.parseInt(args[1]), 2) == Math.pow(Integer.parseInt(args[2]), 2) ||
                Math.pow(Integer.parseInt(args[0]), 2) + Math.pow(Integer.parseInt(args[2]), 2) == Math.pow(Integer.parseInt(args[1]), 2) ||
                Math.pow(Integer.parseInt(args[1]), 2) + Math.pow(Integer.parseInt(args[2]), 2) == Math.pow(Integer.parseInt(args[0]), 2)
            );

        System.out.println(isRightTriangle);
    }
}
