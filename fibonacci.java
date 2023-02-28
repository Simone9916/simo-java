import java.util.Scanner;
public class fibonacci {
    

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("quanti numeri di fibonacci vuoi far stampare :: ");
int num = input.nextInt();
System.out.println("---------");

int counter = 0;
int firstNum = 0;
int secondNum = 1;
System.out.println(secondNum);

           
while(counter < num)
{
int advanceNum = firstNum + secondNum;
System.out.println(advanceNum);
firstNum = secondNum;
secondNum = advanceNum;

counter ++;

if (advanceNum % 2!=0)
System.out.println("il numero è dispari");}}}