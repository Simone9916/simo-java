import java.util.ArrayList;
import java.util.Scanner;
public class team {
                
                                  public static void main(String[] args)
                                {
                                        Scanner anagrafica = new Scanner(System.in);
                                        String[] array = {"nome","cognome","email","età"};
                                        String[] infografica = {"","","",""};
                                        
                                        for (int i = 0; i < array.length; i++) {
                                        System.out.println("Inserire " + array[i]);
                                        infografica [i]= anagrafica.nextLine();
                                        }
                                       for(String string:infografica){

                                       
                                        System.out.println(string +" ");
                                        }

                                      
                                        }}
                                