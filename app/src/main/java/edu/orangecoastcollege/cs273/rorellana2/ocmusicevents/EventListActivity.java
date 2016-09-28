package edu.orangecoastcollege.cs273.rorellana2.ocmusicevents;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EventListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the adapter (which binds the ListView with the data in MusicEvent.java)
        // Since the data is an array we use an ArrayAdapter:

        setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, MusicEvent.titles));


        // Let ListView populate the list
        //setContentView(R.layout.activity_event_list);
        //
    }

    @Override
    protected void onListItemClick(ListView l, View v, int pos, long id)
    {
        // 1) Get the position, get the title, get the details
        // 2) Make a new Intent
        // 3) put the Strings into the Intent
        // 4) start activity
        String title = MusicEvent.titles[pos];
        String details = MusicEvent.details[pos];

        Intent detailsIntent = new Intent(this, EventDetailsActivity.class);
        detailsIntent.putExtra("Title", title);
        detailsIntent.putExtra("Details", details);
        startActivity(detailsIntent);
    }
}
