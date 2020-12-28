package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus order;
	
	private Client client;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus order, Client client) {
		this.moment = moment;
		this.order = order;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrder() {
		return order;
	}
	

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item){
		items.remove(item);
	}
	
	public Double total() {
		Double sum = 0.0;
		
		for(OrderItem ord : items) {
			sum += ord.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nORDER SUMMARY:");
		sb.append("\nOrder moment: " + sdf.format(moment));
		sb.append("\nOrder status: " + order);
		sb.append("\nClient: " + client);
		sb.append("\nOrderItems: ");
		for(OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("\nTotal price:" + String.format("%.2f", total()));		
		return sb.toString();		
	}
}
