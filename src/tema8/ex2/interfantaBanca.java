package tema8.ex2;

public interface interfantaBanca {
    String openAccount();

    default int withdrawAmount(int amount) {
        return amount;
    }

    int depositAmount(int amount);
}
