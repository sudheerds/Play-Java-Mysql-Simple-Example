package controllers;
import com.avaje.ebean.Ebean;
import play.data.Form;
import play.mvc.*;
import models.Post;
import java.util.List;

public class Application extends Controller {

    private static final Form<Post> postform = Form.form(Post.class);

    public  Result index() {
        return ok(views.html.index.render(postform));
    }

    public Result save() {
        Form<Post> boundform = postform.bindFromRequest();
        Post p = boundform.get();
        Ebean.save(p);
        return redirect(routes.Application.display());
    }

    public Result edit(int id) {

        Post p = Post.find.byId(id);
        Ebean.delete(p);
        Form<Post> boundform = postform.bindFromRequest();
        p = boundform.get();
        Ebean.save(p);
        return redirect(routes.Application.display());
    }

    public Result find() {
        
        return TODO;
    }


    public Result display() {
         List<Post> al = Post.find.all();
        return ok(views.html.display.render(al));
    }

    public Result delete(int id) {
        final Post p = Post.find.byId(id);
        Ebean.delete(p);
        return redirect(routes.Application.display());
    }

    public Result details(int id){
        final Post p = Post.find.byId(id);
        Form<Post> filledform = postform.fill(p);
        return ok(views.html.details.render(filledform,id));
    }


}
