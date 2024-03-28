package abstract_class.website;

abstract class BaseEntity {
    protected long id;
    protected long version;

    abstract long getId();

    abstract void setId(long id);

    abstract long getVersion();

    abstract void setVersion(long version);
}


