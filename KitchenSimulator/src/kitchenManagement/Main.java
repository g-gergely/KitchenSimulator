package kitchenManagement;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main (String[] args){
        Kitchen kitchen = new Kitchen(new Chef("Gordon Ramsey",new Date(1966, Calendar.NOVEMBER, 8),1000));


        kitchen.hireCook(new Cook("Jamie Oliver", new Date(1978, Calendar.OCTOBER, 06),500));
        kitchen.hireKitchenHelper(new KitchenHelper("Brigitte Kovacs",new Date(1996, Calendar.MARCH, 15),100 ));
        kitchen.hireKitchenHelper(new KitchenHelper("Helper Joe", new Date(1998, Calendar.JUNE, 05),100));

        kitchen.simulateKitchen(20);

    }
}
