package CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex03.Entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price = price;
    }

    public Double subTotal(){
        return quantity*product.getPrice();
    }

    @Override
    public String toString() {
        return product.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
