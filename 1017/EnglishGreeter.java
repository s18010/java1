public class EnglishGreeter implements Greeter {
    @Override
    public void login(Account guest) {
        System.out.println(String.format("hello, %s", guest.getName()));
    }

    @Override
    public void logout(Account guest) {
        System.out.println(String.format("Goodbye"));
    }

    @Override
    public void like(Account guest) {
        System.out.println("thank you");
    }
}
