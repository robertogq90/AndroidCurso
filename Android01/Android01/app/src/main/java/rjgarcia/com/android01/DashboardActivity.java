package rjgarcia.com.android01;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import rjgarcia.com.android01.Models.UserModel;

public class DashboardActivity extends Activity {

    EditText txtNombreUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        UserModel _user = (UserModel)getIntent().getExtras().getSerializable("SessionUser");
        txtNombreUsuario = (EditText) findViewById(R.id.txtNombreUsuario);
        txtNombreUsuario.setText(_user.getFullName());

    }
}
