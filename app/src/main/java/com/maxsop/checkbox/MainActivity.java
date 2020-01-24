package com.maxsop.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_submit;
    CheckBox cb_adnan, cb_shahin, cb_piyal, cb_baky, cb_shibbir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set the view
        btn_submit = findViewById(R.id.btn_submit);
        cb_adnan = findViewById(R.id.cb_adnan);
        cb_shahin = findViewById(R.id.cb_shahin);
        cb_piyal = findViewById(R.id.cb_piyal);
        cb_baky = findViewById(R.id.cb_baky);
        cb_shibbir = findViewById(R.id.cb_shibbir);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder txt = new StringBuilder();

                // work with checkbox
                if (cb_adnan.isChecked()) {
                    txt.append(cb_adnan.getText().toString() + " ");
                }

                if (cb_shahin.isChecked()) {
                    txt.append(cb_shahin.getText().toString() + " ");
                }

                if (cb_piyal.isChecked()) {
                    txt.append(cb_piyal.getText().toString() + " ");
                }

                if (cb_baky.isChecked()) {
                    txt.append(cb_baky.getText().toString() + " ");
                }

                if (cb_shibbir.isChecked()) {
                    txt.append(cb_shibbir.getText().toString() + " ");
                }

                Toast.makeText(getApplicationContext(), txt, Toast.LENGTH_LONG).show();

            }
        });


        // checkbox event listener
        cb_adnan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    String name = buttonView.getText().toString();
                    Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
