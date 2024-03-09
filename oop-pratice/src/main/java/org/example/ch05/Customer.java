package org.example.ch05;

public class Customer {
    
    public void order(String menuName, Menu menu, Cooking cooking) {
        MenuItem menuItem = menu.chose(menuName);
        Cook cook = cooking.makeCook(menuItem);
    }
}
