package ru.mkliman.Kliman_first_boot.dto;

/**
 * DTO for User discussion info.
 */
public class UserDiscussionInfo {

    private Boolean isBookmarked;
    private Integer lastTime;
    private Integer newCommentsCount;

    public Boolean getBookmarked() {
        return isBookmarked;
    }

    public void setBookmarked(Boolean bookmarked) {
        isBookmarked = bookmarked;
    }

    public Integer getLastTime() {
        return lastTime;
    }

    public void setLastTime(Integer lastTime) {
        this.lastTime = lastTime;
    }

    public Integer getNewCommentsCount() {
        return newCommentsCount;
    }

    public void setNewCommentsCount(Integer newCommentsCount) {
        this.newCommentsCount = newCommentsCount;
    }
}
