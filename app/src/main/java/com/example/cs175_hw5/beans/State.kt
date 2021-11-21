package com.example.cs175_hw5.beans

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

enum class State(val intValue: Int) {
    TODO(0), DONE(1);

    companion object {
        fun from(intValue: Int): State {
            for (state in values()) {
                if (state.intValue == intValue) {
                    return state
                }
            }
            return TODO
        }
    }
}