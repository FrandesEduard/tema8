package tema8.ex2;

import javax.xml.namespace.QName;

public class Brd implements interfantaBanca {
    @Override
    public String openAccount() {
        return "Bun venit la banca BRD!";
    }

    @Override
    public int withdrawAmount(int amount) {
        return amount;
    }

    @Override
    public int depositAmount(int amount) {
        return amount;
    }
}
