package fi.jamk.logintoast;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView)
                findViewById(R.id.username); // add stings to control
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,
                new String[]
                        {"Pasi", "Juha", "Kari", "Jouni", "Esa", "Hannu"});
        actv.setAdapter(aa);
    }

    public void buttonClicked(View view) {

        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.username);
        String login = actv.getText().toString();
        // password
        EditText et = (EditText) findViewById(R.id.password);
        String password = et.getText().toString();
        // get context
        Context context = getApplicationContext();
        // toast message to screen
        Toast.makeText(context, login+" "+password, Toast.LENGTH_LONG).show();
    }
}
