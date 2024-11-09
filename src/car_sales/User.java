/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_sales;

/**
 *
 * @author adria
 */
public class User {
    private static String username;
    private static String email;
    private static String password;
    private static boolean isAdmin;
    private static boolean isGuest;

    // Setters
    public static void setUsername(String username) {
        User.username = username;
    }

    public static void setEmail(String email) {
        User.email = email;
    }

    public static void setIsAdmin(boolean isAdmin) {
        User.isAdmin = isAdmin;
    }

    public static void setIsGuest(boolean isGuest) {
        User.isGuest = isGuest;
    }

    // Getters
    public static String getUsername() {
        return username;
    }

    public static String getEmail() {
        return email;
    }

    public static boolean isAdmin() {
        return isAdmin;
    }

    public static boolean isGuest() {
        return isGuest;
    }
}
