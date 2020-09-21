package ac.id.poltekkampar.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username =  findViewById(R.id.username);
        password =  findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    startActivity(new Intent(MainActivity.this, Welcome.class));
                    Toast.makeText(getApplicationContext(), "Username dan Password Anda Benar", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(), "Username dan Password Anda Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}