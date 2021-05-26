package ru.mkliman.Kliman_first_boot.dto;

/**
 * Group information related to authorized user. If there is no user - will be null.
 */
public class MeGroupInfo {
    private MeGroupInfoStatus status;
    private Integer userGroupId;

    public MeGroupInfoStatus getStatus() {
        return status;
    }

    public void setStatus(MeGroupInfoStatus status) {
        this.status = status;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }
}
