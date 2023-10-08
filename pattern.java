//                Print pattern

/* 
import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j =1; j<=c; j++){
                System.out.print("*");
            }
            System.out.println();
        }  
    }
}
*/


/* 
import java.util.Scanner;
public class pattern{
    static void pattern(int n){
        for(int i=0; i<n; i++){
            for(int j =0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ::");
        int num = sc.nextInt();
        pattern(num);
    }
}
*/

/* 
import java.util.Scanner;
public class pattern{
    static void ptrn(int n){
        for(int i=0; i<n; i++){
            for(int j =n; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ::");
        int num = sc.nextInt();
        ptrn(num);
    }
}
*/


/* 
import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j =1; j<=c; j++){
                if(i==1 || j ==1 || i==r || j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*/


/* 
import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j =1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/


/* 
import java.util.Scanner;
public class pattern{
    static void ptrn(int n){
        for(int i=1; i<=n; i++){
            for(int j =1; j<i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ::");
        int num = sc.nextInt();
        ptrn(num);
    }
}
*/

/* 
import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int number = 1;
        for(int i=1; i<=r; i++){
            for(int j =1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }  
    }
}
*/


/* 
import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j =1; j<=r-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }  
    }
}
*/

//     Right angle traingle with 1 and 0

/* 
import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j =1; j<=i; j++){
                if((i+j) %2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
*/



//    Butterfly Pattern

/* 
import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            int space =2*(r-i);
            for (int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = r; i >=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            int space =2*(r-i);
            for (int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/



//    Solid Rhombus

/* 
import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j =1; j <= r-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=r; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/


/*
import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int num=1;
        for(int i=1; i<=r; i++){
            for(int j =1; j <= r-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
*/




//        Number pyramid

/* 
import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j =1; j <= r-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
*/



//         Palindromic pattern

/* 
import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j =1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int j = i; j>=1; j--){
                System.out.print(j);
                
            }
            for(int j =2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
*/


//       Diamond pattern

/* 
import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j =1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=r; i>=1; i--){
            for(int j =1; j<=r-i; j++){
                System.out.print(" ");
            }
            int time = (2*i)-1;
            for(int j =1; j<=time; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//             OR

/* 
import java.util.*;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            for(int j =1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int j = i; j>=1; j--){
                System.out.print("*");
                
            }
            for(int j =2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=r; i>=1; i--){
            for(int j =1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int j = i; j>=1; j--){
                System.out.print("*");
                
            }
            for(int j =2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
