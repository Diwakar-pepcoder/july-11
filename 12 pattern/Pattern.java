import java.util.*;

public class Main {

    public static void pattern10() {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int space = n / 2;
        int star = 1;

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            // star
            for (int j = 1; j <= star; j++) {
                if (j == 1 || j == star) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println();

            if (i <= n / 2) {
                space--;
                star = star + 2;
            } else {
                space++;
                star = star - 2;
            }
        }

    }

    public static void pattern11() {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int count = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();
        }

    }

    public static void pattern13() {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int val = 1;
        for (int i = 0; i < n; i++) {
            val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + "\t");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }

    public static void pattern14() {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

    }

    public static void pattern15() {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int space = n / 2;
        int star = 1;

        int oval = 1;
        for (int i = 1; i <= n; i++) {
            int ival = oval;

            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print(ival + "\t");
                if (j <= star / 2) {
                    ival++;
                } else {
                    ival--;
                }
            }

            System.out.println();

            if (i <= n / 2) {
                space--;
                star = star + 2;
                oval++;
            } else {
                space++;
                star = star - 2;
                oval--;
            }
        }

    }

    public static void pattern16() {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int star = 1;
        int space = 2 * n - 3;
        for (int i = 1; i <= n; i++) {
            int val = 1;

            for (int j = 1; j <= star; j++) {
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            val--;
            if (i == n) {
                star--;
                val--;
            }
            for (int j = 1; j <= star; j++) {
                System.out.print(val + "\t");
                val--;
            }

            star++;
            space -= 2;
            System.out.println();
        }

    }

    public static void pattern17() {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int star = 1;
        int space = n / 2;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++) {
                if (i == n / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i <= n / 2) {
                star++;
            } else {
                star--;
            }
        }

    }

    public static void pattern18() {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int star = n;
        int space = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= star; j++) {

                if (i >= 2 && i <= n / 2) {
                    if (j == 1 || j == star) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    System.out.print("*\t");
                }

            }
            System.out.println();
            if (i <= n / 2) {
                space++;
                star = star - 2;
            } else {
                space--;
                star = star + 2;
            }

        }

    }

    public static void pattern19() {
        Scanner scn = new Scanner(System.in);
    
        int n  = scn.nextInt();
        
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n;j++){
                if(i == n/2+1 || j == n/2+1){
                    System.out.print("*\t");
                }else if(i==1 && j>=1 && j<=n/2){
                    System.out.print("*\t");
                }else if(j==n && i<=n/2){
                    System.out.print("*\t");
                }else if(i==n && j > n/2){
                    System.out.print("*\t");
                }else if(j==1 && i>n/2){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    
     }

}