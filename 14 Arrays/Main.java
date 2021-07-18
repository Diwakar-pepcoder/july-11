public class Main {
    public static void SpanOfArray() {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scn.nextInt();
        }

        int max;// declaration
        int min = arr[0];
        max = arr[0];// initialization

        for (int i = 1; i <= n - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int span = max - min;
        System.out.println(span);

    }

    public static void FindElementInAnArray() throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == d) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
