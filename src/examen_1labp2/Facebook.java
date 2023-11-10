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


public class Facebook extends SocialClass implements Commentable{
public static  StringBuilder lista = new StringBuilder();

    private ArrayList<Comment> comentarios;
    
    public Facebook(String Username) {
        super(Username);
        comentarios = new ArrayList<>();
        
    }

    @Override
    public boolean addComment(Comment comment) {
        int postId = comment.getPostId();
        if (postId >= 0 && postId < posts.size()) {
            comentarios.add(comment);
            return true;
        }
        return false;
    }

    @Override
    public void timeline() {
      for (int i = 0; i < posts.size(); i++) {
            lista.append("POST ").append(i).append("\n").append(posts.get(i)).append("\n").append("Comentarios:");
            for (Comment comment : comentarios) {
                if (comment.getPostId() == i) {
                    lista.append(comment.print());
                }
            }
            lista.append("\n");
      }
    }
}