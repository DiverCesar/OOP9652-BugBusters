
package ec.edu.espe.accountingagenda.model;

/**
 *
 * @author Edison LudeÃ±a, BugBuster, DCCO-ESPE
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
