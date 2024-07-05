public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        int[] thueMorseSequence = new int[n];
        for (int i = 0; i < n; i++) {
            thueMorseSequence[i] = Integer.bitCount(i) % 2;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (thueMorseSequence[i] == thueMorseSequence[j]) {
                    System.out.print("+  ");
                } else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}
