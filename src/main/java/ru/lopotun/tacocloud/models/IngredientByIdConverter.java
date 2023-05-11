package ru.lopotun.tacocloud.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import ru.lopotun.tacocloud.models.Ingredient.Type;
import ru.lopotun.tacocloud.repository.IngredientRepository;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

   private IngredientRepository ingredientRepo;

   @Autowired
   public IngredientByIdConverter (IngredientRepository ingredientRepo) {
       this.ingredientRepo = ingredientRepo;
   }
    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }
}
