package com.carloshh.example.reverseapp.repository

import com.carloshh.example.reverseapp.domain.ReversedText
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ReverseTextRepository : CrudRepository<ReversedText, String>