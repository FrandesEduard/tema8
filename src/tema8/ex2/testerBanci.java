package tema8.ex2;

public class testerBanci {
    public static void main(String[] args) {
        ing retragere = new ing();
        System.out.println("ati retras " + retragere.withdrawAmount(20));
        Brd deschidereCont = new Brd();
        System.out.println(deschidereCont.openAccount());
        Bt depunere = new Bt();
        System.out.println("ati depus " + depunere.depositAmount(1423));
    }
}
