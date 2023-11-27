import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number :: ");
        int ip = sc.nextInt();
        int sum=0;
        for (int i = 1; i <ip; i++) {
           if(ip%i==0)
           sum=sum+i;
        }
        if(sum==ip) {
            System.out.println("Number is Perfet :: "+ip);
        }else{
            System.out.println("Number is not Perfet :: "+ip);
        }
    }
}
