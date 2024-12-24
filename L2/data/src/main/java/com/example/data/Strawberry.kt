package com.example.data

import com.example.domain.Product

data class Strawberry(
    override val name: String = "Клубника",
    override val count: Int
): Product
