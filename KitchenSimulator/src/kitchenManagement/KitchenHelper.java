package kitchenManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

class KitchenHelper extends Employee implements DataSharer {


    private int ingredientsToKeep = 3;
    private List<Ingredients> ingredientsList = new ArrayList<>();


    KitchenHelper(String name, Date birthDate, int amount) {
        super(name, birthDate, amount);
        grabIngredients();

    }

    private void grabIngredients(){
        Random rand = new Random();
        for(int i = 0; i < ingredientsToKeep; i++){
            int caseNum= rand.nextInt(3);
            Ingredients chosenIngredient = chooseIngredient(caseNum);
            ingredientsList.add(chosenIngredient);


        }
    }


    private Ingredients chooseIngredient(int caseNum){
        Ingredients ingredient;
        switch (caseNum){
            case 0:
                ingredient = Ingredients.CARROT;
                break;
            case 1:
                ingredient = Ingredients.POTATO;
                break;
            case 2:
                ingredient = Ingredients.MEET;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + caseNum);
        }
        return ingredient;
    }

    private boolean isIngredientAvailable(Ingredients neededIngredient){
        boolean isAvailable = false;
        for (Ingredients ingredient: ingredientsList){
            if(ingredient == neededIngredient){
                isAvailable=true;
            }
        }
        return isAvailable;
    }

    public boolean ingredientRequestHandler(Ingredients ingredient){    //Create an interface to the Chef
        boolean haveIt = false;
        if(isIngredientAvailable(ingredient)) {
            System.out.println(name+ " has the "+ ingredient);
            ingredientsList.remove(ingredient);
            haveIt=true;
        }
            else {
                // Else return with a message
                System.out.println(name + " does not have it!");
            }
            return haveIt;
        }

        public String getName(){
            return name;
        }



    @Override
    void doingTheJob() {
    System.out.println(name+" kitchen helper doing their job");

    }
}
