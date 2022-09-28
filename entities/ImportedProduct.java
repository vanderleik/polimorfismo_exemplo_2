package entities;

public class ImportedProduct extends Product{
    private Double customFee;

    /**
     * Método sobrescrito que cria uma etiqueta com os dados de um produto importado, atribuindo um custom fee à etiqueta
     */
    @Override
    public String priceTag(){
        return super.priceTag() + " (Customs fee: $ " + String.format("%.2f", customFee) + ")";
    }

    public ImportedProduct() {
        super();
    }
    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }
}
