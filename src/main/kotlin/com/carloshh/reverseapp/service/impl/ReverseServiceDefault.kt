package com.carloshh.reverseapp.service.impl

import com.carloshh.reverseapp.domain.ReversedText
import com.carloshh.reverseapp.repository.PersonRepository
import com.carloshh.reverseapp.service.ReverseService
import org.springframework.stereotype.Service

@Service
class ReverseServiceDefault(val personRepository: PersonRepository) : ReverseService {

    override fun reverseText(text: String): String {
        val reversedString = text.reversed()

        personRepository.save(ReversedText(original = text, reversed = reversedString))
        return reversedString
    }

    override fun findAll(): MutableIterable<ReversedText> = personRepository.findAll()

}