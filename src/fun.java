import java.util.Scanner;
public class fun {
    public static void main(String[] args) {
    int r = 0 ;
       System.out.println("请输入两个正整数：");
       Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
           if (i < j){
            r = i;
            i = j;
            j = r;
    }
          while ( i % j != 0){
            r = i % j;
            i = j;
            j = r;
    }
       System.out.println("两个整数的最大公约数为"+j);
    }
}

