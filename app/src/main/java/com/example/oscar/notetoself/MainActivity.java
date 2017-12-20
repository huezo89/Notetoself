package com.example.oscar.notetoself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Note mTempNote = new Note();

    public void createNewNote(Note n){
        //Temporary code
        mTempNote = n;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Temporary code
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Create a new DialogShowNote called Dialog
                DialogShowNote dialog = new DialogShowNote();

                //Send the note via the sendNoteSelected method
                dialog.sendNoteSelected(mTempNote);

                //Create the dialog
                dialog.show(getFragmentManager(),"123");
            }
        });
    }
}
