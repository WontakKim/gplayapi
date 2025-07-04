/*
 * SPDX-FileCopyrightText: 2020-2021 Aurora OSS
 * SPDX-FileCopyrightText: 2023-2025 The Calyx Institute
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.aurora.gplayapi.data.models

import kotlinx.serialization.Serializable

@Serializable
data class Artwork(
    val type: Int = 0,
    val url: String = String(),
    val urlAlt: String = String(),
    val aspectRatio: Int = 0,
    val width: Int = 0,
    val height: Int = 0
) {

    override fun hashCode(): Int {
        return url.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Artwork -> url == other.url
            else -> false
        }
    }
}
