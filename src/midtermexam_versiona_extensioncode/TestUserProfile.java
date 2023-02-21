/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author adria
 */
import java.util.Scanner;

public class TestUserProfile {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the profile creator.");
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("Please select your favorite genre from the list:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Mystery");
        
        int genreChoice = input.nextInt();
        String genre;
        switch(genreChoice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Mystery";
                break;
          
            default:
                System.out.println("Invalid choice. Defaulting to Comedy.");
                genre = "Comedy";
        }
        
        UserProfile userProfile = new UserProfile(name, genre);
        System.out.println("Congratulations, your user profile has been created!");
    }
}

class UserProfile {
    private String userID;
    private String favoriteGenre;
    
    public UserProfile(String userID, String favoriteGenre) {
        this.userID = userID;
        this.favoriteGenre = favoriteGenre;
    }
}
