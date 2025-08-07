import java.util.Scanner;

public class PatternProgram {

    public static void main(String[] args) {
        showPatternMenu(); 
    }

    static void showPatternMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nChoose a Pattern:");
            System.out.println("1.  Pattern 1");
            System.out.println("2.  Pattern 2");
            System.out.println("3.  Pattern 3");
            System.out.println("4.  Pattern 4");
            System.out.println("5.  Pattern 5");
            System.out.println("6.  Pattern 6");
            System.out.println("7.  Pattern 7");
            System.out.println("8.  Pattern 8");
            System.out.println("9.  Pattern 9");
            System.out.println("10. Pattern 10");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pattern1();
                    break;
                case 2:
                    pattern2();
                    break;
                case 3:
                    pattern3();
                    break;
                case 4:
                    pattern4();
                    break;
                case 5:
                    pattern5();
                    break;
                case 6:
                    pattern6();
                    break;
                case 7:
                    pattern7();
                    break;
                case 8:
                    pattern8();
                    break;
                case 9:
                    pattern9();
                    break;
                case 10:
                    pattern10();
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 10.");
            }

            System.out.print("\nDo you want to continue? (Press 1 for Yes, any other number to exit): ");
            int repeat = sc.nextInt();

            if (repeat != 1) {
                System.out.println("\nThank you!");
                break;
            }
        }
    }

    static void pattern1() {
        System.out.println("\nPattern 1:");
        int i, n = 5;
        for (i = 1 ; i < n+n; i++){
            System.out.println((i<=n)?" * ".repeat(i):" * ".repeat(n - (i - n)));
        }
    }

    static void pattern2() {
        System.out.println("\nPattern 2:");
        int i = 1 , x = 0;
        while ( i <= 8)
        {
            x = x*10 + i ;
            System.out.println( x + "  ");
            i++;
        }
    }

    static void pattern3() {
        System.out.println("\nPattern 3:");
        int i , j , n = 5;
        for ( i = 1 ; i <= n + n - 1 ; i++){
            for ( j = 1 ; j <= n + n - 1 ; j++){
                System.out.print(( i <= n)? ( j <= i || j>= (n + n - i))? "X ": " ": (j <= ( n-( i - n )) || j >= ( n + ( i - n )))? "X ":" ");
            }
            System.out.println();
        }
    }

    static void pattern4() {
        System.out.println("\nPattern 4:");
        int i , j , n = 5 , m = n / 2;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
            System.out.print((i == m || j == m) ? "* " : "  ");
            }
            System.out.println();
        }
    }

    static void pattern5() {
        System.out.println("\nPattern 5:");
        int i;
        for ( i = 1 ; i<=10; i++){
            System.out.println((i % 2 == 0) ? " --------------- " :"   ***********   ");
        }
    }

    static void pattern6() {
        System.out.println("\nPattern 6:");
        int i , j=1 , x = 6-1 ;
        for ( i = 1 ; i<=6; i++){
            System.out.println("  ".repeat(x) + " *".repeat(j));
            j= j+2;
            x--;
        }
    }

    static void pattern7() {
        System.out.println("\nPattern 7:");
        int i;
        for ( i = 1 ; i<=10; i++){
            System.out.println(i + "  ".repeat(i) + " * ");
        }
    }

    static void pattern8() {
        System.out.println("\nPattern 8:");
        int i , j ;
        for ( i = 1 ; i <= 5 ; i++){
            for ( j = 1 ; j <= 5; j++){
            System.out.print((i % 2 == 0)? " * ": " $ ");
            }
            System.out.println();
        }
    }

    static void pattern9() {
        System.out.println("\nPattern 9:");
        int i, j , n = 7;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print((j == i || j == n - i - 1)?"* " : "  ");
            }
            System.out.println();
        
        }
    }
    static void pattern10() {
        System.out.println("\nPattern 10:");
        int i , j , n = 5 , x = 0 ;
        for ( i = 1 ; i <= n ; i++ ){
            System.out.print(" ".repeat(n-i));
            for ( j = 1, x = 0  ; j <= i ; j++ ){
                System.out.print(((j == 1 || j == i || i == n ))? "* ": (x = x + 2)+" ");
                // x = ( x == )
            }
            System.out.println();
        }
    }
}