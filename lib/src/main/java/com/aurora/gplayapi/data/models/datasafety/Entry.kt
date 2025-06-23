/*
 * SPDX-FileCopyrightText: 2024 Aurora OSS
 * SPDX-FileCopyrightText: 2025 The Calyx Institute
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.aurora.gplayapi.data.models.datasafety

import com.aurora.gplayapi.data.models.Artwork
import kotlinx.serialization.Serializable

@Serializable
data class Entry(
    val name: String,
    val description: String,
    val purpose: String = String(),
    val artwork: Artwork = Artwork(),
    val subEntries: List<Entry> = listOf(),
    val data: List<Data> = listOf(),
    val type: EntryType = EntryType.UNKNOWN,
) {
    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Entry -> {
                name == other.name
            }

            else -> false
        }
    }
}
