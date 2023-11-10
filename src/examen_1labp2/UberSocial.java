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



public class UberSocial {
    private ArrayList <SocialClass> RedesSociales;

    public UberSocial() {
        this.RedesSociales = new ArrayList<>();
    }
    
    private SocialClass buscar(String username,int i) {
        if(RedesSociales.size()>i){
            if(RedesSociales.get(i).Username.equals(username))
                return RedesSociales.get(i);
            return buscar(username, i+1);
        }
        return null;
    }

    public void agregarCuenta(String username, String tipo) {
        if(buscar(username,0)==null){
            if(tipo.equals("TWITTER")){
            SocialClass nuevacuenta = new Twitter(username);
            RedesSociales.add(nuevacuenta);
            }else{
            SocialClass nuevacuenta = new Facebook(username);
            RedesSociales.add(nuevacuenta);    
            }
        }
    }

    public void agregarPost(String user, String post) {
       if(buscar(user,0)!=null){
           buscar(user,0).addPost(post);
       }
    }

    public void agregarAmigo(String user1, String user2) {
        if(buscar(user2,0)!=null&&buscar(user1,0)!=null){
            
            if(buscar(user2,0) instanceof Facebook && buscar(user1,0) instanceof Facebook){
                buscar(user1,0).addFriend(user2);
                buscar(user2,0).addFriend(user1);
            }
        }
    }

    public void agregarComment(String user, int postID, String autor, String comment) {
        
        if(buscar(user,0) instanceof Facebook){
           Facebook redes = (Facebook) RedesSociales.get(postID);
           Comment com = new Comment(postID, autor, comment);
           redes.addComment(com);
            System.out.println(redes.addComment(com));
        }
    }

    public void profileFrom(String user) {
        SocialClass cuenta = buscar(user,0);
        if (cuenta != null) {
            cuenta.myProfile();
        }
    }

}
