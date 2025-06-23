/*
 * SPDX-FileCopyrightText: 2024 Aurora OSS
 * SPDX-FileCopyrightText: 2025 The Calyx Institute
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.aurora.gplayapi.data.models.datasafety

import com.aurora.gplayapi.data.models.Artwork
import com.aurora.gplayapi.data.models.DeveloperInfo
import kotlinx.serialization.Serializable

@Serializable
data class Report(
    val packageName: String,
    val developerInfo: DeveloperInfo = DeveloperInfo("unknown"),
    val artwork: Artwork = Artwork(),
    val privacyUrl: String = String(),
    val entries: List<Entry> = listOf()
) {

    fun isValid(): Boolean {
        return entries.isNotEmpty()
    }

    override fun hashCode(): Int {
        return packageName.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Report -> {
                packageName == other.packageName
            }

            else -> false
        }
    }
}
