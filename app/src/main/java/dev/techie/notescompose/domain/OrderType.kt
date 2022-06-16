package dev.techie.notescompose.domain

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}