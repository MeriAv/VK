package ru.netology.domain;

public class PostSourceInfo {

   private String[] type;
    private String[] platform;
    private String[] data;
    private String[] url;
    public void setType(String[] type) {
        this.type = type;
    }

    public void setPlatform(String[] platform) {
        this.platform = platform;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public void setUrl(String[] url) {
        this.url = url;
    }

    public String[] getType() {
        return type;
    }

    public String[] getPlatform() {
        return platform;
    }

    public String[] getData() {
        return data;
    }

    public String[] getUrl() {
        return url;
    }

}
