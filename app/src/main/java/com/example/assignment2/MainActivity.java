package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageButton imageButton;
    Switch switch1;
    RadioButton dis, en;
    CheckBox checkBox;
    Button button;
    int counter = 0;

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = findViewById(R.id.imageButton);
        imageView = findViewById(R.id.imageView);
        switch1 = findViewById(R.id.switch1);
        dis = findViewById(R.id.Disabled);
        en = findViewById(R.id.Enabled);
        checkBox = findViewById(R.id.checkBox);
        button = findViewById(R.id.Button);

    }
    public void swap(View view)
    {
        if(counter%2==0)
        {
            imageView.setImageResource(R.drawable.ghost_button);
            imageButton.setImageResource(R.drawable.ghost);
            counter++;
        }
        else
        {
            imageView.setImageResource(R.drawable.ghost);
            imageButton.setImageResource(R.drawable.ghost_button);
            counter++;
        }
    }
    public void visibility(View view)
    {
        if(switch1.isChecked()==true)
            imageView.setVisibility(View.VISIBLE);
        else
            imageView.setVisibility(View.INVISIBLE);
        if(dis.isChecked()==true)
            imageButton.setEnabled(false);
        else
            imageButton.setEnabled(true);
        if(checkBox.isChecked()==true)
            imageButton.setVisibility(View.VISIBLE);
        else
            imageButton.setVisibility(View.INVISIBLE);
    }
}
