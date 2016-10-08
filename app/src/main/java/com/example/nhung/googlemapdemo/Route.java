package com.example.nhung.googlemapdemo;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

/**
 * Created by Nhu Ng on 10/7/2016.
 */

public class Route {
    public Distance distance;
    public Duration duration;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;

    public List<LatLng> points;
}
