package com.company;

public class Order extends User{
    public Order(KassirMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String ord){
        System.out.println(this.name +  " : "+ord);
        mediator.sendOrder(ord, this);
    }
    @Override
    public void receive(String ord){
        System.out.println(this.name+"  : "+ord);
    }

}