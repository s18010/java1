public class GermanGreeter implements Greeter {
    @Override
    public String login(Account guest) {
        return String.format("Guten tag %s", guest.getName());
    }

    @Override
    public String logout(Account guest) {
        return ("Auf Wiedersehen");
    }

    @Override
    public String like(Account guest) {
        return ("Danke schon");
    }
}
