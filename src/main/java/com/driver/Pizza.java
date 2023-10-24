package com.driver;

public class Pizza {

    private int price;
    public int basePrice;
    public int extraCheesePrice;
    public int extraToppingsPrice;
    public int paperBagPrice;

    private boolean isExtraCheese;
    private boolean isExtraToppings;
    private boolean isTakeAway;
    private boolean isBill;

    private String bill;

    public Pizza(Boolean isVeg){
        // your code goes here
        this.extraCheesePrice = 80;
        this.paperBagPrice = 20;
        if(isVeg){
            this.basePrice = 300;
            this.extraToppingsPrice = 70;
        }
        else{
            this.basePrice = 400;
            this.extraToppingsPrice = 120;
        }
    this.price = basePrice;


    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese){
            this.price += extraCheesePrice;
            isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppings){
            this.price += extraToppingsPrice;
            isExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += paperBagPrice;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBill){
            this.bill = "Base Price Of The Pizza: "+this.basePrice+"\n";
            if(isExtraCheese){
                this.bill = this.bill+"Extra Cheese Added: "+this.extraCheesePrice+"\n";
            }
            if(isExtraToppings){
                this.bill = this.bill+"Extra Toppings Added: "+this.extraToppingsPrice+"\n";
            }
            if(isTakeAway){
                this.bill = this.bill+"Paperbag Added: "+this.paperBagPrice+"\n";
            }
            this.bill = this.bill+"Total Price: "+this.price+"\n";
        }
        return this.bill;
    }
}
