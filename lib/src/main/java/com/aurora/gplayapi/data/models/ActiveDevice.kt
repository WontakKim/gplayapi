/*
 * SPDX-FileCopyrightText: 2023 The Calyx Institute
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.aurora.gplayapi.data.models

import kotlinx.serialization.Serializable

@Serializable
data class ActiveDevice(
    val name: String = String(),
    val requiredOS: String = String()
)
