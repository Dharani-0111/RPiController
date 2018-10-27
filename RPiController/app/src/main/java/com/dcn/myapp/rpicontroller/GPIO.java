package com.dcn.myapp.rpicontroller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class GPIO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpio);
        final crtSocket est = new crtSocket();
        // initiate a Switch
        Switch Sw1 = findViewById(R.id.Sw1);
        Sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("01onn");
                } else {
                    est.sendData("01off");
                }
            }
        });
        Switch Sw2 = findViewById(R.id.Sw2);
        Sw2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("02onn");
                } else {
                    est.sendData("02off");
                }
            }
        });
        Switch Sw3 = findViewById(R.id.Sw3);
        Sw3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("03onn");
                } else {
                    est.sendData("03off");
                }
            }
        });
        Switch Sw4 = findViewById(R.id.Sw4);
        Sw4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("04onn");
                } else {
                    est.sendData("04off");
                }
            }
        });
        Switch Sw5 = findViewById(R.id.Sw5);
        Sw5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("05onn");
                } else {
                    est.sendData("05off");
                }
            }
        });
        Switch Sw6 = findViewById(R.id.Sw6);
        Sw6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("06onn");
                } else {
                    est.sendData("06off");
                }
            }
        });
        Switch Sw7 = findViewById(R.id.Sw7);
        Sw7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("07onn");
                } else {
                    est.sendData("07off");
                }
            }
        });
        Switch Sw8 = findViewById(R.id.Sw8);
        Sw8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("08onn");
                } else {
                    est.sendData("08off");
                }
            }
        });
        Switch Sw9 = findViewById(R.id.Sw9);
        Sw9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("09onn");
                } else {
                    est.sendData("09off");
                }
            }
        });
        Switch Sw10 = findViewById(R.id.Sw10);
        Sw10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("10onn");
                } else {
                    est.sendData("10off");
                }
            }
        });
        Switch Sw11 = findViewById(R.id.Sw11);
        Sw11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("11onn");
                } else {
                    est.sendData("11off");
                }
            }
        });
        Switch Sw12 = findViewById(R.id.Sw12);
        Sw12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("12onn");
                } else {
                    est.sendData("12off");
                }
            }
        });
        Switch Sw13 = findViewById(R.id.Sw13);
        Sw13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("13onn");
                } else {
                    est.sendData("13off");
                }
            }
        });
        Switch Sw14 = findViewById(R.id.Sw14);
        Sw14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("14onn");
                } else {
                    est.sendData("14off");
                }
            }
        });
        Switch Sw15 = findViewById(R.id.Sw15);
        Sw15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("15onn");
                } else {
                    est.sendData("15off");
                }
            }
        });
        Switch Sw16 = findViewById(R.id.Sw16);
        Sw16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("16onn");
                } else {
                    est.sendData("16off");
                }
            }
        });
        Switch Sw17 = findViewById(R.id.Sw17);
        Sw17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("17onn");
                } else {
                    est.sendData("17off");
                }
            }
        });
        Switch Sw18 = findViewById(R.id.Sw18);
        Sw18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    est.sendData("18onn");
                } else {
                    est.sendData("18off");
                }
            }
        });
        Switch Sw19 = findViewById(R.id.Sw19);
        Sw19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) est.sendData("19onn"); else est.sendData("19off");
            }
        });
        Switch Sw20 = findViewById(R.id.Sw20);
        Sw20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) est.sendData("20onn"); else est.sendData("20off");
            }
        });
        Switch Sw21 = findViewById(R.id.Sw21);
        Sw21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) est.sendData("21onn"); else est.sendData("21off");
            }
        });
        Switch Sw22 = findViewById(R.id.Sw22);
        Sw22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) est.sendData("22onn"); else est.sendData("22off");
            }
        });
        Switch Sw23 = findViewById(R.id.Sw23);
        Sw23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) est.sendData("23onn"); else est.sendData("23off");
            }
        });
        Switch Sw24 = findViewById(R.id.Sw24);
        Sw24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
             @Override
             public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                 if(isChecked) est.sendData("24onn"); else est.sendData("24off");
             }
        });
        Switch Sw25 = findViewById(R.id.Sw25);
        Sw25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) est.sendData("25onn"); else est.sendData("25off");
                }
        });
        Switch Sw26 = findViewById(R.id.Sw26);
        Sw26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) est.sendData("26onn"); else est.sendData("26off");
            }
        });

    }

    public void sw2(View view) {
    }
}

/*
<ScrollView
android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_alignParentBottom="true"
        android:layout_alignParentStart="true"
        tools:layout_editor_absoluteX="8dp"
        tools:layout_editor_absoluteY="8dp">

<LinearLayout
    android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical" >

</LinearLayout>
</ScrollView>
*/
