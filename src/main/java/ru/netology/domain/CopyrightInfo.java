package ru.netology.domain;

public class CopyrightInfo {
   private int id;
    private String[] link;
    private String[] name;
    private String[] type;

    public void setId(int id) {
        this.id = id;
    }

    public void setLink(String[] link) {
        this.link = link;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String[] getLink() {
        return link;
    }

    public String[] getName() {
        return name;
    }

    public String[] getType() {
        return type;
    }
}
