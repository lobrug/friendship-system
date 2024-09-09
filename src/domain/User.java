package domain;

import java.time.LocalDateTime;

public class User {
    protected String name;
    protected LocalDateTime registerDate;
    protected Visibility visibility;
    protected User[] friendsList;
    protected User[] requestList;




    public User(String name, Visibility visibility) {
        this.name = name;
        this.registerDate = LocalDateTime.now();
        this.visibility = visibility;
        this.friendsList = new User[99];
        this.requestList = new User[99];

    }

    public String getName() {
        return name;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public User[] getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(User[] friendsList) {
        this.friendsList = friendsList;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public User[] getRequestList() {
        return requestList;
    }

    public void setRequestList(User requestList) {
        this.requestList = new User[]{requestList};
    }
}
