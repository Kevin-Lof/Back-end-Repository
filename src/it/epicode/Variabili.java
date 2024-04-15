package it.epicode;

public class Variabili {
    public static void main(String[] args) {
        int x; // dichiarazione di una variabile
        x=4; //posso sovrascrivere il dato quando voglio, chiudere sempre le dichiarazioni con ;
        boolean b = true; //dichiarazione ed assegnazione
        char c= 'd'; //char assume solo un carattere, sempre tra singoli apici
        double d = 3.3; //assume doppio carattere, tipo in virgola mobile e a doppia precisione
        String s = "Benvenuti al corso epicode"; //doppi apici obbligatori, va scritta con s maiuscola perchè stringa, dichiarata come fosse un primitivo
        String fraseConcatenata = s + x; // + non è una somma è una concatenazione
        System.out.println(fraseConcatenata);
        final int y = 3; //final trasforma in costante l'int e non si può più modificarne il valore
        byte b2 = 100; //tipo byte è il tipo più piccolo, va da -128 a 127
        x = b2;
        System.out.println(x);
        b2 = (byte) x; // cast esplicito per convertire
        int[] numeri = new int[6]; // crea un array intero con dimensione fissa prestabilita nelle quadre, dimensione non cambiabile
        numeri[0]= 3; //metti in prima posizione dell'array il numero 3
        int[] numeri2 = {3,5,7}; // creazione array pieno, limitante perchè se metto 3 valori l'array ha tre valori non mutabili

    }
}
