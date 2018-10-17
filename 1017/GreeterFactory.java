public class GreeterFactory {
    public static Greeter getGreeter(Account guest) {
        switch (guest.getCountry()) {
            case JAPAN:
                return new JapaneseGreeter();
            case FRANCE:
                return new FrenchGreeter();
            case GERMANY:
                return new GermanGreeter();
            case ITALIAN:
                return new ItalianGreeter();
            case USA:
            default:
                return new EnglishGreeter();
        }
    }
}
