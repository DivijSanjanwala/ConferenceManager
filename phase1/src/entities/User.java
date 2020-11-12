package entities;

import java.lang.reflect.Array;
import java.util.ArrayList;

/** An abstract user to be extended */
public abstract class User {
    /** The unique ID of this user */
    private int userID;
    /** The username of this user */
    private String username;
    /** The password of this user */
    private String password;
    /** The list of menu options available to this user */
    public ArrayList<String> menuOptions = new ArrayList<String>();
    /** The first name of this user */
    public String firstName;

    /**
     * Create a new User and generate its base available menu options
     *
     * @param username the username of this user
     * @param password the password of this user
     * @param ID the unique ID of this user
     */
    public User(String username, String password, int ID, String firstName) {
        this.userID = ID;
        this.username = username;
        this.password = password;
        this.firstName = firstName;

        this.menuOptions.add("messages");
        this.menuOptions.add("contacts");
        this.menuOptions.add("schedule");
        this.menuOptions.add("events");
        this.menuOptions.add("sign out");
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    @Override
    public String toString() {
        String delimiter = Character.toString((char) 31);
        return  userID + delimiter + username + delimiter + password + delimiter + firstName;
    }

    /**
     * Return list of available menu options of this user
     *
     * @return list of available menu options
     */
    public ArrayList<String> getMenuOptions() {
        return this.menuOptions;
    }
}
