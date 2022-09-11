public class Author {
    public final String name;
    public final String surName;


    public String getName() {
        return name;
    }


    public String getSurName() {
        return surName;
    }

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
