package dev.techie.notescompose.domain.usecase

import dev.techie.notescompose.domain.Note
import dev.techie.notescompose.domain.NotesRepository

class GetNote(
    private val repository: NotesRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}