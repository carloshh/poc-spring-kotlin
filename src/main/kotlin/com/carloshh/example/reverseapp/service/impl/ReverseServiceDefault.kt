package com.carloshh.example.reverseapp.service.impl

import com.carloshh.example.reverseapp.domain.ReversedText
import com.carloshh.example.reverseapp.repository.ReverseTextRepository
import com.carloshh.example.reverseapp.service.ReverseService
import org.springframework.stereotype.Service

@Service
class ReverseServiceDefault(val reverseTextRepository: ReverseTextRepository) : ReverseService {

    override fun reverseText(text: String): String {
        val reversedString = text.reversed()

        reverseTextRepository.save(ReversedText(original = text, reversed = reversedString))
        return reversedString
    }

    override fun findAll(): MutableIterable<ReversedText> = reverseTextRepository.findAll()

}