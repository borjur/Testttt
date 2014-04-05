package beans;

import entities.Notes;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "notesController")
@ViewScoped
public class NotesController extends AbstractController<Notes> implements Serializable {

    public NotesController() {
        super(Notes.class);
    }
}
