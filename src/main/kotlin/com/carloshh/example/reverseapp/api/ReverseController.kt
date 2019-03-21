package com.carloshh.example.reverseapp.api

import com.carloshh.example.reverseapp.api.dto.TextRequest
import com.carloshh.example.reverseapp.service.ReverseService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class ReverseController(val reverseService: ReverseService) {

    @PostMapping("/texts")
    fun reverseText(@Valid @RequestBody textRequest: TextRequest) = reverseService.reverseText(textRequest.text)

    @GetMapping("/texts")
    fun findAllReversedTexts() = reverseService.findAll()

}