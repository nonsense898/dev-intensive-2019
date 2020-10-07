package ru.skillbranch.devintensive.models

data class Chat(
    val id: String,
    val members: List<User> = listOf(),
    var messages: MutableList<BaseMessage> = mutableListOf(),
)