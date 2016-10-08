package com.example.nhung.googlemapdemo;

import java.util.List;

/**
 * Created by Nhu Ng on 10/7/2016.
 */

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}