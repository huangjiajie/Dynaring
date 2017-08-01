package com.dynaring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by hjj
 */
public class MainActivity extends AppCompatActivity {

    private RingView ring;
    private NumberRunningTextView tv_summary;
    private int[] colors = { R.color.color_ring_normal, R.color.color_ring_dubious,
            R.color.color_ring_fault, R.color.color_ring_bad, R.color.color_ring_lose,
            R.color.color_ring_other, R.color.color_ring_return};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        initId();
        startRing();
        startNum();
        
    }

    private void startNum() {
        int total = 500 + 300 + 250 + 694 + 147 + 963 + 100;
        tv_summary.setContent(total+"");
    }

    private void startRing() {

        ring.setColors(new int[]{
               getResources().getColor(R.color.color_ring_normal),
                getResources().getColor(R.color.color_ring_dubious),
                getResources().getColor(R.color.color_ring_fault),
                getResources().getColor(R.color.color_ring_bad),
               getResources().getColor(R.color.color_ring_lose),
              getResources().getColor(R.color.color_ring_other),
               getResources().getColor(R.color.color_ring_return),
        });

        ring.setValues(new int[]{500, 300,  250, 694,  147, 963, 100});
        try {
            ring.startDraw();
        } catch (OnDrawingException e) {
            e.printStackTrace();
        }
        
    }

    private void initId() {
        ring = (RingView) findViewById(R.id.ring);
        tv_summary = (NumberRunningTextView) findViewById(R.id.tv_summary);
        
    }
    
    
}
