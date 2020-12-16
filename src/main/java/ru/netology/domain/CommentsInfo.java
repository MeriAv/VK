package ru.netology.domain;

public class CommentsInfo {
   private int count;
    private int canPost;
    private int groupsCanPost;
    private  boolean canOpen;

    public void setCount(int count) {
        this.count = count;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    private  boolean canClose;

    public int getCount() {
        return count;
    }

    public int getCanPost() {
        return canPost;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

}
