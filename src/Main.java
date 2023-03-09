import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int A,B,C;

        Scanner sc = new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();

        if((A>=2)&&(B<=10000)&&(C<=10000))
        {
            System.out.println((A+B)%C);
            System.out.println(((A%C) + (B%C))%C);
            System.out.println((A*B)%C);
            System.out.println(((A%C) * (B%C))%C);

        }else{
            System.out.println("다시 입력 바람");
        }

    }
}