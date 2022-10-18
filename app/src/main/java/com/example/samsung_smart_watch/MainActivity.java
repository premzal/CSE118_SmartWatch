package com.example.samsung_smart_watch;

import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.samsung_smart_watch.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements LocationListener {

    private TextView mTextView;
    private ActivityMainBinding binding;

    TextView tv_longitude, tv_latitude, tv_altitude;
    LocationManager locationManager;
    Location loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
        tv_latitude = (TextView) findViewById(R.id.latitude);
        tv_longitude = (TextView) findViewById(R.id.longitude);
        tv_altitude = (TextView) findViewById(R.id.altitude);



    }

    @Override
    public void onLocationChanged(@NonNull Location location) {
        tv_latitude.setText(Double.toString(location.getLatitude()));
        tv_longitude.setText(Double.toString(location.getLongitude()));
        tv_altitude.setText(Double.toString(location.getAltitude()));
    }
}