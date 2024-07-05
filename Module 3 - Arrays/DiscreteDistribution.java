public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        int[] a = new int[n];
        int[] s = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
            s[i + 1] = s[i] + a[i];
        }

        for (int j = 0; j < m; j++) {
            int r = (int) (Math.random() * s[n]);
            for (int i = 0; i < n; i++) {
                if (r < s[i + 1]) {
                    System.out.print((i + 1) + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}
