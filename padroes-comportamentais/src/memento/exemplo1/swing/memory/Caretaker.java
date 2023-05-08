package memento.exemplo1.swing.memory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Caretaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){

        mementoList.add(memento);
    }

    public List<Memento> getHistoryList() {

        return Collections.unmodifiableList(mementoList);
    }

    public Memento getIndex(int index){

        return mementoList.get(index);
    }
}
