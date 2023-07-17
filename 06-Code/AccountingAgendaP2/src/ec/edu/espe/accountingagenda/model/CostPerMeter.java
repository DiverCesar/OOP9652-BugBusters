package ec.edu.espe.accountingagenda.model;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class CostPerMeter {
    private String material;
    private String description;
    private double quantity;
    private double unitPrice;
    private String area;    
    private double costPerMeter;

    public CostPerMeter(String material, String description, double quantity, double unitPrice, String area, double costPerMeter) {
        this.material = material;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.area = area;
        this.costPerMeter = costPerMeter;
    }

    @Override
    public String toString() {
        return "\n Material: " + material + 
               "\n Descripción: " + description + 
               "\n Cantidad: " + quantity + 
               "\n Precio Unitario: " + unitPrice + 
               "\n Area: " + area + 
               "\n Costo por metro cuadrado: " + costPerMeter;
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
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the costPerMeter
     */
    public double getCostPerMeter() {
        return costPerMeter;
    }

    /**
     * @param costPerMeter the costPerMeter to set
     */
    public void setCostPerMeter(double costPerMeter) {
        this.costPerMeter = costPerMeter;
    }
    
    
}
