package org.example.clothing.pants;

public class PantsStyleInvoker {

    public void setStyle(Pants pants, PantsCommand pantsCommand) {
        pantsCommand.execute(pants);
    }
}
