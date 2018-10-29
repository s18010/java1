public class ItalianGreeter implements Greeter {
    @Override
    public String login(Account guest) {
        return String.format("Buongirono %s", guest.getName());
    }

    @Override
    public String logout(Account guest) {
        return ("Ciao");
    }

    @Override
    public String like(Account guest) {
        return ("grazie mille");
    }
}
