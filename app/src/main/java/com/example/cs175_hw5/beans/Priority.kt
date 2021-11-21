package com.example.cs175_hw5.beans

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


enum class Priority(val intValue: Int, val color: Int) {
    High(2, Color.RED), Medium(1, Color.GREEN), Low(0, Color.WHITE);
    companion object {
        fun from(intValue: Int): Priority {
            for (priority in values()) {
                if (priority.intValue == intValue) {
                    return priority
                }
            }
            return Low
        }
    }
}