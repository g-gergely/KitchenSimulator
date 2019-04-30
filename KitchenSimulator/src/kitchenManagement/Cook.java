package kitchenManagement;

import java.util.Date;

public class Cook extends Employee {
    Cook(String name, Date birthDate, int amount) {
        super(name, birthDate, amount);
    }

    @Override
    void doingTheJob() {
    System.out.println(name+ " is Cooking!");
    }
}
