package com.softmed.stockapp_staging.viewmodels;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.softmed.stockapp_staging.database.AppDatabase;
import com.softmed.stockapp_staging.dom.dto.MessageUserDTO;
import com.softmed.stockapp_staging.dom.entities.Message;

import java.util.List;


public class MessageListViewModel extends AndroidViewModel {
    private static final String TAG = MessageListViewModel.class.getSimpleName();

    private AppDatabase appDatabase;

    public MessageListViewModel(Application application) {
        super(application);
        appDatabase = AppDatabase.getDatabase(this.getApplication());

    }

    public LiveData<List<Message>> getParentMessages() {
        return appDatabase.messagesModelDao().getMessageThreads();
    }

    public LiveData<List<MessageUserDTO>> getMessageByThread(String parentMessageId,String userId) {
        return appDatabase.messagesModelDao().getMessageByThread(parentMessageId,userId);
    }


    public LiveData<Integer> getUnreadMessageCountUserId(int userId) {
        return appDatabase.messageRecipientsModelDao().getUnreadMessageCountUserId(false,userId);
    }

}