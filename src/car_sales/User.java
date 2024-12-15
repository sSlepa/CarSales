/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_sales;

public class User { 
    private String username;
    private String email;
    private String password;
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
    public User(String username, String email, String password, boolean isAdmin, boolean isGuest) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isGuest = isGuest;
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

    // Getters
    public String getUsername() {
        return username;
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
