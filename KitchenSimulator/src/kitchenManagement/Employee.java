package kitchenManagement;

import java.util.Currency;
import java.util.Date;

public abstract class Employee {

    protected String name;

    protected Date birthDate;

    protected Currency currency;        //Set currency in need

    protected int amount;

    Employee(String name, Date birthDate, int amount){
        this.name=name;
        this.birthDate=birthDate;
        this.amount=amount;

    }


    double calculateTax(){
        return amount*0.99;
    }

    abstract void doingTheJob();



}


