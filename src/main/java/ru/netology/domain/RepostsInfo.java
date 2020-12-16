package ru.netology.domain;

public class RepostsInfo {
  private int count;
    private  int user_reposted;

    public int getCount() {
        return count;
    }

    public int getUser_reposted() {
        return user_reposted;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setUser_reposted(int user_reposted) {
        this.user_reposted = user_reposted;
    }

}
