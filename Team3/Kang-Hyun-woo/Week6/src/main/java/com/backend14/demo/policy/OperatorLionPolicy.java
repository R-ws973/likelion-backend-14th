package com.backend14.demo.policy;



public class OperatorLionPolicy implements Policy {
    @Override
    public boolean isPolicyAllowed(int generation) {
        return generation >=14;
    }
}