public class GermanGreeter implements Greeter {
    @Override
    public void login(Account guest) {
        System.out.println(String.format("Guten tag %s", guest.getName()));
    }

    @Override
    public void logout(Account guest) {
        System.out.println(String.format("Auf Wiedersehen"));
    }

    @Override
    public void like(Account guest) {
        System.out.println("Danke schon");
    }
}
