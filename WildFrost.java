package personal;

import java.util.Scanner;

/**
 *
 * @author carke
 */
public class WildFrost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] ars) {
        int cargas = LeerEntero("Enter the poison charges: ");
        int total = 0;
        calculaVeneno(cargas, total);
    }
    public static long calculaVeneno(int cargas, int total){
        if(cargas == 0){
            System.out.println("Total damage will be: " + total);
            return cargas;
        }else{
            total = total + cargas;
            return (total + calculaVeneno((cargas-1), total));
        }
    }
    public static int LeerEntero(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int entero = 0;
        
        System.out.print(prompt);
        entero = scanner.nextInt();
        //scanner.close();
        return entero;
    }
}
