package model;

import java.io.*;
import java.util.List;


/**
 * Created by dmitry on 08.05.17.
 */
public class SerializationOfList<T> {
    public void SaveToFileList(List<T> savelist, File file) throws IOException{
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(fos);
            oos.writeInt(savelist.size());
            for (T elem : savelist) {
                oos.writeObject(elem);
            }
        } finally {
            if (oos != null) {
                oos.close();
            }
        }
    }

    public void LoadFromFile(List<T> loadlist, File file)throws IOException,ClassNotFoundException,ClassCastException{
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
            int count = ois.readInt();
            loadlist.clear();
            for(int i = 0; i<count;i++)
            {
                T loadObject = (T) ois.readObject();
                loadlist.add(loadObject);
            }
        } finally {
            if (ois != null) {
                ois.close();
            }
        }


    }
}

