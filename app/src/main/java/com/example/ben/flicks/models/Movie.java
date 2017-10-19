package com.example.ben.flicks.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Ben on 10/12/2017.
 */

public class Movie {
    private String title;
    private String overview;
    private String posterpath;
    private String backdropPath;

    public Movie(JSONObject object) throws JSONException {
        title = object.getString("title");
        overview = object.getString("overview");
        posterpath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");

    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterpath() {
        return posterpath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }
}
