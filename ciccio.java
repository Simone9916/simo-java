import java.util.Scanner;
public class ciccio {
    

    public static void main(String[] args) {
        //creazione scanner
            Scanner myObj = new Scanner(System.in);
            //Inserimento numero per la selezione
            System.out.println("inserire 1 se si vuole visualizzare la squadra e 2 se si vuole visualizzare la dirigenza");
            int numero = myObj.nextInt();
            //Switch di selezione
            switch(numero){
                case 1:
                    squadra();
                    break;
                case 2:
                    dirigenza();
                    break;
            }
        }



        
    static void squadra(){
        String operazione;
        int titolari=11;
        int riserve=7;
      
        Scanner myObj = new Scanner(System.in);
        Scanner myObj1 = new Scanner(System.in);
       
        
        System.out.println("il numero di titolari è:"+titolari);
        
        System.out.println(" il numero di riserve è:"+riserve);
       
      
        
           
        }




        
    static void dirigenza(){
        int dirigenti=4;
        int boss=2;
        Scanner myScan=new Scanner(System.in);
        System.out.println(" il numero di dirigenti è:"+dirigenti);
       
        Scanner myScan2=new Scanner(System.in);
        System.out.println(" il numero di boss è:"+boss);
        }
    }

