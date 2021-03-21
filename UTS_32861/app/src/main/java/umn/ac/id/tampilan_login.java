package umn.ac.id;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class tampilan_login extends AppCompatActivity {

    Button btnLogin;
    EditText loginText, passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_login);

        loginText = findViewById(R.id.email);
        passwordText = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);


//        getSupportActionBar().setTitle("Login Page");

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = loginText.getText().toString();
                String password = passwordText.getText().toString();

                if(username.equals("uasmobile") && (password.equals("uasmobilegenap"))) {
//                    Toast.makeText(tampilan_login.this, "Selamat datang, Toast.LENGTH_SHORT).show();
                    openDaftarMusic();
                    //TampilDialog();
                }else{
                    Toast.makeText(tampilan_login.this, "Username / Password Salah.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void openDaftarMusic (){
        Intent intent = new Intent(tampilan_login.this, daftar_lagu.class);
        startActivity(intent);
    }



}