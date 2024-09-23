package CODING;

class Song {
    String title;
    Song next;

    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}

class Playlist {
    private Song head;

    public Playlist() {
        this.head = null;
    }

    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }
    
    public void displayPlaylist() {
        Song current = head;
        if (current == null) {
            System.out.println("Playlist kosong");
            return;
        }
        while (current != null) {
            System.out.println(current.title);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Train Wreck");
        playlist.addSong("Off My Face");
        playlist.addSong("Nothing Gonna Change Mylife For You");
        playlist.addSong("Sialan");
        playlist.addSong("Menawan");
        System.out.println("Playlist : ");
        playlist.displayPlaylist();
    }
}
