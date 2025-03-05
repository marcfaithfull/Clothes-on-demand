package org.example.clothing.pants;

public class PantsModifier {
    private PantsModification pantsModification;


    public void setPantsModification(PantsModification pantsModification) {
        this.pantsModification = pantsModification;
    }

    public void confirm() {
        pantsModification.execute();
    }
}
