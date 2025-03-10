package org.example;

import org.example.clothing.ItemOfClothing;

import java.util.List;

public class Receipt {
    int id;
    String name;
    List<ItemOfClothing> orderItems;

    public Receipt(Order order) {
        this.id = order.getId();
        this.name = order.getName();
        this.orderItems = order.getItemsOrdered();
    }

    public void printReceipt(Customer customer) {
        int totalPrice = 0;
        System.out.println("-----------------------------------------------------");
        System.out.println("Customer Receipt");
        System.out.println("Receipt id #" + id);
        System.out.println("Receipt code: " + name);
        System.out.println("Customer name: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Email: " + customer.getMail());
        for (ItemOfClothing itemOfClothing : orderItems) {
            System.out.println();
            System.out.println("Item:");
            System.out.println(itemOfClothing);
            totalPrice += itemOfClothing.getPrice();
        }
        System.out.println("------------------------");
        System.out.println("Total paid: " + totalPrice);
    }
}
