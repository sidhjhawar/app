package com.example.sidharth.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    String currentData = "";
    int currentPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        currentData = getIntent().getStringExtra("currentText");
        currentPosition = getIntent().getIntExtra("position", -1);
        EditText editText = (EditText) findViewById(R.id.mtEditItem);
        editText.setText(currentData);
        editText.setSelection(editText.getText().length());
    }

    public void onSave(View view){
        Intent returnData =  new Intent();
        EditText editText = (EditText) findViewById(R.id.mtEditItem);
        returnData.putExtra("newData", editText.getText().toString());
        returnData.putExtra("position", currentPosition);
        setResult(RESULT_OK, returnData);
        this.finish();
    }

}
