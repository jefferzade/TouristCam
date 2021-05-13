package com.tests.nizhniy800.toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

import com.tests.nizhniy800.MainActivity;
import com.tests.nizhniy800.R;

public class Profile extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        drawerLayout=findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view) { MainActivity.openDrawer(drawerLayout);}

    public void ClickLogo(View view){
        MainActivity.closeDrawer(drawerLayout);

    }
    public void ClickHome(View view){
        MainActivity.redirectActivity(this,MainActivity.class);
    }

    public void ClickDashboard(View view){
        MainActivity.redirectActivity(this, Dashboard.class);
    }

    public void ClickAboutUs(View view){
        MainActivity.redirectActivity(this, AboutUs.class);
    }

    public void ClickProfile(View view) {recreate();}

    public void ClickSettings(View view) {MainActivity.redirectActivity(this, Settings.class);}

    public void ClickLogout(View view){
        MainActivity.logout(this);

    }
    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.closeDrawer(drawerLayout);
    }
}
