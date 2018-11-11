package com.company;

import java.util.concurrent.Callable;

public class KassirClient
{

    public static void main(String[] args) {
        KassirMediator mediator = new KassirMediatorImpl();
        User user1 = new Order(mediator, "CherryCakeBäkerei");
        User user2 = new Order(mediator, "ChockoCakeBäkerei");
        User user3 = new ClientImpl(mediator, "Jamilya");
        User user4 = new ClientImpl(mediator, "Nursultan");
        User user5 = new ClientImpl(mediator, "Kylym");

        user4.setEnable(false);
        user5.setEnable(false);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);

        user3.send("Die Bestellung auf den CherryCake und den ChokoCake");

    }

}