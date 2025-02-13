package org.acad.domain.repo

/**
 * Created by Acad Bek on 2/13/2025
 */
interface AuthRepo {
    fun sendSmsCode(phone: String)
}