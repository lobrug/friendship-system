package service;

import com.sun.net.httpserver.Request;
import domain.User;
import domain.Visibility;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendsList {


    public static void requestAddFriend(User user1, User user2){
        if(user2.getVisibility() == Visibility.HIDDEN){
            System.out.println("It's not possible to add this person");
        }else if(user2.getVisibility() == Visibility.PUBLIC){
            for(int i = 0; i < user2.getRequestList().length; i++){
                if(user2.getRequestList()[i] == null){
                    user2.getRequestList()[i] = user1;
                    System.out.println("Sucessfully sent friend request");
                    break;
                }
            }

        }
    }

    public static void addFriend(User user1, User user2){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < user2.getRequestList().length; i++){
            if(user2.getRequestList()[i] != null){
                System.out.println(user1.getName()+" sent you a friend request, do you wanna accept it?");
                String response = input.nextLine();
                if(response.equals("yes")){
                    user2.getFriendsList()[i] = user1;
                    System.out.println("Sucessfully accepted friend request");
                }else if(response.equals("no")){
                    user2.getRequestList()[i] = null;
                    System.out.println("Rejected the friend request");
                }else{
                    return;
                }
            }
        }
    }

}
