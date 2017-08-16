package com.ibiz.gitteamlag;

/**
 * Created by Iretioluwa on 9/14/2017.
 */

public class GitHubDev {

    private String profileImg;
    private String profileUrl;
    private String userName;

    public GitHubDev(String userName, String profileUrl, String profileImg) {
        this.userName = userName;
        this.profileUrl = profileUrl;
        this.profileImg = profileImg;
    }

    public String getUserName() {
        return userName;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public String getProfileUrl() {
        return profileUrl;
    }


}
