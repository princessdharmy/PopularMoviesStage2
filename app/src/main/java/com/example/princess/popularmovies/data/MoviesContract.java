package com.example.princess.popularmovies.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Princess on 6/15/2017.
 */

public class MoviesContract {

    // The authority, which is how your code knows which Content Provider to access
    public static final String AUTHORITY = "com.example.princess.popularmovies";

    // The base content URI = "content://" + <authority>
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + AUTHORITY);

    // Define the possible paths for accessing data in this contract
    // This is the path for the "tasks" directory
    public static final String PATH_MOVIE = "movie";
    public static final String PATH_FAVORITE = "favorite";

    public static final String COLUMN_MOVIE_KEY = "movie_key";

    public static final class MovieEntry implements BaseColumns {
        //Movie Tables name
        public static final String TABLE_DETAILS = "details";

        //Movies Columns names
        public static final String _ID = "id";
        public static final String COLUMN_MOVIE_ID = "movie_id";
        public static final String COLUMN_POSTER_PATH = "poster_path";
        public static final String COLUMN_OVERVIEW = "overview";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_RATING = "rating";
        public static final String COLUMN_MOVIE_CATEGORY = "category";
        public static final String COLUMN_BACKDROP_PATH = "backdrop_path";

        // MovieEntry content URI = base content URI + path
        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_MOVIE).build();

    }

    public static final class FavoriteEntry implements BaseColumns {
        //Favorite table name
        public static final String TABLE_FAVOURITE = "favourite";

        // FavoriteEntry content URI = base content URI + path
        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_MOVIE).appendPath(PATH_FAVORITE).build();

        //Favorite columns names
        public static final String _ID = "id";
        public static final String COLUMN_MOVIE_ID_KEY = "movie_key";


        public static final String[] COLUMNS_MOVIE_FAVORITE = {
                _ID,
                COLUMN_MOVIE_ID_KEY
        };

        private FavoriteEntry() {
        }
    }
}
