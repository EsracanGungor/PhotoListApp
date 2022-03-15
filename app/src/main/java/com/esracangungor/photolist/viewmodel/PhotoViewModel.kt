package com.esracangungor.photolist.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.esracangungor.photolist.model.PhotoList
import com.esracangungor.photolist.service.RetrofitInstance
import com.esracangungor.photolist.service.RetrofitService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PhotoViewModel(application: Application) : AndroidViewModel(application) {

    val photo = MutableLiveData<PhotoList>()

    fun refreshData() {
        makeApiCall()
    }

    fun getPhotoListObserver(): MutableLiveData<PhotoList> {
        return photo
    }

    private fun makeApiCall() {
        viewModelScope.launch(Dispatchers.IO) {
            val retrofitInstance =
                RetrofitInstance.getRetroInstance().create(RetrofitService::class.java)
            val response = retrofitInstance.getDataFromApi()
            photo.postValue(response)
        }
    }
}