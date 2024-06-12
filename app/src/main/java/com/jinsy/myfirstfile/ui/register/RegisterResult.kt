package com.jinsy.myfirstfile.ui.register

/**
 * Authentication result : success (user details) or error message.
 */
data class RegisterResult(
    val success: RegisteredInUserView? = null,
    val error: Int? = null
)