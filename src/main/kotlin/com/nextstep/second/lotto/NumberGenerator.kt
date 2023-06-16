package com.nextstep.second.lotto

private const val LOTTO_NUMBER_LOWER_BOUNDARY = 1
private const val LOTTO_NUMBER_UPPER_BOUNDARY = 45

object NumberGenerator {
    fun generate(): List<Int> = (LOTTO_NUMBER_LOWER_BOUNDARY..LOTTO_NUMBER_UPPER_BOUNDARY).shuffled().take(6)
}