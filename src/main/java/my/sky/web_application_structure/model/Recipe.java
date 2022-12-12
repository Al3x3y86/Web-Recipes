package my.sky.web_application_structure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {

    private String titleRecipe;
    private int cookingTimeMinutes;
    private ArrayList<Ingredient> ingredientsList;
    private LinkedList<String> cookingInstruction;

}
