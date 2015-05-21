package com.colinwhite.ping.pref;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.colinwhite.ping.R;

/**
 * Loads the SettingsFragment and manages the back button.
 */
public class PreferencesActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        try {
            // Set up the Toolbar.
            setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (NullPointerException e) {
            Toast.makeText(this, getString(R.string.error), Toast.LENGTH_LONG).show();
            finish();
        }

        // Style preference ListView appropriately on pre-Lollipop.
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            ListView preferences = (ListView) findViewById(android.R.id.list);
            preferences.setSelector(R.drawable.ripple_accent);
            preferences.setDivider(new ColorDrawable(getResources().getColor(android.R.color.darker_gray)));
            preferences.setDividerHeight(1);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Only the back button exists in the menu so we go back to MainActivity.
        onBackPressed();
        return true;
    }
}