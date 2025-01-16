/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class User { 
    private String username;
    private String email;
    private String password;
    private String profilepic;
    private boolean isAdmin;
    private boolean isGuest;

    /**
     * 
     * @param username nume user
     * @param email email user
     * @param password parola criptata
     * @param isAdmin identificator admin
     * @param isGuest identificator guest
     */
    public User(String username, String email, String password, boolean isAdmin, boolean isGuest,String profilepic) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isGuest = isGuest;
        this.profilepic = profilepic;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setIsGuest(boolean isGuest) {
        this.isGuest = isGuest;
    }
    public void setProfilePic(String path) {
        this.profilepic = path;
    }

    // Getters
    public String getUsername() {
        return username;
    }
    public String getProfilePic() {
        return profilepic;
    }
    public String getPass(){
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isGuest() {
        return isGuest;
    }
}
