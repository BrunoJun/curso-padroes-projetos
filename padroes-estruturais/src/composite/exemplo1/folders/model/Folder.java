package composite.exemplo1.folders.model;

import java.util.List;

public class Folder implements FileSystemItem{

    String name;
    List<FileSystemItem> itens;

    public Folder(String name, List<FileSystemItem> itens) {

        this.name = name;
        this.itens = itens;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
        for (FileSystemItem item: itens) {

            item.print(structure + "| ");
        }
    }
}
