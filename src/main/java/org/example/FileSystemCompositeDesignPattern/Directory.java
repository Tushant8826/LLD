package org.example.FileSystemCompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    private String directoryName;
    List<FileSystem> fileSystemList;

    Directory(String directoryName) {
        this.directoryName = directoryName;
        fileSystemList = new ArrayList<>();
    }

    void addFileSystem(FileSystem fileSystem) {
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
      System.out.println(directoryName);
      for (FileSystem fileSystem : fileSystemList) {
          fileSystem.ls();
      }
    }
}
