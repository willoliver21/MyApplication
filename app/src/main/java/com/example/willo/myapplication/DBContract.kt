package com.example.willo.myapplication

import android.provider.BaseColumns

object DBContract {

    /* Inner class that defines the table contents */
    class UserEntry : BaseColumns {
        companion object {
            val TABLE_NAME = "users"
            val COLUMN_MAIL = "email"
            val COLUMN_PASSWORD = "password"
            val COLUMN_NAME = "name"
        }
    }
}