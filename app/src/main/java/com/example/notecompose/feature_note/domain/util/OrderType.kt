package com.example.notecompose.feature_note.domain.util

sealed class OrderType {

    object ASCENDING: OrderType()
    object DESCENDING: OrderType()
}
