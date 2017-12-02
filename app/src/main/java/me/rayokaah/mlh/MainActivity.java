package me.rayokaah.mlh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void requestPickup() {
        EditText description = (EditText) findViewById(R.id.description);
        String descriptionText = description.getText().toString();
        EditText name = (EditText) findViewById(R.id.name_field);
        String nameText = name.getText().toString();
        /** To do write the code to store in the database
         * send descriptionText and nameTesxt and send notification with the info to the Gabbage collector
         */

    }

}
