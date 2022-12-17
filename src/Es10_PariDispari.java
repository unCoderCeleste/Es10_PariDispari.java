/*
Esercizio 10:
Scrivere un frammento di codice che cambi il valore intero memorizzato nella variabile x
nel seguente modo:
se x è pari, deve essere diviso per 2;
se è dispari deve essere moltiplicato per 3 e gli deve esser sottratto 1.
 */
import java.util.Scanner;
public class Es10_PariDispari {
    public static void main(String[] args) {
        Scanner pardis= new Scanner(System.in);
        System.out.println("PARI O DISPARI. OPERAZIONI.");
        System.out.print("Ingressa un numero: ");
        int x= pardis.nextInt();
        System.out.print("Se è pari lo dividiamo per 2\nSe è dispari lo moltiplichiamo per 3 e poi sottraiamo 1.\n\n");
        if((x%2)==0){
            int par=(x/2);
            System.out.println("È pari. Dividiamo " +x +" per 2: " +par);
        }
        else{
            int dis=(x*3)-1;
            System.out.println("È dispari. Moltiplichiamo " +x +" per 3 e gli sosttraiamo 1: " +dis);
        }
    }
}