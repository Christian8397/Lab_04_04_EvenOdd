//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int numToExamine = 2;
        int numToExamine2 = 3;




        int quotient = 0;
        int modulo = 0;

        quotient = 2 / numToExamine;
        System.out.println("Quotient = " + quotient);
        modulo = 2 % numToExamine;
        System.out.println("Remainder = " + modulo + " which means that the remainder is " + "even");

        quotient = numToExamine2 / 2;
        System.out.println("Quotient = " + quotient);
        modulo = numToExamine2 % 2;
        System.out.println("remainder = " + modulo + " which means that the remainder is " + "odd");




    }
}