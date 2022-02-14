package com.spinghelloworld.helloworld;

public class Greeter implements GreeterInterface{
    private String name;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGreeting() {
        return "Hello! " + name;
    }
}
