package com.fitique.sdk

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.storage.FirebaseStorage
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

object FirebaseManager {
    val auth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }
    val storage: FirebaseStorage by lazy { FirebaseStorage.getInstance() }

    fun initialize() {
        auth
        storage
    }

    suspend fun testConnection(): Boolean = suspendCoroutine { continuation ->
        auth.fetchSignInMethodsForEmail("connectivity-check@fitique.app")
            .addOnSuccessListener {
                continuation.resume(true)
            }
            .addOnFailureListener {
                continuation.resume(false)
            }
    }
}
