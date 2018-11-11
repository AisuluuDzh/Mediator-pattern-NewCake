package com.company;

import java.util.ArrayList;
import java.util.List;

public class KassirMediatorImpl implements KassirMediator {
    private List<User> users;

    public KassirMediatorImpl(){
        this.users=new ArrayList<>();
    }

    @Override
    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public void sendOrder(String ord, User user) {
        for(User u : this.users){
            if(u != user && u.isEnable()){
                u.receive(ord);
            }
        }
    }
}
