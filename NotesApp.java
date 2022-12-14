import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.time.*;

public class NotesApp extends JFrame{
  private JFrame frame;
  private JTextArea notesTextArea;
  private JScrollPane scrollPane;
  private JButton saveButton;
  private ArrayList<Notes> NoteList;
  private JButton myFirstButton;
  private JButton mySecondButton;
  
  public NotesApp() {
    NoteList = new ArrayList<Notes>();
    // create the frame
    frame = new JFrame("Notes App");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);

    // create the text area and add it to a scroll pane
    notesTextArea = new JTextArea();
    scrollPane = new JScrollPane(notesTextArea);

    // create the save button
    saveButton = new JButton("Save");
    saveButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        saveNotes();
      }
    });

    // add the components to the frame
    frame.add(scrollPane, BorderLayout.CENTER);
    frame.add(saveButton, BorderLayout.SOUTH);

    // show the frame
    frame.setVisible(true);
  }

  // save the notes to a file
  private void saveNotes() {
        LocalTime CurrentTime = LocalTime.now();
        String TextInside = notesTextArea.getText();
        Notes TempNote = new Notes(CurrentTime,TextInside);
        NoteList.add(TempNote);
        frame.setVisible(true);
        frame.setVisible(false);
        frame.dispose();
  }
  
  public ArrayList<Notes> getNotes(){
      return NoteList;
  }

  public static void main(String[] args) {
        new NotesApp();
  }
}
