package com.chasehaddleton.Learn2Code;

public enum Coins {
    Penny(0.01),
    Nickle(0.05),
    Dime(0.10),
    Quarter(0.25),
    Loonie(1.00),
    Toonie(2.00);

    double dollarValue;

    Coins(double dollarValue){
        this.dollarValue = dollarValue;
    }

    double getDollarValue(){
        return dollarValue;
    }
}