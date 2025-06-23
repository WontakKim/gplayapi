/*
 * SPDX-FileCopyrightText: 2025 The Calyx Institute
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.aurora.gplayapi.data.models

import kotlinx.serialization.Serializable

@Serializable
data class Support(
    val developerName: String = String(),
    val developerEmail: String = String(),
    val developerAddress: String = String(),
    val developerPhoneNumber: String = String()
)