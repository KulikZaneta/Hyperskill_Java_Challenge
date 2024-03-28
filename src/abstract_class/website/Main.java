package abstract_class.website;

class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("John Grant");
        System.out.println(user.getName().toString());

        BaseEntity userEntity = user;
        userEntity.setId(100);
        userEntity.setVersion(1);
        System.out.println(user.getId());
        System.out.println(user.getVersion());

        WebSite site = new WebSite();
        site.setUrl("https://hyperskill.org");
        System.out.println(site.getUrl().toString());

        BaseEntity siteEntity = site;
        siteEntity.setId(101);
        siteEntity.setVersion(1);
        System.out.println(siteEntity.getId());
        System.out.println(siteEntity.getVersion());

        Visit visit = new Visit();
        visit.setUser(user);
        visit.setSite(site);
        System.out.println(visit.getUser());
        System.out.println(visit.getSite());

        BaseEntity baseVisit = visit;
        baseVisit.setId(102);
        baseVisit.setVersion(103);
        System.out.println(baseVisit.getId());
        System.out.println(baseVisit.getVersion());
    }
}

