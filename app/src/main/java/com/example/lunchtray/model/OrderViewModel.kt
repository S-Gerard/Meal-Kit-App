/*
 * Copyright (C) 2021 The Android Open Source Project.
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
package com.example.lunchtray.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import java.text.NumberFormat

class OrderViewModel : ViewModel() {
    
    // Number of meals
    private val _quantity = MutableLiveData<Int?>()
    val quantity: LiveData<Int?> = _quantity

    // Type of meal
    private val _type = MutableLiveData<String?>()
    val type: LiveData<String?> = _type

    // Subscription duration
    private val _subscription = MutableLiveData<Int?>()
    val subscription: LiveData<Int?> = _subscription


    // Total cost of the order
    private val _total = MutableLiveData(0.0)
    val total: LiveData<String> = Transformations.map(_total) {
        NumberFormat.getCurrencyInstance().format(it)
    }

    /**
     * Set the meal quantity for the order.
     */
    fun setQuantity(numberMeals: Int) {
        _quantity.value = numberMeals
        updateTotal()
    }

    /**
     * Set the meal type for the order.
     */
    fun setType(mealType: String) {
        _type.value = mealType
    }

    /**
     * Set the subscription duration for the order.
     */
    fun setSubscription(subscription: Int) {
        _subscription.value = subscription
        updateTotal()
    }

    /**
     * Update total value.
     */
    private fun updateTotal() {
        _total.value = ((quantity.value ?: 0) * 6.50) * (subscription.value ?: 1)
    }


    /**
     * Reset all values pertaining to the order.
     */
    fun resetOrder() {
        _quantity.value = null
        _total.value = 0.0
        _type.value = null
        _subscription.value = null
    }
}
