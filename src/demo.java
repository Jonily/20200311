import java.util.Scanner;
public class demo {
    public static void main (String[]args){
        System.out.println("输入想要查看的项数："); //裴波那契数输入
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
    }
    public static void fun (int n){
         int []funArrays = new int[999];
         funArrays[0] = 0;
         funArrays[1] = 1;
         int j = 0 ;
         if (n == 1) {
             System.out.println("值为:"+ funArrays[0]);
         }
         if (n == 2) {
             System.out.println("值为:"+ funArrays[1]);
         }else {
             for (j = 2; j <= n-1; j++) {
                 funArrays[j]=funArrays[j-1]+funArrays[j-2];

             }
             System.out.println("值为:"+ funArrays[n-1]);
         }
    }

}
