/*
 * SPDX-FileCopyrightText: 2025 Aurora OSS
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.aurora.gplayapi.data.verifier

import java.security.SecureRandom
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

@OptIn(ExperimentalStdlibApi::class, ExperimentalEncodingApi::class)
object DfeResponseVerifier {
    private val secureRandomInstance: SecureRandom = SecureRandom.getInstance("SHA1PRNG")
    private val nonceBytes = ByteArray(256)

    @Synchronized
    fun generateNonce(): String {
        secureRandomInstance.nextBytes(nonceBytes)
        return Base64.UrlSafe.encode(nonceBytes)
    }
}
