package com.sheevas.catatandinusva.dao

import androidx.room.*
import com.sheevas.catatandinusva.model.ModelNote

/**databa
 * Created by Sheeva Nusa Dina
 */

@Dao
interface NoteDao {
    @get:Query("SELECT * FROM notes ORDER BY id DESC")
    val allNote: List<ModelNote?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(modelNote: ModelNote?)

    @Delete
    fun delete(modelNote: ModelNote?)
}