import java.util.Scanner;
public class add {
    public static void main(String[]args){
        System.out.println("输入需要计算的阶乘数的和：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = fun1(num);
        System.out.println("计算结果为："+sum);
    }
    public static int fun(int num){
        int i = 1 ;
        int a = 1 ;
        for(i = 1 ; i<=num ; i++){
            a*=i;
        }
        return a;
    }
    public static int fun1(int k){
        int j = 1 ;
        int sum = 0 ;
        for (j = 1 ; j<=k ; j++){
            sum+=fun(j);
        }
        return sum ;
    }
}
