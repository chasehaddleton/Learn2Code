package com.chasehaddleton.Learn2Code.cards;

public enum Value {
    C_2("2"),
    C_3("3"),
    C_4("4"),
    C_5("5"),
    C_6("6"),
    C_7("7"),
    C_8("8"),
    C_9("9"),
    C_10("10"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King"),
    ACE("Ace");

    String name;

    Value(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}