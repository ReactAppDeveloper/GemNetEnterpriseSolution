package com.example.xhanii.gemnetenterprisesolution;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


public class Chooseaction extends Activity implements View.OnClickListener {
    private Button logout;
    private Button report;
    private Button create_user;
    private Button update;
    private Button gnt_invoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_chooseaction);

        create_user = (Button) findViewById(R.id.create_user);
        report = (Button) findViewById(R.id.report);
        logout = (Button) findViewById(R.id.logout);
       // update = (Button) findViewById(R.id.update);
       // gnt_invoice = (Button) findViewById(R.id.gnt_invoice);

      //  gnt_invoice.setOnClickListener(this);
      //  update.setOnClickListener(this);
        create_user.setOnClickListener(this);
        report.setOnClickListener(this);
        logout.setOnClickListener(this);

//for chk network
        ConnectivityManager cManager = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
        NetworkInfo nInfo = cManager.getActiveNetworkInfo();
        if (nInfo != null && nInfo.isConnected())
        {
            //  Toast.makeText(this, "Network is available", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Network is not available", Toast.LENGTH_LONG).show();
        }


    }

    //Logout function
    private void logout(){
        //Creating an alert dialog to confirm logout
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure you want to logout?");
        alertDialogBuilder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        //Getting out sharedpreferences
                        SharedPreferences preferences = getSharedPreferences(Config.SHARED_PREF_NAME, Context.MODE_PRIVATE);
                        //Getting editor
                        SharedPreferences.Editor editor = preferences.edit();

                        //Puting the value false for loggedin
                        editor.putBoolean(Config.LOGGEDIN_SHARED_PREF, false);

                        //Putting blank value to email
                        editor.putString(Config.EMAIL_SHARED_PREF, "");

                        //Saving the sharedpreferences
                        editor.commit();

                        //Starting login activity
                        Intent intent = new Intent(Chooseaction.this, MainActivity.class);
                        startActivity(intent);
                    }
                });

        alertDialogBuilder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });

        //Showing the alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

    @Override
    public void onClick(View v) {
        if(v == logout){
            logout();
        }
        if(v == create_user){
            startActivity(new Intent(this,Create_user.class));
        }
     //   if(v == update){
           // startActivity(new Intent(this,Chk_update.class));
      //  }
      //  if(v == gnt_invoice){
          //  startActivity(new Intent(this,Invoice.class));
      //  }
        if(v == report){
            startActivity(new Intent(this,Report.class));
        }
      //  if(v == push_notify){
           // startActivity(new Intent(this,process.class));
      //  }
    }
    @Override
    public void onBackPressed() {

    }
}