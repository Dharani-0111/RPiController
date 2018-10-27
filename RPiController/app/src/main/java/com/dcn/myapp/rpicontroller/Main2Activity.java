package com.dcn.myapp.rpicontroller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends MainActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void openRead(View v){
        Intent intent = new Intent(this,READ.class);
        startActivity(intent);
    }
    public void openGPIO(View v) {
        Intent intent = new Intent(this, GPIO.class);
        startActivity(intent);
    }

    public void terSock(View view) {
        crtSocket est = new crtSocket();
        est.sendData("bkr");
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openAllRead(View view) {
        Intent intent = new Intent(this, fullRead.class);
        startActivity(intent);
    }
}

