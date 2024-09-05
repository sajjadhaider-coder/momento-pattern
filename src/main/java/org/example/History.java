package org.example;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<EditorState> states = new ArrayList<>();

    public void push(EditorState editorState) {
        states.add(editorState);
    }

    public EditorState pop(){
        int lastIndex = states.size() - 1;
        EditorState lastState = states.get(lastIndex);
        states.remove(lastState);
        return  lastState;
    }
}
