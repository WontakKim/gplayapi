/*
 * SPDX-FileCopyrightText: 2023 Aurora OSS
 * SPDX-FileCopyrightText: 2023 The Calyx Institute
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.aurora.gplayapi.utils

import java.util.*

internal object CertUtil {

    @OptIn(ExperimentalStdlibApi::class)
    fun decodeHash(base64EncodedHash: String): String {
        return Base64.getUrlDecoder().decode(base64EncodedHash).toHexString()
    }
}
