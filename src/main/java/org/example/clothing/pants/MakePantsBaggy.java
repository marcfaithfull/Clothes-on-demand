package org.example.clothing.pants;

public class MakePantsBaggy implements PantsDecorator {
    @Override
    public void decoratePants() {
        System.out.println("Baggy fit was applied to your pants");
    }
}
