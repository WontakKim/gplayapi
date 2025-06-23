/*
 * SPDX-FileCopyrightText: 2023 Aurora OSS
 * SPDX-FileCopyrightText: 2023 The Calyx Institute
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.aurora.gplayapi.data.models

import kotlinx.serialization.Serializable

@Serializable
data class EncodedCertificateSet(
    val certificateSet: String,
    val sha256: String
)