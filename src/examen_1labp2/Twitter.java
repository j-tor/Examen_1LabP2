/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_1labp2;

/**
 *
 * @author aleja
 */
public class Twitter extends SocialClass {
    private StringBuilder lista = new StringBuilder();
    public Twitter(String username) {
        super(username);
    }

    @Override
    public void timeline() {
        lista.append("Timeline:");

        for (int i = 0; i < posts.size(); i++) {
            lista.append("POST ").append(i+1);
            lista.append(posts.get(i)).append("\n");
        }
    }
}
