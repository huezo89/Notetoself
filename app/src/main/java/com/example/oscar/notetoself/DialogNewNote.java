package com.example.oscar.notetoself;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by oscar on 12/17/2017.
 */

public class DialogNewNote extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_new_note,null);

        final EditText editTitle = (EditText) dialogView.findViewById(R.id.editTitle);
        final EditText editDescription = (EditText)dialogView.findViewById(R.id.editDescription);
        final CheckBox checkBoxIdea = (CheckBox)dialogView.findViewById(R.id.checkBoxIdea);
        final CheckBox checkBoxTodo = (CheckBox)dialogView.findViewById(R.id.checkBoxTodo);
        final CheckBox checkBoxImportant = (CheckBox)dialogView.findViewById(R.id.checkBoxImportant);
        Button btnCancel = (Button)dialogView.findViewById(R.id.btnCancel);
        Button btnOK = (Button)dialogView.findViewById(R.id.btnOK);

        builder.setView(dialogView).setMessage("Add a new note");

        //Handle the cancel button
        btnCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                dismiss();
            }
        });

        //Handle the OK button
        btnOK.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Create a new note
                Note newNote = new Note();
            }
        });


    }

}
