package com.mobileproto.lab3;

import android.app.Activity;
import android.app.DownloadManager;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.client.Query;

/**
 * Created by lego6245 on 9/22/13.
 */
public class ChatListAdapter extends FirebaseListAdapter<Chat> {

    private String username;

    public ChatListAdapter(Query ref, Activity activity, int layout, String username) {
        super(ref, Chat.class, layout, activity);
        this.username = username;

    }

    @Override
    protected void populateView(View v, Chat chat) {
        String author = chat.getAuthor();
        String message = chat.getMessage();
        TextView authorText = (TextView)v.findViewById(R.id.author);
        Uri data = chat.getData();
        authorText.setText(author + ":");
        if (author.equals(username)) {
            authorText.setTextColor(Color.RED);
        } else {
            authorText.setTextColor(Color.BLUE);
        }
        if(data != null)
        {
            ImageView imageView = (ImageView)v.findViewById(R.id.chatImage);
            imageView.setImageURI(data);
        }
        TextView messageText = (TextView)v.findViewById((R.id.message));
        messageText.setText(message);
    }
}
