/*
 * SPDX-FileCopyrightText: 2025 Aurora OSS
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.aurora.gplayapi.data.models

import kotlinx.serialization.Serializable

@Serializable
data class Tag(
    val name: String,
    val url: String? = null,
)