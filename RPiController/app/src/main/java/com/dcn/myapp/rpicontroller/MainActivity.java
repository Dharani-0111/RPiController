package com.dcn.myapp.rpicontroller;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Set;

public class MainActivity extends Activity {
    BluetoothSocket mmSocket;
    BluetoothDevice mmDevice;
    public void sendBtMsg() {
        try {
            BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

            if (mBluetoothAdapter == null) {

                Log.d("BT Status: ", "No bluetooth adapter available");
            }

            assert mBluetoothAdapter != null;
            if (!mBluetoothAdapter.isEnabled()) {
                Intent enableBluetooth = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(enableBluetooth, 0);
            }

            Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();

            if (pairedDevices.size() > 0) {
                for (BluetoothDevice device : pairedDevices) {
                    // RPP300 is the name of the bluetooth printer device
                    // we got this name from the list of paired devices
                    if (device.getName().equals("raspberrypi")) {
                        mmDevice = device;
                        break;
                    }
                }
            }
            Log.d("BT Status", "Bluetooth device found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bluSett(View v){
        Intent intentOpenBluetoothSettings = new Intent();
        intentOpenBluetoothSettings.setAction(android.provider.Settings.ACTION_BLUETOOTH_SETTINGS);
        startActivity(intentOpenBluetoothSettings);
    }
    public void nxtPrt(View v){
        crtSocket();
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);

    }
    public void crtSocket(){
        sendBtMsg();
        crtSocket est = new crtSocket();
        mmSocket = est.establishSocket(mmDevice);
    }

}