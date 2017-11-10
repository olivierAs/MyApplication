package cgodin.qc.ca.myapplication;

import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cgodin.qc.ca.myapplication.SQLite;
import cgodin.qc.ca.myapplication.personne.Personne;

public class MainActivity extends AppCompatActivity implements testInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changerFragment(new FragmentAcceuil(), false);
    }



    @Override
    public void changerFragment(Fragment frag, boolean back) {
        if(!back)
            getSupportFragmentManager().beginTransaction().replace(R.id.mainID, frag).commit();
        else
            getSupportFragmentManager().beginTransaction().replace(R.id.mainID, frag).addToBackStack(null).commit();
    }
}
