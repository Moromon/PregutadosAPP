import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.data.Question
import com.example.data.QuestionDao
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.reflect.KParameter


@Database(entities = [Question::class], version = 1, exportSchema = false)
abstract class QuestionDatabase : RoomDatabase() {


    abstract fun questionDao(): QuestionDao

    companion object {

        @Volatile private var INSTANCE: QuestionDatabase? = null

        fun getInstance(context: Context): QuestionDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
                QuestionDatabase::class.java, "Sample.db")
                // prepopulate the database after onCreate was called
                .addCallback(object : Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        // insert the data on the IO Thread
                        CoroutineScope(Dispatchers.IO).launch {
                            getInstance(context).questionDao().insert(PREPOPULATE_DATA)
                        }
                    }
                })
                .build()

        val PREPOPULATE_DATA = listOf(
            Question(0, "1+1", "1", "2", "3", "50"),
            Question(1, "1+2", "1", "2", "3", "50")
        )
    }
}