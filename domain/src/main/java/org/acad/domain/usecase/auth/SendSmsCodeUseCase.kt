package org.acad.domain.usecase.auth

import org.acad.domain.repo.AuthRepo

/**
 * Created by Acad Bek on 2/13/2025
 */
class SendSmsCodeUseCase constructor(
    private val authRepo: AuthRepo
) {
    operator fun invoke(phone: String) {authRepo.sendSmsCode(phone  ) }
}