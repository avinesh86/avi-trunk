package com.example.navin.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.android.dashboard.PMDashBoardActivity;

public class Home extends PMDashBoardActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);



    }



    public void onButtonClicker(View v) {
        try {
            Intent intent;

            switch (v.getId()) {
                case R.id.perm_emp:
                    // intent = new Intent(this, Activity_Shift.class);
                    intent = new Intent(this, Perm_Emp.class);

                    startActivity(intent);
                    break;

                case R.id.cont_emp:
                    //intent = new Intent(this, PM_Generate_Shift.class);
                    //intent = new Intent(this, PM_Player.class);
                    intent = new Intent(this, Cont_Emp.class);
                    startActivity(intent);
                    break;

                case R.id.leaves:
                    intent = new Intent(this, Leaves.class);
                    startActivity(intent);
                    break;

                case R.id.transport:
                    intent = new Intent(this, Transport.class);
                    startActivity(intent);
                    break;

                case R.id.food:
                    intent = new Intent(this, Food.class);
                    startActivity(intent);
                    break;

                case R.id.fertilizer:
                    intent = new Intent(this, Fertilizer.class);
                    startActivity(intent);
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
