package overriding.publication;

public class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    @Override
    public String getDetails() {
        return "title=\"" + getTitle() + "\"" + ", daysToExpire=" + daysToExpire;
    }
}

