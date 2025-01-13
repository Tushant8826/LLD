package org.example.FileSystemCompositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");
        File border = new File("border");
        movieDirectory.addFileSystem(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovieDirectory.addFileSystem(hulchul);
        movieDirectory.addFileSystem(comedyMovieDirectory);
        movieDirectory.ls();

    }
}
