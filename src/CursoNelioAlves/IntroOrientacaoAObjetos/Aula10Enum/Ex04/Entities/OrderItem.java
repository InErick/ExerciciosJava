package CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex04.Entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(){

    }

    public OrderItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal(){
        return price*getQuantity();
    }

    @Override
    public String toString() {
        return product.getName()+", $"
                +product.getPrice()+", Quantity: "
                +quantity+", Subtotal: $"
                +String.format("%.2f", subTotal());
    }
}
