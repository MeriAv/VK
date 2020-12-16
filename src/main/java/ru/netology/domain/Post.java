package ru.netology.domain;

public class Post {
    private int  postponedId;
    private int canPin;
    private int  canDelete;
    private int integer;
    private int isPinned;
    private int markedAsAds;
    private int booleanSignerId;
    private String[] postType;
    private int  id;
    private int ownerId;
    private int fromId;
    private int  createdBy;
    private int date;
    private String[] text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private LikesInfo likesInfo;
private CommentsInfo CommentsInfo;
private CopyrightInfo CoperightInfo;
private DonutInfo DonutInfo;
private GeoInfo GeoInfo;
private PostSourceInfo PostSourceInfo;
private RepostsInfo RepostsInfo;

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public void setBooleansignerId(int booleansignerId) {
        this.booleanSignerId = booleansignerId;
    }

    public void setPostType(String[] postType) {
        this.postType = postType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setText(String[] text) {
        this.text = text;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public void setCommentsInfo(ru.netology.domain.CommentsInfo commentsInfo) {
        CommentsInfo = commentsInfo;
    }

    public void setCoperightInfo(CopyrightInfo coperightInfo) {
        CoperightInfo = coperightInfo;
    }

    public void setDonutInfo(ru.netology.domain.DonutInfo donutInfo) {
        DonutInfo = donutInfo;
    }

    public void setGeoInfo(ru.netology.domain.GeoInfo geoInfo) {
        GeoInfo = geoInfo;
    }

    public void setPostSourceInfo(ru.netology.domain.PostSourceInfo postSourceInfo) {
        PostSourceInfo = postSourceInfo;
    }

    public void setRepostsInfo(ru.netology.domain.RepostsInfo repostsInfo) {
        RepostsInfo = repostsInfo;
    }

    public void setViewInfo(ViewsInfo viewInfo) {
        ViewInfo = viewInfo;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public int getCanPin() {
        return canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public int getInteger() {
        return integer;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public int getBooleansignerId() {
        return booleanSignerId;
    }

    public String[] getPostType() {
        return postType;
    }

    public int getId() {
        return id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public int getDate() {
        return date;
    }

    public String[] getText() {
        return text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public ru.netology.domain.CommentsInfo getCommentsInfo() {
        return CommentsInfo;
    }

    public CopyrightInfo getCoperightInfo() {
        return CoperightInfo;
    }

    public ru.netology.domain.DonutInfo getDonutInfo() {
        return DonutInfo;
    }

    public ru.netology.domain.GeoInfo getGeoInfo() {
        return GeoInfo;
    }

    public ru.netology.domain.PostSourceInfo getPostSourceInfo() {
        return PostSourceInfo;
    }

    public ru.netology.domain.RepostsInfo getRepostsInfo() {
        return RepostsInfo;
    }

    public ViewsInfo getViewInfo() {
        return ViewInfo;
    }

    private ViewsInfo ViewInfo;
}
