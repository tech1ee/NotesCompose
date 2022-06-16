package dev.techie.notescompose.domain.usecase

import dev.techie.notescompose.InvalidNoteException
import dev.techie.notescompose.Note
import dev.techie.notescompose.domain.NotesRepository

class AddNote(
    private val repository: NotesRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}