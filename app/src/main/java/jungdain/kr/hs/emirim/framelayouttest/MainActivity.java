package jungdain.kr.hs.emirim.framelayouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button[] but=new Button[3];
    LinearLayout [] Linears=new LinearLayout[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < but.length; i++) {
            but[i] = (Button) findViewById(R.id.but1 + i);
            but[i].setOnClickListener(butHandler);
            Linears[i]=(LinearLayout)findViewById(R.id.line1+i);
        }
    }
        View.OnClickListener butHandler = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.but1:
                        Linears[0].setVisibility(v.VISIBLE);
                        Linears[1].setVisibility(v.INVISIBLE);
                        Linears[2].setVisibility(v.INVISIBLE);
                        break;
                    case R.id.but2:
                        Linears[0].setVisibility(v.INVISIBLE);
                        Linears[1].setVisibility(v.VISIBLE);
                        Linears[2].setVisibility(v.INVISIBLE);
                        break;
                    case R.id.but3:
                        Linears[0].setVisibility(v.INVISIBLE);
                        Linears[1].setVisibility(v.INVISIBLE);
                        Linears[2].setVisibility(v.VISIBLE);
                        break;
                }
            }
        };



}

