package com.mytask.taskmaster;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ArrayList<String> taskList = new ArrayList<String>();

        taskList.add("Zeeshan : Clean Kitchen");
        taskList.add("Aditya : Make Chapathi");
        taskList.add("Ketan : Cook Food");
        taskList.add("Ambre : Start coding");
        taskList.add("Omkar ; Clean Rooms");

        ArrayAdapter<String> taskListAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_tasks,
                R.id.list_tasks_textview,
                taskList);

        ListView taskListView = (ListView) rootView.findViewById(R.id.list_tasks_textview);
        taskListView.setAdapter(taskListAdapter);

        return rootView;
    }
}
