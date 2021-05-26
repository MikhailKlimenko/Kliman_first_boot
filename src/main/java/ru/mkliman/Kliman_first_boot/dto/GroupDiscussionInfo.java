package ru.mkliman.Kliman_first_boot.dto;

public class GroupDiscussionInfo  extends GroupInfo {

    private UserDiscussionInfo userDiscussionInfo;
    private Integer commentsCount;

    public UserDiscussionInfo getUserDiscussionInfo() {
        return userDiscussionInfo;
    }

    public void setUserDiscussionInfo(UserDiscussionInfo userDiscussionInfo) {
        this.userDiscussionInfo = userDiscussionInfo;
    }

    public Integer getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }
}