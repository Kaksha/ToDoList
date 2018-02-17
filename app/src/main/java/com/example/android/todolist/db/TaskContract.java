package com.example.android.todolist.db;

import android.provider.BaseColumns;

/**
 * Created by Kaksha on 10-02-2018.
 */

public class TaskContract {
    public static final String DB_NAME = "com.example.android.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}