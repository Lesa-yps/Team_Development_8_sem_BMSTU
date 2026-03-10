package com.example.domain.interfaces

import com.example.domain.entities.User

interface UserRepository {

    fun createUser(name: String, email: String, password: String): Result<User>

    fun enter(name: String, password: String): Result<User>

    fun changeName(newName: String): Result<User>

    fun changePassword(newPassword: String): Result<Unit>
}