package be.ap.edu.examenmobile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> velostationsListnaam;
        velostationsListnaam = new ArrayList<String>();
        final ArrayList<veloStationPojo> velostationsList;
        velostationsList = new ArrayList<veloStationPojo>();
        ListView myListView = (ListView) findViewById(R.id.Listview);


        List<String> velostationsLijst = new ArrayList();
        JSONArray jArray = null;
        try {
            jArray = new JSONArray(loadJSONFromAsset(getApplicationContext()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            for (int i = 0; i < jArray.length(); i++) {
                JSONObject obj = jArray.getJSONObject(i);
                velostationsLijst.add(obj.getString("naam"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        final StableArrayAdapter adapter = new StableArrayAdapter(this,  android.R.layout.simple_list_item_1, velostationsLijst);
        myListView.setAdapter(adapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {

                    try {
                        Intent intent = new Intent(MainActivity.this,MapActivity.class);
                        JSONArray jsonArray = new JSONArray(loadJSONFromAsset(getApplicationContext()));
                        JSONObject obj = jsonArray.getJSONObject(position);
                        intent.putExtra("lat", obj.getDouble("point_lat"));
                        intent.putExtra("lng", obj.getDouble("point_lng"));
                        startActivity(intent);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
            });
        }
    private class StableArrayAdapter extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public StableArrayAdapter(Context context, int textViewResourceId,
                                  List<String> objects) {
            super(context, textViewResourceId, objects);
            for (int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i), i);
            }
        }

        @Override
        public long getItemId(int position) {
            String item = getItem(position);
            return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

    }
    public String loadJSONFromAsset(Context context) {
        String json = null;
        try {
            InputStream is = context.getAssets().open("velostation.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }
}





