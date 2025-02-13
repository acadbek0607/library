package org.acad.data.remote.auth

/**
 * Created by Acad Bek on 2/13/2025
 */
interface AuthFirebase {
    fun sendSmsCode(phone: String)
}