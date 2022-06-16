package dev.techie.notescompose.ui.notes

import dev.techie.notescompose.Note
import dev.techie.notescompose.domain.NoteOrder
import dev.techie.notescompose.domain.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)