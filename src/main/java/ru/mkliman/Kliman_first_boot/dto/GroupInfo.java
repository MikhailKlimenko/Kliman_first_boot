package ru.mkliman.Kliman_first_boot.dto;

/**
 * Group Info DTO class.
 */
public class GroupInfo {

    private Integer id;
    private String avatarUrl;
    private String createTime;
    private String description;
    private String key;
    private Integer levelToEditor;
    private MeGroupInfo meGroupInfo;
    private String pictureUrl;
    private String title;
    private GroupInfoType type;
    private Integer userCount;
    private GroupVisibilityStatus visibilityStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getLevelToEditor() {
        return levelToEditor;
    }

    public void setLevelToEditor(Integer levelToEditor) {
        this.levelToEditor = levelToEditor;
    }

    public MeGroupInfo getMeGroupInfo() {
        return meGroupInfo;
    }

    public void setMeGroupInfo(MeGroupInfo meGroupInfo) {
        this.meGroupInfo = meGroupInfo;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GroupInfoType getType() {
        return type;
    }

    public void setType(GroupInfoType type) {
        this.type = type;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public GroupVisibilityStatus getVisibilityStatus() {
        return visibilityStatus;
    }

    public void setVisibilityStatus(GroupVisibilityStatus visibilityStatus) {
        this.visibilityStatus = visibilityStatus;
    }

    @Override
    public String toString() {
        return "GroupInfo{" +
                "id=" + id +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", createTime='" + createTime + '\'' +
                ", description='" + description + '\'' +
                ", key='" + key + '\'' +
                ", levelToEditor=" + levelToEditor +
                ", meGroupInfo=" + meGroupInfo +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", userCount=" + userCount +
                ", visibilityStatus=" + visibilityStatus +
                '}';
    }
}
