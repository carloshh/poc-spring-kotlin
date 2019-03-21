package com.carloshh.example.reverseapp.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotNull

@Entity
class ReversedText(@Id @GeneratedValue(strategy = GenerationType.AUTO) val id : Int? = null,
                        @NotNull val original: String,
                        @NotNull val reversed : String)
