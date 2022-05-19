package org.techtown.nsipgui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button couponBtn;
    Button storeMyPageBtn;
    Button stampbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        couponBtn = findViewById(R.id.couponBtn);
        storeMyPageBtn = findViewById(R.id.storeMyPageBtn);
        stampbtn = findViewById(R.id.stampBtn);


        storeMyPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StoreMyPage.class);
                startActivity(intent);
            }
        });
        couponBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Coupon.class);
                startActivity(intent);
            }
        });
        stampbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Stamp.class);
                startActivity(intent);
            }
        });
    }

}