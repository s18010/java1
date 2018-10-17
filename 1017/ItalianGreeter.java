public class ItalianGreeter implements Greeter {
    @Override
    public void login(Account guest) {
        System.out.println(String.format("Buongirono %s", guest.getName()));
    }

    @Override
    public void logout(Account guest) {
        System.out.println(String.format("Ciao"));
    }

    @Override
    public void like(Account guest) {
        System.out.println("grazie mille");
    }
}
