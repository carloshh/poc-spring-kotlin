package com.carloshh.reverseapp.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@EntityListeners(AuditingEntityListener::class)
class ReversedText(@Id @GeneratedValue(strategy = GenerationType.AUTO) val id : Int? = null,
                        @NotNull val original: String,
                        @NotNull val reversed : String,
                        @NotNull @CreatedDate val creationDate : LocalDateTime? = null)
