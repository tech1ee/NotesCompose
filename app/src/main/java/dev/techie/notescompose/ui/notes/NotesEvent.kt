package dev.techie.notescompose.ui.notes

import dev.techie.notescompose.Note
import dev.techie.notescompose.domain.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}