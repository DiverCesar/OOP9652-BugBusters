package ec.edu.espe.accountingagenda.model;

/**
 *
 * @author  BugBuster, DCCO-ESPE
 */

public class Budget {
    private String material;
    private String description;
    private double quantity;
    private String unit;
    private double unitPrice;
    private double totalCost;

    public Budget(String material, String description, double quantity, String unit, double unitPrice, double totalCost) {
        this.material = material;
        this.description = description;
        this.quantity = quantity;
        this.unit = unit;
        this.unitPrice = unitPrice;
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "\n Material: " + material + 
               "\n Descripción: " + description + 
               "\n Cantidad: " + quantity + 
               "\n Unidad: " + unit + 
               "\n Precio Unitario: " + unitPrice + 
               "\n Total: " + totalCost;
    }

    public Object[] toObjectArray() {
        return new Object[]{this.material, this.description, this.quantity, this.unit, this.unitPrice, this.totalCost};
    }
    
    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the quantity
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the totalCost
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * @param totalCost the totalCost to set
     */
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    
}
