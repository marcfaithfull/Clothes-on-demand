package org.example.clothing.pants;

public class MakeAnkleSwingers implements PantsDecorator {
    @Override
    public void decoratePants() {
        System.out.println("Ankle swinger style was applied to your pants");
    }
}
