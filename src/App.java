import domain.User;
import domain.Visibility;
import service.FriendsList;

import static service.FriendsList.addFriend;
import static service.FriendsList.requestAddFriend;

public class App {
    public static void main(String[] args) {
        User user1 = new User("Lorenzo", Visibility.HIDDEN);
        User user2 = new User("Joao", Visibility.PUBLIC);


        requestAddFriend(user1, user2);
        addFriend(user1, user2);
    }
}