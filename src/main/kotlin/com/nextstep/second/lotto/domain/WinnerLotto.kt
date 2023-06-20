package com.nextstep.second.lotto.domain

class WinnerLotto private constructor(
    val lotto: Lotto,
    val bonusNumber: LottoNumberVo
) {
    companion object {
        fun of(inputNumbers: List<Int>, bonusNumber: Int): WinnerLotto {
            require(inputNumbers.toSet().size == Lotto.LOTTO_LENGTH) { "로또는 서로다른 ${Lotto.LOTTO_LENGTH}개의  숫자만큼 번호를 입력하셔야 합니다" }
            require(!inputNumbers.contains(bonusNumber)) { "보너스 숫자는 당첨 번호에 포함이 되서는 안 됩니다" }
            return WinnerLotto(Lotto.of(inputNumbers), LottoNumberVo(bonusNumber))
        }
    }
}
