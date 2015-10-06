package models;
//import java.sql.*;
import com.avaje.ebean.Model;
import javax.persistence.*;
//import java.util.*;

/**
 * Created by sudheerds on 5/10/15.
 */
@Entity
public class Post extends Model {

    @Id
    public int id;
    public String name;
    public String post;

    public static Finder<Integer, Post> find =
            new Finder<>(Post.class);

}

    /*private static List<Post> al;
    private static Connection myCon;
    private static Statement myStmt;
    private static ResultSet myRs;*/

    /*public Post(int id, String name, String post) {
        this.id=id;
        this.name = name;
        this.post = post;
    }

    public Post() throws java.sql.SQLException{
        myCon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","test","demo");
        myStmt=myCon.createStatement();
        al = new ArrayList<Post>();
    }

    public List<Post> getPosts() throws java.sql.SQLException{

        String query = "select * from posts";
        myRs=myStmt.executeQuery(query);
        while(myRs.next())
            al.add(new Post(myRs.getInt(0),myRs.getString(1),myRs.getString(2)));
        return al;
    }

    public boolean addPost() throws java.sql.SQLException{
        String query = "insert into posts values("+ this.id+","+ this.name+","+this.post +")";
        //int i =
        myStmt.executeUpdate(query);
        return true;
    }

    public boolean deletePost() throws java.sql.SQLException{
        String query = "delete from posts where id=this.id";
        myRs=myStmt.executeQuery(query);
        return true;
    }

    public boolean editPost(String post) throws java.sql.SQLException{
        String query = "select * from posts where id="+this.id;
        myRs=myStmt.executeQuery(query);
        Post p = new Post(myRs.getInt(0),myRs.getString(1),myRs.getString(2));
        p.deletePost();
        p.post=post;
        p.addPost();
        return true;
    }


}*/
