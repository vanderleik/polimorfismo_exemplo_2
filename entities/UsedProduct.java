package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Método sobrescrito que cria uma etiqueta com os dados de um produto usado, atribuindo uma data de fabricação à etiqueta
     */
    @Override
    public String priceTag(){
        return super.priceTag() + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
    }

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
