package kitchenManagement;

import java.util.*;

    class Chef extends Employee {

    private static final int CHANCE_TO_YELL = 70;
    private static Random rand = new Random();
    private List<DataSharer> kitchenHelpersInfo;


    Chef(String name, Date birthDate, int amount) {
        super(name, birthDate, amount);
    }



    private boolean isYellingForIngredients(){
        // Make a separate package for Random
        return rand.nextInt(100) <= CHANCE_TO_YELL;
    }

    private void yellingForIngredient(){
        boolean isYelling = isYellingForIngredients();
            if (isYelling){
                Ingredients ingredientInNeed = chooseIngredient();
                System.out.println("The chef is yelling for: "+ ingredientInNeed);
                requestingIngredient(ingredientInNeed);
            }
    }



     private Ingredients chooseIngredient(){
         Ingredients ingredient;
         int randomElement = rand.nextInt(Ingredients.values().length);
         ingredient = Ingredients.values()[randomElement];
         return ingredient;
     }


    @Override
    void doingTheJob() {
        System.out.println("Chef is yelling for with cooks");
        yellingForIngredient();

    }

    private void requestingIngredient(Ingredients ingredient){
        int requestCounter = 0;
        for(DataSharer kitchenHelper: kitchenHelpersInfo){
            if(kitchenHelper.ingredientRequestHandler(ingredient)){
                System.out.println(kitchenHelper.getName() +" has the ingredient");
                break;
            }
            requestCounter++;
        }
        if(requestCounter == kitchenHelpersInfo.size()) System.out.println("Sorry Chef we are out");
    }

    void setKitchenHelpersInfo(List<DataSharer> kitchenHelperInfo) {
        this.kitchenHelpersInfo = kitchenHelperInfo;
    }

}
