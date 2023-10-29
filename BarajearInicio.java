import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BarajearInicio {
    int Opc1,Opc2,Opc3,Opc4,Opc5;
    
         
    public void Mezclar(){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        Collections.shuffle(numeros);
         Opc1 = numeros.get(0);
         Opc2 = numeros.get(1);
         Opc3 = numeros.get(2);
         Opc4 = numeros.get(3);
         Opc5 = numeros.get(4);}
    /*public static void main(String[] args) {
        // Imprime los valores asignados a las variables.
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("Número 3: " + numero3);
        System.out.println("Número 4: " + numero4);
        System.out.println("Número 5: " + numero5);
    }*/
}