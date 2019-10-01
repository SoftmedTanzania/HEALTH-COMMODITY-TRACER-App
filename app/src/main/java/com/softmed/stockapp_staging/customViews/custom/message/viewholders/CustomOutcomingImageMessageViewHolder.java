package com.softmed.stockapp_staging.customViews.custom.message.viewholders;

import android.util.Pair;
import android.view.View;

import com.softmed.stockapp_staging.dom.model.IMessageDTO;
import com.stfalcon.chatkit.messages.MessageHolders;

/*
 * Created by troy379 on 05.04.17.
 */
public class CustomOutcomingImageMessageViewHolder
        extends MessageHolders.OutcomingImageMessageViewHolder<IMessageDTO> {

    public CustomOutcomingImageMessageViewHolder(View itemView, Object payload) {
        super(itemView, payload);
    }

    @Override
    public void onBind(IMessageDTO message) {
        super.onBind(message);

        time.setText(message.getStatus() + " " + time.getText());
    }

    //Override this method to have ability to pass custom data in ImageLoader for loading image(not avatar).
    @Override
    protected Object getPayloadForImageLoader(IMessageDTO message) {
        //For example you can pass size of placeholder before loading
        return new Pair<>(100, 100);
    }
}