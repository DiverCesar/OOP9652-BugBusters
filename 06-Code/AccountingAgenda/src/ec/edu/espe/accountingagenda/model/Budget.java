
package ec.edu.espe.accountingagenda.model;

import java.util.Scanner;

/**
 *
 * @author Edison Ludeña, BugBuster, DCCO-ESPE
 */
public class Budget {
    private String activity;
    private double quantity;
    private double unitPrice;
    private double totalCost;

    
    public Budget (){
    
}
    public Budget(String activity, double quantity, double unitPrice, double totalCost) {
        this.activity = activity;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalCost = totalCost;
    }
    
    
    public void calculateBudget() {
    Scanner scanner = new Scanner(System.in);

    double totalCost = 0;
    boolean go = true;

    do {
        System.out.print("Ingrese el nombre de la actividad a calcular: ");
        String activity = scanner.nextLine();

        System.out.print("Ingrese la cantidad de material necesario: ");
        double quantity = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese el precio unitario: ");
        double unitPrice = scanner.nextDouble();
        scanner.nextLine();

        double activityCost = quantity * unitPrice;
        totalCost += activityCost;

        System.out.println("El costo de la actividad '" + activity + "' es: " + activityCost);

        boolean validEntry = false;
        while (!validEntry) {
            System.out.println("¿Desea añadir otra actividad?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            String opcion = scanner.nextLine();

            try {
                int opcionNum = Integer.parseInt(opcion);
                if (opcionNum == 2) {
                    go = false;
                    validEntry = true;
                } else if (opcionNum == 1) {
                    validEntry = true;
                } else {
                    System.out.println("Opción inválida. Por favor, ingrese 1 o 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese 1 o 2.");
            }
        }
    } while (go);

    System.out.println("\nEl costo total del presupuesto es: " + totalCost);
}


    
    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    
    

    
}

