import java.util.Scanner;
public class maxNum {
    public static void main(String[] args) {
        System.out.println("请输入三个数字：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = max3(a , b , c);
        System.out.println("最大值为："+ max);
    }
    public static int max2(int a ,int b ){
        int m= a > b ? a:b;
        return m ;
    }
    public static int max3(int a , int b , int c){
        int max = max2(max2(a,b),c);
        return max ;
    }
}
