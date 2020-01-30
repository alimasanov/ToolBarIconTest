package com.alimasanov.toolbaricontest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private int mCountValue1 = 0;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem menuItem = menu.findItem(R.id.action_counter_1);
        menuItem.setIcon(LayoutToDrawable.convertToImage(this, mCountValue1, R.drawable.ic_fiber_new_black_24dp));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_counter_1:
                updateFirstCounter(mCountValue1 + 1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void updateFirstCounter(int newCounterValue) {
        mCountValue1 = newCounterValue;
        invalidateOptionsMenu();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
