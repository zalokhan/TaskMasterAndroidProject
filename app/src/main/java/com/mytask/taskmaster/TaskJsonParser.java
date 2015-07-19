package com.mytask.taskmaster;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zeeshan on 7/18/2015.
 */
public class TaskJsonParser {


    public List<String> getTasksList (String taskJsonSting) throws JSONException {

        JSONObject taskJsonObject = new JSONObject(taskJsonSting);
        JSONArray taskJsonList = taskJsonObject.getJSONArray("tasks");
        taskJsonList.length();
        List<String> taskList = new ArrayList<String>();
        for (int i=0;  i< taskJsonList.length() ; i++) {
            JSONObject task = taskJsonList.getJSONObject(i);
            String taskString = task.toString();
            taskList.add(taskString);
        }

        return taskList;
    }
}
