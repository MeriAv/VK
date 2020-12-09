public class PostManager {

    Post post = new Post();

private class Post{
    private String[] owner_id;
    private String[] domain;
    private String[] query;
    private String[] owners_only;
    private String[] count;
    private String[] offset;
    private String[] post_id;

    public String[] getPost_id() {
        return post_id;
    }

    public void setPost_id(String[] post_id) {
        this.post_id = post_id;
    }

    public void setOwner_id(String[] owner_id) {
        this.owner_id = owner_id;
    }

    public void setDomain(String[] domain) {
        this.domain = domain;
    }

    public void setQuery(String[] query) {
        this.query = query;
    }

    public void setOwners_only(String[] owners_only) {
        this.owners_only = owners_only;
    }

    public void setCount(String[] count) {
        this.count = count;
    }

    public void setOffset(String[] offset) {
        this.offset = offset;
    }

    public String[] getOwner_id() {
        return owner_id;
    }

    public String[] getDomain() {
        return domain;
    }

    public String[] getQuery() {
        return query;
    }

    public String[] getOwners_only() {
        return owners_only;
    }

    public String[] getCount() {
        return count;
    }

    public String[] getOffset() {
        return offset;
    }
}

    public Post[] Search(){
        this.Post();
        return null;
    }

    public void Delete(){

    }

}

