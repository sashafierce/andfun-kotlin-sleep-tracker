/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.trackmysleepquality.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "goal_history_table")
data class SleepNight(
        @PrimaryKey(autoGenerate = true)
        var dayId: Long = 0L,

        @ColumnInfo(name = "timestamp")
        val timestamp: Long = System.currentTimeMillis(),

        @ColumnInfo(name = "goal_1")
        var goal1: String? = null,

        @ColumnInfo(name = "goal_2")
        var goal2: String? = null,

        @ColumnInfo(name = "goal_3")
        var goal3: String? = null,

        @ColumnInfo(name = "num_goals_achieved")
        var numAchieved: Int = -1
)
