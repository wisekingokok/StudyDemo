package wisekingokok.com.androiddesignsupportlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import wisekingokok.com.androiddesignsupportlibrary.floatingactionbutton.FloatingActionButtonActivity;
import wisekingokok.com.androiddesignsupportlibrary.navigationview.NavigationViewActivity;
import wisekingokok.com.androiddesignsupportlibrary.snack.SnackbarActivity;
import wisekingokok.com.androiddesignsupportlibrary.tablayout.TabLayoutActivity;
import wisekingokok.com.androiddesignsupportlibrary.textInputLayout.TextInputLayoutActivity;

public class AndroidDesignSupportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_design_support);
    }

    public void snackbar(View v){
        Intent intent = new Intent(this, SnackbarActivity.class);
        startActivity(intent);
    }

    public void textInputLayout(View v){
        Intent intent = new Intent(this, TextInputLayoutActivity.class);
        startActivity(intent);
    }


    public void floatingactionbutton(View v){
        Intent intent = new Intent(this, FloatingActionButtonActivity.class);
        startActivity(intent);
    }

    public void tablayout(View v){
        Intent intent = new Intent(this, TabLayoutActivity.class);
        startActivity(intent);
    }

    public void navigationView(View v){
        Intent intent = new Intent(this, NavigationViewActivity.class);
        startActivity(intent);
    }

}
