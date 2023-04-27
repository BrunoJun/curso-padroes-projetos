package composite.exemplo1.folders;

import composite.exemplo1.folders.model.File;
import composite.exemplo1.folders.model.FileSystemItem;
import composite.exemplo1.folders.model.Folder;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {

		FileSystemItem file1 = new File("file1");
		FileSystemItem file2 = new File("file2");
		FileSystemItem file3 = new File("file3");
		FileSystemItem file4 = new File("file4");
		FileSystemItem folder1 = new Folder("Folder1", Arrays.asList(file1, file2));
		FileSystemItem folder2 = new Folder("Folder2", Arrays.asList(folder1, file3, file4));
		folder2.print("");
	}
}
