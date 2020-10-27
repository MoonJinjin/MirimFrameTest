package kr.hs.emirim.s2019s11.mirimframetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearDo, linearSim, linearWuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearDo = findViewById(R.id.linear_do);
        linearSim = findViewById(R.id.linear_sim);
        linearWuah = findViewById(R.id.linear_wuah);

        Button btnDo = findViewById(R.id.btn_do);
        Button btnSim = findViewById(R.id.btn_sim);
        Button btnWuah = findViewById(R.id.btn_wuah);

        btnDo.setOnClickListener(btnListener);
        btnSim.setOnClickListener(btnListener);
        btnWuah.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            linearDo.setVisibility(View.INVISIBLE);
            linearSim.setVisibility(View.INVISIBLE);
            linearWuah.setVisibility(View.INVISIBLE);

            switch (v.getId()) {
                case R.id.btn_do:
                    linearDo.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_sim:
                    linearSim.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_wuah:
                    linearWuah.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}