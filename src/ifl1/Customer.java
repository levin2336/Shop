package ifl1;

import abiturklassen.*;

public class Customer {
    private String name;
    private double money;
    private Stack<Product> shoppingCart;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.shoppingCart = new Stack<>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void addProduct(Product product, int amount){
        for (int i = 0; i < amount; i++){
            shoppingCart.push(product);
        }
        System.out.println(product+" wurde "+amount+"x zum Einkaufswagen von "+name+" hinzugefügt");
    }

    public void removeLastProduct(){
        System.out.println(shoppingCart.top().getName()+" wurde aus dem Einkaufswagen entfernt");
        shoppingCart.pop();
    }
}
