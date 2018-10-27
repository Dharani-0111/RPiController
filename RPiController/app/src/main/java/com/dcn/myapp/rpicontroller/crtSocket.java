package com.dcn.myapp.rpicontroller;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

public final class crtSocket {
        private static BluetoothSocket mmSocket;

    public static BluetoothSocket establishSocket(BluetoothDevice Device) {
            UUID uuid = UUID.fromString("94f39d29-7d6d-437d-973b-fba39e49d4ee"); //Standard SerialPortService ID
        Log.e("UUID", uuid.toString());
            try {
                mmSocket = Device.createRfcommSocketToServiceRecord(uuid);
                Log.e("socket", String.valueOf(Device.createRfcommSocketToServiceRecord(uuid)));
                if (!mmSocket.isConnected()) {
                    mmSocket.connect();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            return mmSocket;
        }
        public void sendData(String send){
            try {
                OutputStream mmOutStream = mmSocket.getOutputStream();
                mmOutStream.write(send.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public String recvData() throws IOException {
            InputStream mmInStream = mmSocket.getInputStream();
            return String.valueOf(mmInStream.read());
        }
}
