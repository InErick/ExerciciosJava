package CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex03.Entities;

import CursoNelioAlves.IntroOrientacaoAObjetos.Aula10Enum.Ex03.Enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy : HH:mm:ss");
    private Date moment;
    private OrderStatus orderStatus;

    private Client client;

    public Order(Date moment, OrderStatus orderStatus, Client client) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    private List<OrderItem> orderItemList = new ArrayList<>();

    public void addItem(OrderItem orderItem){
        orderItemList.add(orderItem);
    }

    public void removeItem(OrderItem orderItem){
        orderItemList.remove(orderItem);
    }

    public Double total(){
        Double sum = 0.0;
        for(OrderItem o : orderItemList){
            sum += o.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(orderStatus + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : orderItemList) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}
