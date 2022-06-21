package dev.techie.notescompose.domain.usecase

import dev.techie.notescompose.domain.Note
import dev.techie.notescompose.domain.NotesRepository

class DeleteNote(
    private val repository: NotesRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}