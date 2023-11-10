/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_1labp2;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author aleja
 */

public class Comment {
private int postId;
private String autor;
private String comentario;
private Calendar fecha;


    public Comment(int postId, String autor, String comentario) {
        this.postId = postId;
        this.autor = autor;
        this.comentario = comentario;
        this.fecha = Calendar.getInstance();
        
    }

    public String print(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return autor+" "+dateFormat.format(fecha.getTime())+"\n"+comentario;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }
}
