import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
public class qarray {
    public static void main(String[]args) {
        ArrayList<String>name=new ArrayList<String>();
        ArrayList<Integer>eta=new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        Scanner myObj = new Scanner(System.in);
        Scanner myObj1 = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        
            System.out.println("inserisci cosa vuoi fare? ");
            int x = in.nextInt();
            String s;
            int selezione,z;

            selezione=myObj.nextInt();
            if (selezione==1);{
           
            System.out.println("Inserire nome");
            s = myObj1.nextLine();
              name.add(s);
             
            
             System.out.println("Inserire eta");
            z = myObj2.nextInt();
             eta.add(z);
              System.out.println("l'array nome è\n" +(name));
              System.out.println("l'array eta è\n" +(eta));
            
            }

    }

   
   
    
}
