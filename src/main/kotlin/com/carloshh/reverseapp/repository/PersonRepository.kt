package com.carloshh.reverseapp.repository

import com.carloshh.reverseapp.domain.ReversedText
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : CrudRepository<ReversedText, String>