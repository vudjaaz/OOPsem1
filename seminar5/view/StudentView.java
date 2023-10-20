package seminar5.view;

import seminar5.model.User;

public class StudentView<T extends User> {

    public void sendOnConsole(T user){

        System.out.println(user.toString());
    }
}
