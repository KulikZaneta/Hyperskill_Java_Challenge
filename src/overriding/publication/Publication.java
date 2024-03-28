package overriding.publication;

class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public String getDetails() {
        return "title=\"" + title + "\"";
    }

    public String getTitle() {
        return this.title = title;
    }

}

