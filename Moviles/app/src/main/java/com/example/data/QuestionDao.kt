package com.example.data
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface QuestionDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(question: Question)

    @Update
    suspend fun update(question: Question)

    @Delete
    suspend fun delete(question: Question)

    @Query("SELECT * from question WHERE id = :id")
    fun getQuestion(id: Int): Flow<Question>

    @Query("SELECT * from question ORDER BY pregunta ASC")
    fun getAllQuestions(): Flow<List<Question>>
}