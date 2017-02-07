package wisekingokok.com.androiddesignsupportlibrary.coordinatorlayout;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import wisekingokok.com.androiddesignsupportlibrary.R;

/**
 * author: 林彦君(<a href="mailto:linyanjun@danlu.com">linyanjun@danlu.com</a>)<br/>
 * version: 1.0.0<br/>
 * since: 2017-02-04 10:59<br/>
 *
 * <p>
 * 内容描述区域
 * </p>
 */
public class CoordinatorLayoutActivity extends AppCompatActivity {

    private int lastX;
    private int lastY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout);


        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int x = (int) event.getRawX();
                int y = (int) event.getRawY();
                switch (event.getAction()) {

                    case MotionEvent.ACTION_DOWN: {

                        break;
                    }

                    case MotionEvent.ACTION_MOVE: {
                        CoordinatorLayout.MarginLayoutParams layoutParams = (CoordinatorLayout.MarginLayoutParams) v.getLayoutParams();
                        int left = layoutParams.leftMargin + x - lastX;
                        int top = layoutParams.topMargin + y - lastY;


                        layoutParams.leftMargin = left;
                        layoutParams.topMargin = top;
                        v.setLayoutParams(layoutParams);
                        v.requestLayout();
                        break;
                    }

                    case MotionEvent.ACTION_UP: {

                        break;
                    }

                }
                lastX = x;
                lastY = y;
                return true;
            }
        });
    }

}
