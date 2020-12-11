package packege.domain;

class Author {
    private String name;
    private String timePublicPost;
    private String photo;
    private String iconOpen;
    private String idManagerAuthor;

    public void setIdManagerAuthor(String idManagerAuthor) {
        idManagerAuthor = idManagerAuthor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setIconOpen(String iconOpen) {
        this.iconOpen = iconOpen;
    }

    public void setTimePublicPost(String timePublicPost) {
        this.timePublicPost = timePublicPost;
    }

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }

    public String getIconOpen() {
        return iconOpen;
    }

    public String getTimePublicPost() {
        return timePublicPost;
    }

    public String getIdManagerAuthor() {
        return idManagerAuthor;
    }
}
