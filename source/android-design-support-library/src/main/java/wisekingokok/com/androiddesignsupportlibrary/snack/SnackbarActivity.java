package wisekingokok.com.androiddesignsupportlibrary.snack;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import wisekingokok.com.androiddesignsupportlibrary.R;

import static android.support.design.widget.Snackbar.make;

/**
 * author: 林彦君(<a href="mailto:linyanjun@danlu.com">linyanjun@danlu.com</a>)<br/>
 * version: 1.0.0<br/>
 * since: 2017-02-04 10:59<br/>
 *
 * <p>
 * 内容描述区域
 * </p>
 */
public class SnackbarActivity extends AppCompatActivity {

    FrameLayout rootFL;
    FrameLayout spaceFL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);


        rootFL = (FrameLayout) findViewById(R.id.fl_root);
        spaceFL = (FrameLayout) findViewById(R.id.fl_test_space);

    }

    public void snackbar1(View v){
        make(rootFL, "Snackbar 1", Snackbar.LENGTH_SHORT)
                .setAction("Done", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(SnackbarActivity.this, "done", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

    public void snackbar2(View v){
        Snackbar.make(spaceFL, "Snackbar 2", Snackbar.LENGTH_INDEFINITE).setActionTextColor(Color.RED)
                .setAction("Done", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(SnackbarActivity.this, "done", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}
