/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_1labp2;
import java.util.ArrayList;
/**
 *
 * @author aleja
 */


public abstract class SocialClass {

    protected ArrayList<String> Friends;
    protected ArrayList<String> posts;
    protected String Username;

    private StringBuilder lista = new StringBuilder();

    public SocialClass(String Username) {
        this.Friends = new ArrayList();
        this.posts = new ArrayList();
        this.Username = Username;
    }

    public boolean addFriend(String user) {
        for (String Friend : Friends) {
            if(!user.equals(Friend)&&!user.equals(Username)) {
                Friends.add(user);
                return true;
            }
        }
     return false;
    }

    public void addPost(String msg) {
    posts.add(msg);
    }

    public abstract void timeline();

    public void myProfile() {
        lista.append("Nombre de Usuario: ").append(Username).append("\n");
        timeline();
        int largo;
        if(Friends.size()>10){
            largo = Friends.size()/10;
        }else{
            largo=Friends.size();
        }
        for (int i = 0; i < largo/10; i++) {
            for (int j = 0; j < 10; j++) {
                lista.append(Friends.get(i)).append(" ");
            }
            lista.append("\n");
        }
    }
}