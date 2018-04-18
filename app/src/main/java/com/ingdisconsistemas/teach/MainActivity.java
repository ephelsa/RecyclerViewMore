package com.ingdisconsistemas.teach;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView welcome;
    private EditText name;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Forma de definir */
        welcome = findViewById(R.id.welcome);
        name = findViewById(R.id.name);
        image = findViewById(R.id.image);

        /* Forma 1: Evento clic directamente  */
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pinguin();
            }
        });

        /* Forma 2: Evento con intrefaz */
        welcome.setOnClickListener(this);
    }

    private void pinguin() {
        Toast.makeText(this, "Soy un Pingüino", Toast.LENGTH_LONG)
                .show();
    }

    private void sayMyName(String name) {
        Toast.makeText(this, getText(R.string.welcome) + " " + name, Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onClick(View view) {
        if (view == welcome) {
            sayMyName(name.getText().toString());
        }

    }
}
