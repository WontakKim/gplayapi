/*
 * SPDX-FileCopyrightText: 2024 Aurora OSS
 * SPDX-FileCopyrightText: 2025 The Calyx Institute
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.aurora.gplayapi.data.models.datasafety

import kotlinx.serialization.Serializable

@Serializable
data class Data(
    val name: String = String(),
    val reason: String = String(),
    val optional: Boolean = false,
) {

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Data -> {
                name == other.name
            }

            else -> false
        }
    }
}
