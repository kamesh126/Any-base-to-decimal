// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class AnyBasetodecimal {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int base = sc.nextInt();

            System.out.println(decimal(num,base));
        }
        public static int decimal(int num,int base)
        {
            int result = 0;
            int power = 0;
            while(num>0)
            {
                int x =num%10;
                result+=x*checkPow(base,power);
                power++;
                num/=10;
            }
            return result;
        }
        public static int checkPow(int base,int x)
        {
            if(x==0)
                return 1;

            return base * checkPow(base,x-1);
        }
    }
