package sg.edu.rp.c346.id12345678.demodatabasecrud;

import java.io.Serializable;

import androidx.annotation.NonNull;

public class Note implements Serializable {
    private int id;
    private String noteContent;

    public Note(int id, String noteContent) {
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    @NonNull
    @Override
    public String toString() {
        return "ID:" + id + ", " + noteContent;
    }
}
