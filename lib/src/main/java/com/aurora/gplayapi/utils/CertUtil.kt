/*
 * SPDX-FileCopyrightText: 2023 Aurora OSS
 * SPDX-FileCopyrightText: 2023 The Calyx Institute
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.aurora.gplayapi.utils

import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

@OptIn(ExperimentalStdlibApi::class, ExperimentalEncodingApi::class)
internal object CertUtil {

    fun decodeHash(base64EncodedHash: String): String {
        return Base64.UrlSafe.decode(base64EncodedHash).toHexString()
    }
}
