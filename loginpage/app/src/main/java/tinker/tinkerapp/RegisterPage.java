package tinker.tinkerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        final EditText RegName = findViewById(R.id.RegName);
        final EditText RegEmail = findViewById(R.id.RegEmail);
        final EditText RegDOB = findViewById(R.id.RegDOB);
        final EditText RegPassword = findViewById(R.id.RegPassword);

    }
}
