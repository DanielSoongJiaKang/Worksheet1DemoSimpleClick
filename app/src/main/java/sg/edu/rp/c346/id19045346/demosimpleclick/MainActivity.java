package sg.edu.rp.c346.id19045346.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    //Decalre Variable
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplay = findViewById(R.id.buttonDisplay);
        tvDisplay = findViewById(R.id.textViewDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);





        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean on = tbtn.isChecked();
                boolean off = !tbtn.isChecked();

                if(on) {
                    etInput.setEnabled(true);
                }
                else if(off) {
                    etInput.setEnabled(false);

                }

            }


        });






        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Code for Action
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);
            }
        });


    }

}
