package com.carloshh.example.reverseapp.service

import com.carloshh.example.reverseapp.domain.ReversedText

interface ReverseService {

    fun reverseText(text : String) : String

    fun findAll() : Iterable<ReversedText>

}