public interface Greeter {
    String login(Account guest);
    String logout(Account guest);
    String like(Account guest);
}

/*
    private String getLoginMessage(Account guest) {
        switch (guest.getCountry()) {
            case JAPAN:
                return String.format("こんにちは、%sさん", guest.getName());
            case FRANCE:
                return String.format("Bonjour, %s", guest.getName());
            case GERMANY:
                return String.format("Guten Tag, %s", guest.getName());
            case USA:
            default:
                return String.format("hello, %s", guest.getName());
        }
    }

    public void logout(Account guest) {
        System.out.println(getLogoutMessage(guest));
    }

    private String getLogoutMessage(Account guest) {
        switch (guest.getCountry()) {
            case JAPAN:
                return "さようなら";
            case FRANCE:
                return "au revoir";
            case GERMANY:
                return "Aus Wiedersehen";
            case USA:
            default:
        return "goodbye";
        }
    }
}
*/
