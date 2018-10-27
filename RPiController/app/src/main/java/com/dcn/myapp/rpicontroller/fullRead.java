package com.dcn.myapp.rpicontroller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

public class fullRead extends AppCompatActivity {
    crtSocket est = new crtSocket();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_read);
    }





    public void gpio1(View view) throws IOException {
        TextView t1 =  findViewById(R.id.tv1);
        est.sendData("01red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t1.setText(abc); //set text for text view
    }

    public void gpio2(View view) throws IOException {
        TextView t2 =  findViewById(R.id.tv2);
        est.sendData("02red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t2.setText(abc); //set text for text view
    }

    public void gpio3(View view) throws IOException {
        TextView t3 =  findViewById(R.id.tv3);

        est.sendData("03red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t3.setText(abc); //set text for text view
    }

    public void gpio4(View view) throws IOException {
        TextView t4 =  findViewById(R.id.tv4);

        est.sendData("04red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t4.setText(abc); //set text for text view
    }

    public void gpio5(View view) throws IOException {
        TextView t5 =  findViewById(R.id.tv5);

        est.sendData("05red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t5.setText(abc); //set text for text view
    }

    public void gpio6(View view) throws IOException {
        TextView t6 =  findViewById(R.id.tv6);
        est.sendData("06red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t6.setText(abc); //set text for text view
    }

    public void gpio7(View view) throws IOException {

        TextView t7 =  findViewById(R.id.tv7);
        est.sendData("07red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t7.setText(abc); //set text for text view
    }

    public void gpio8(View view) throws IOException {

        TextView t8 =  findViewById(R.id.tv8);
        est.sendData("08red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t8.setText(abc); //set text for text view
    }

    public void gpio9(View view) throws IOException {

        TextView t9 =  findViewById(R.id.tv9);
        est.sendData("09red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t9.setText(abc); //set text for text view
    }

    public void gpio10(View view) throws IOException {

        TextView t10 =  findViewById(R.id.tv10);
        est.sendData("10red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t10.setText(abc); //set text for text view
    }

    public void gpio11(View view) throws IOException {

        TextView t11 =  findViewById(R.id.tv11);
        est.sendData("11red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t11.setText(abc); //set text for text view
    }

    public void gpio12(View view) throws IOException {

        TextView t12 =  findViewById(R.id.tv12);
        est.sendData("12red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t12.setText(abc); //set text for text view
    }

    public void gpio13(View view) throws IOException {

        TextView t13 =  findViewById(R.id.tv13);
        est.sendData("13red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t13.setText(abc); //set text for text view
    }

    public void gpio14(View view) throws IOException {

        TextView t14 =  findViewById(R.id.tv14);
        est.sendData("14red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t14.setText(abc); //set text for text view
    }

    public void gpio15(View view) throws IOException {

        TextView t15 =  findViewById(R.id.tv15);
        est.sendData("15red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t15.setText(abc); //set text for text view
    }

    public void gpio16(View view) throws IOException {

        TextView t16 =  findViewById(R.id.tv16);
        est.sendData("16red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t16.setText(abc); //set text for text view
    }

    public void gpio17(View view) throws IOException {

        TextView t17 =  findViewById(R.id.tv17);
        est.sendData("17red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t17.setText(abc); //set text for text view
    }

    public void gpio18(View view) throws IOException {

        TextView t18 =  findViewById(R.id.tv18);
        est.sendData("18red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t18.setText(abc); //set text for text view
    }

    public void gpio19(View view) throws IOException {

        TextView t19 =  findViewById(R.id.tv19);
        est.sendData("19red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t19.setText(abc); //set text for text view
    }

    public void gpio20(View view) throws IOException {

        TextView t20 =  findViewById(R.id.tv20);
        est.sendData("20red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t20.setText(abc); //set text for text view
    }

    public void gpio21(View view) throws IOException {

        TextView t21 =  findViewById(R.id.tv21);
        est.sendData("21red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t21.setText(abc); //set text for text view
    }

    public void gpio22(View view) throws IOException {

        TextView t22 =  findViewById(R.id.tv22);
        est.sendData("22red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t22.setText(abc); //set text for text view
    }

    public void gpio23(View view) throws IOException {

        TextView t23 =  findViewById(R.id.tv23);
        est.sendData("23red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t23.setText(abc); //set text for text view
    }

    public void gpio24(View view) throws IOException {

        TextView t24 =  findViewById(R.id.tv24);
        est.sendData("24red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t24.setText(abc); //set text for text view
    }

    public void gpio25(View view) throws IOException {

        TextView t25 =  findViewById(R.id.tv25);
        est.sendData("25red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t25.setText(abc); //set text for text view
    }

    public void gpio26(View view) throws IOException {

        TextView t26 =  findViewById(R.id.tv26);
        est.sendData("26red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t26.setText(abc); //set text for text view
    }

    /*public void allRecv(View view) throws IOException {

        crtSocket est = new crtSocket();
        est.sendData("01red");
        String printData = est.recvData();
        int a = Integer.parseInt(printData);
        a = a - 48;
        String abc = String.valueOf(a);
        t1.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t2.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t3.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t4.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t5.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t6.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t7.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t8.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t9.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t10.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t11.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t12.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t13.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t14.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t15.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t16.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t17.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t18.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t19.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t20.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t21.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t22.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t23.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t24.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t25.setText(abc); //set text for text view
        printData = est.recvData();
        a = Integer.parseInt(printData);
        a = a - 48;
        abc = String.valueOf(a);
        t26.setText(abc); //set text for text view
    }*/
}
