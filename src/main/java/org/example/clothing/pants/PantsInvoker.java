package org.example.clothing.pants;

public class PantsInvoker {
    private PantsInvoker pantsInvoker;

    public void setPantsCommand(PantsCommand pantsCommand) {}

    public void setStyle(Pants pants, PantsCommand pantsCommand) {
        pantsCommand.execute(pants);
    }
}
