package wisekingokok.com.androiddesignsupportlibrary.floatingactionbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

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
public class FloatingActionButtonActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);

    }

    public void click(View v){
        Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();
    }
}
