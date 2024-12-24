package com.example.data

import com.example.domain.Product

data class Cheese(
    override val name: String = "Сыр",
    override val count: Int
): Product