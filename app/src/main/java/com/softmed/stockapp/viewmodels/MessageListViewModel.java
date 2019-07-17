package com.softmed.stockapp.viewmodels;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.softmed.stockapp.database.AppDatabase;
import com.softmed.stockapp.dom.dto.MessageUserDTO;
import com.softmed.stockapp.dom.dto.TransactionSummary;
import com.softmed.stockapp.dom.entities.Message;
import com.softmed.stockapp.dom.entities.Transactions;

import java.util.List;


public class MessageListViewModel extends AndroidViewModel {

    private AppDatabase appDatabase;

    public MessageListViewModel(Application application) {
        super(application);
        appDatabase = AppDatabase.getDatabase(this.getApplication());

    }

    public LiveData<List<Message>> getParentMessages() {
        return appDatabase.messagesModelDao().getMessageThreads();
    }

    public LiveData<List<MessageUserDTO>> getMessagesByThread(String parentMessageId) {
        return appDatabase.messagesModelDao().getMessageByThread(parentMessageId);
    }



}
