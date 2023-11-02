/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.data
import kotlinx.coroutines.flow.Flow


class OfflineQuestionsRepository(private val questionDao: QuestionDao) : QuestionsRepository {
    override fun getAllItemsStream(): Flow<List<Question>> = questionDao.getAllQuestions()

    override fun getItemStream(id: Int): Flow<Question?> = questionDao.getQuestion(id)

    override suspend fun insertItem(item: Question) = questionDao.insert(item)

    override suspend fun deleteItem(item: Question) = questionDao.delete(item)

    override suspend fun updateItem(item: Question) = questionDao.update(item)
}
