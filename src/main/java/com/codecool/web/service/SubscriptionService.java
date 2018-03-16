package com.codecool.web.service;

import com.codecool.web.model.Subscription;

public final class SubscriptionService {

    public Subscription subscripting() {
        return new Subscription("Your subscription was successful.");
    }

    public Subscription notSubscripting() {
        return new Subscription("Your subscription was not successful. Please try it again.");
    }
}
