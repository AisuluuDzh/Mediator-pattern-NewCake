package com.company;

public abstract class User {
    protected KassirMediator mediator;
    protected String name;
    protected boolean isEnable = true;

    public User(KassirMediator med, String name){
        this.mediator=med;
        this.name=name;
    }
    public boolean isEnable() {
        return isEnable;
    }
    public void setEnable(boolean isEnable){
        this.isEnable = isEnable;
    }
    public String getName() {
        return name;
    }
    public abstract void send(String ord);
    public abstract void receive(String ord);
}
