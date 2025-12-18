package com.depaula.bibliaviva;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("📖 Bíblia Viva\n\nOlá! Eu vou caminhar contigo na Palavra.");
        tv.setTextSize(20f);
        tv.setPadding(40, 60, 40, 60);

        setContentView(tv);
    }
}
