package com.zh.mynews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
private Window window;
    private BottomNavigationView nav;
    private FrameLayout frame;

    private EnglishNewspaper english;
    private BanglaNewspaper bangla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT>=21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.transparent));
        }
        setContentView(R.layout.activity_main);
        nav=findViewById(R.id.bottom);
        frame=findViewById(R.id.fr3);

        english=new EnglishNewspaper();
        bangla=new BanglaNewspaper();

        nav.setSelectedItemId(R.id.banglanews);
        setFragment(bangla);

        nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.banglanews:
                        setFragment(bangla);
                        return true;

                    case R.id.englishnews:
                        setFragment(english);
                        return true;

                    default:
                        return false;


                }
            }
        });


    }



    private void setFragment(Fragment fragment){
        FragmentTransaction frag=getSupportFragmentManager().beginTransaction();
        frag.replace(R.id.fr3,fragment);
        frag.commit();
    }


    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_baseline_exit_to_app_24)
                .setTitle("MyNews")
                .setMessage("Do you want to close the application?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }
}