package com.carloshh.example.reverseapp.api.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size


data class TextRequest(@field:NotEmpty @field:Size(max = 255) val text: String)