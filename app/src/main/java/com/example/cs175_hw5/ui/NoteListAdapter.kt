package com.example.cs175_hw5.ui

import androidx.annotation.NonNull
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cs175_hw5.beans.Note
import android.widget.CompoundButton
import android.widget.TextView
import android.widget.CheckBox
import android.view.View
import com.example.cs175_hw5.R



class NoteListAdapter(private val operator: NoteOperator) :
    RecyclerView.Adapter<NoteViewHolder>() {
    private val notes: MutableList<Note> = ArrayList()
    fun refresh(newNotes: List<Note>?) {
        notes.clear()
        if (newNotes != null) {
            notes.addAll(newNotes)
        }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, pos: Int): NoteViewHolder {
        val itemView: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_note, parent, false)
        return NoteViewHolder(itemView, operator)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, pos: Int) {
        holder.bind(notes[pos])
    }

    override fun getItemCount(): Int {
        return notes.size
    }
}


interface NoteOperator {
    fun deleteNote(note: Note?)
    fun updateNote(note: Note?)
}
