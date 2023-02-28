import java.util.Scanner;
import java.lang.Math;
public class calcolatrice {
        
        
        private static final Object String = null;

        /**
         * @param args
         */
        public static void main (String[] args) {
            
            Scanner in = new Scanner(System.in);
            System.out.println("inserisci primo numero ");
            int x = in.nextInt();

            Scanner in2 = new Scanner(System.in);
            System.out.println("inserisci secondo numero ");
            int y = in2.nextInt();


            System.out.println("inserire il l'operazione");
            Scanner in3 = new Scanner(System.in);
            Object operazione = String;
            operazione = in3.nextLine();
            
            if(((String) operazione).equalsIgnoreCase("+")){
                System.out.println(x+y);
        }else if(((String) operazione).equalsIgnoreCase("-")){
                System.out.println(x-y);
        }else if(((String)operazione).equalsIgnoreCase("*")){
                 double in1;
                 System.out.println(Math.sqrt(x)+ Math.sqrt(y));
        }else if (((String)operazione).equalsIgnoreCase(
        "/")){
            if (x>y ); 
            System.out.println(Math.sqrt(x)-y);
        }   else {
            System.out.println(Math.sqrt(y)-x);
            
        }
            
            
            
            }

            
        }