package dev.techie.notescompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.techie.notescompose.Note


@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

        abstract val notesDao: NoteDao

        companion object {
            const val DATABASE_NAME = "notes_db"
        }
}