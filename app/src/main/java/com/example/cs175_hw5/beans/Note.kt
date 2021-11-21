package com.example.cs175_hw5.beans

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.cs175_hw5.beans.Priority

import java.util.*

class Note(val id: Long) {
    var date: Date? = null
    var state: State? = null
    var content: String? = null
    var priority: Priority? = null
}