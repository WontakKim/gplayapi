/*
 * SPDX-FileCopyrightText: 2020-2021 Aurora OSS
 * SPDX-FileCopyrightText: 2023-2024 The Calyx Institute
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.aurora.gplayapi.data.models.editor

import com.aurora.gplayapi.data.models.Artwork
import kotlinx.serialization.Serializable

@Serializable
data class EditorChoiceCluster(
    val id: Int = -1,
    val clusterTitle: String = String(),
    val clusterBrowseUrl: String = String(),
    val clusterArtwork: List<Artwork> = ArrayList()
)
