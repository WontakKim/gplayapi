/*
 * SPDX-FileCopyrightText: 2020-2021 Aurora OSS
 * SPDX-FileCopyrightText: 2023-2024 The Calyx Institute
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.aurora.gplayapi.data.models.editor

import kotlinx.serialization.Serializable

@Serializable
data class EditorChoiceBundle(
    val id: Int = -1,
    val bundleTitle: String = String(),
    val bundleChoiceClusters: List<EditorChoiceCluster> = ArrayList()
)