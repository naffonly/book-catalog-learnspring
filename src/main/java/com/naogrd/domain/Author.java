package com.naogrd.domain;

public class Author {
    private Long id;
    private String name;
    private long birthdate;


    public Author() {
        super();
    }

    public Author(Long id, String name, long birthdate) {
        super();
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }
    public Author(Long id,  long birthdate ,String name) {
        super();
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public Author(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(long birthdate) {
        this.birthdate = birthdate;

    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
