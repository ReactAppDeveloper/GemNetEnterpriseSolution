package com.example.xhanii.gemnetenterprisesolution;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class Create_user extends Activity implements View.OnClickListener{

    Button back;
    Button cancel;
    private Button buttonCreate;

    private EditText userid1;
    private EditText password1;
    private EditText cus_name1;
    private EditText address1;
    private EditText email1;
    private EditText cell_no1;
    private EditText ip_address1;
    private EditText net_package1;
    private EditText total_amount1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);

        buttonCreate = (Button) findViewById(R.id.buttonCreate);
        buttonCreate.setOnClickListener(this);

//for Back
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Finish method is used to close all open activities.
                finish();

            }
        });

//for cancel
        cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Finish method is used to close all open activities.
                finish();

            }
        });



        //Initializing Edittex
        userid1 = (EditText) findViewById(R.id.userid1);
        userid1.setTextColor(Color.parseColor("#FFFFFF"));
        password1 = (EditText) findViewById(R.id.password1);
        password1.setTextColor(Color.parseColor("#FFFFFF"));
        cus_name1 = (EditText) findViewById(R.id.cus_name1);
        cus_name1.setTextColor(Color.parseColor("#FFFFFF"));
        address1 = (EditText) findViewById(R.id.address1);
        address1.setTextColor(Color.parseColor("#FFFFFF"));
        email1 = (EditText) findViewById(R.id.email1);
        email1.setTextColor(Color.parseColor("#FFFFFF"));
        cell_no1 = (EditText) findViewById(R.id.cell_no1);
        cell_no1.setTextColor(Color.parseColor("#FFFFFF"));
        ip_address1 = (EditText) findViewById(R.id.ip_address1);
        ip_address1.setTextColor(Color.parseColor("#FFFFFF"));
        net_package1 = (EditText) findViewById(R.id.net_package1);
        net_package1.setTextColor(Color.parseColor("#FFFFFF"));
        total_amount1 = (EditText) findViewById(R.id.total_amount1);
        total_amount1.setTextColor(Color.parseColor("#FFFFFF"));


    }


    //When no item is selected this method would execute

    private void CreateUser() {
        final String cus_id = userid1.getText().toString().trim();
        final String password = password1.getText().toString().trim();
        final String cus_name = cus_name1.getText().toString().trim();
        final String address = address1.getText().toString().trim();
        final String email = email1.getText().toString().trim();
        final String cell_no = cell_no1.getText().toString().trim();
        final String ip_address = ip_address1.getText().toString().trim();
        final String net_package = net_package1.getText().toString().trim();
        final String total_amount = total_amount1.getText().toString().trim();


        class UpdateEmployee extends AsyncTask<Void, Void, String> {
            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(Create_user.this, "User Creating...", "Please Wait...", false, false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(Create_user.this, s, Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... params) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put(Config.KEY_USER_ID, cus_id);
                hashMap.put(Config.KEY_PASS, password);
                hashMap.put(Config.KEY_USER_NAME, cus_name);
                hashMap.put(Config.KEY_ADDRESS, address);
                hashMap.put(Config.KEY_EMAIL, email);
                hashMap.put(Config.KEY_CELL, cell_no);
                hashMap.put(Config.KEY_IP, ip_address);
                hashMap.put(Config.KEY_PKG, net_package);
                hashMap.put(Config.KEY_AMOUNT, total_amount);
//



                RequestHandler rh = new RequestHandler();

                String s = rh.sendPostRequest(Config.URL_CREATE_USER, hashMap);

                return s;
            }
        }

        UpdateEmployee ue = new UpdateEmployee();
        ue.execute();
    }

    @Override
    public void onClick(View v) {
        if(v == buttonCreate){
            CreateUser();
//            finish();
        }
    }


}