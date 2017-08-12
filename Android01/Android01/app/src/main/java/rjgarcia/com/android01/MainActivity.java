package rjgarcia.com.android01;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

import rjgarcia.com.android01.Models.UserModel;

public class MainActivity extends Activity {

    EditText txtUsername;
    EditText txtPassword;
    Button btnEntar;
    Button btnRegistrarse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = (EditText) findViewById(R.id.txt_username);
        txtPassword = (EditText) findViewById(R.id.txt_password);
        btnEntar = (Button) findViewById(R.id.btn_entrar);
        btnRegistrarse = (Button) findViewById(R.id.btn_registrarse);


        btnEntar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _username = txtUsername.getText().toString();
                String _password = txtPassword.getText().toString();

                if(_username.equals("rjgarcia") && _password.equals("Open.001")){
                    Intent i = new Intent(MainActivity.this, DashboardActivity.class);
                    UserModel _user = new UserModel("rjgarcia","Open.001","Roberto","Garcia",1,27);
                    i.putExtra("SessionUser", _user);
                    startActivity(i);
                }
                else{
                    AlertDialog.Builder errorDialog = new AlertDialog.Builder(MainActivity.this);
                    errorDialog.setTitle(getResources().getString(R.string.AlertDialogTitle));
                    errorDialog.setMessage(getResources().getString(R.string.ErrorCredenciales));
                    errorDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    errorDialog.show();
                }

            }
        });

        btnRegistrarse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });

    }
}
