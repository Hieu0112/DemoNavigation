package com.example.demonavigation.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demonavigation.R;
import com.example.demonavigation.adapter.MessageAdapter;
import com.example.demonavigation.model.Message;

import java.util.ArrayList;
import java.util.List;

public class FragmentNotification extends Fragment {
    MessageAdapter messageAdapter;
    RecyclerView recyclerView;
    List<Message>list;

    public FragmentNotification() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_notification,container,false);
        list=new ArrayList<>();
        list.add(new Message(R.drawable.pikachu,"God chu","TITLE 1","16:20"));
        list.add(new Message(R.drawable.b_logo,"B chu","TITLE 2","14:20"));
        list.add(new Message(R.drawable.doraemon,"Doraemon","TITLE 3","12:20"));
        list.add(new Message(R.drawable.songoku," Ngoc rong","TITLE 4","8:20"));
        list.add(new Message(R.drawable.cat,"Cat","TITLE 5","6:20"));
        recyclerView=view.findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(view.getContext(),RecyclerView.VERTICAL,false);
        messageAdapter= new MessageAdapter(view.getContext(),list);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(messageAdapter);
        return view;
    }
}
