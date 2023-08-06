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
    private double costPerMeter1;

    public CostPerMeter(String material, String description, double quantity, double unitPrice, String area, double costPerMeter1) {
        this.material = material;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.area = area;
        this.costPerMeter1 = costPerMeter1;
    }
    
    public Object[] toObjectArray() {
        return new Object[]{this.material, this.description, this.quantity, this.unitPrice, this.area, this.costPerMeter1};
    }

    @Override
    public String toString() {
        return "\n Material: " + material + 
               "\n Descripción: " + description + 
               "\n Cantidad: " + quantity + 
               "\n Precio Unitario: " + unitPrice + 
               "\n Area: " + area + 
               "\n Costo por metro cuadrado: " + costPerMeter1;
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
     * @return the costPerMeter1
     */
    public double getCostPerMeter1() {
        return costPerMeter1;
    }

    /**
     * @param costPerMeter1 the costPerMeter1 to set
     */
    public void setCostPerMeter1(double costPerMeter1) {
        this.costPerMeter1 = costPerMeter1;
    }
    
    
}
