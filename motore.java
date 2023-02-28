import java.util.Scanner;

public class motore {
  
    public static void main (String[]args){
        Scanner myobj=new Scanner(System.in);
        System.out.println("inserire la potenza frenante");
        int PF = myobj.nextInt();
        
        Scanner myobj2=new Scanner(System.in);
        System.out.println("inserire numero pastiglie");
        int NE=myobj2.nextInt();
       
        Scanner myobj3=new Scanner(System.in);
        System.out.println("inserire la cilindrata");
        int CI = myobj3.nextInt();
        
        Scanner myobj4=new Scanner(System.in);
        System.out.println("inserire numero pistone");
        int PI=myobj4.nextInt();

        Scanner myobj5=new Scanner(System.in);
        System.out.println("inerire la targa");
        String T=myobj5.nextLine();
       
        System.out.println("la potenza frenante è"+ PF);
        System.out.println("il numero di pastiglie è"+ NE);
        System.out.println("la cilindrata è"+ CI);
        System.out.println("il numero di pistoni è"+PI);
        System.out.println("la targa è"+T);
    }

    
}
