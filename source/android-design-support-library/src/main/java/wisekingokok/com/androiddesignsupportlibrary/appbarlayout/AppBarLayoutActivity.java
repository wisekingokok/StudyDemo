package wisekingokok.com.androiddesignsupportlibrary.appbarlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
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
public class AppBarLayoutActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(android.R.drawable.ic_dialog_alert);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        toolbar.setSubtitle("sub Title");
        toolbar.inflateMenu(R.menu.appbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(AppBarLayoutActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
//        setSupportActionBar(toolbar);




    }

}
