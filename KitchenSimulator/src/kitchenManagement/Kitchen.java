package kitchenManagement;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {

    private List<Cook> cooks = new ArrayList<>();
    private List<KitchenHelper> kitchenHelpers = new ArrayList<>();
    private List<Employee> employees= new ArrayList<>();   
    private Chef chef;


    void hireCook(Cook cook){
        cooks.add(cook);
    }


    void hireKitchenHelper(KitchenHelper kitchenHelper){
        kitchenHelpers.add(kitchenHelper);
    }

    Kitchen(Chef chef){
        this.chef=chef;
    }

    List<DataSharer> getKitchenHelperInfo(){
        List<DataSharer> kitchenHelperInfo = new ArrayList<>();

        for(KitchenHelper kitchenHelper: kitchenHelpers){
            kitchenHelperInfo.add(kitchenHelper);
        }

        return kitchenHelperInfo;
    }


    public void simulateKitchen(int simulationTime){
        chef.setKitchenHelpersInfo(getKitchenHelperInfo());
        for (int i = 0; i<simulationTime;i++){
            chef.doingTheJob();

           for (Cook cook: cooks){
               cook.doingTheJob();
           }

           for (KitchenHelper kitchenHelper: kitchenHelpers){
               kitchenHelper.doingTheJob();
           }
        }
    }


}
