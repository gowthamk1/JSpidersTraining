package List;

public class MusicPlayer {
	public static void main(String[] args) {
		SongList sl = new SongList();
		sl.creationOfDll(new PlayList("Mayavi1", "Sanjith Hegde1", "Album1"));
		sl.insertionDll(new PlayList("Mayavi2", "Sanjith Hegde2", "Album2"));
		sl.insertionDll(new PlayList("Mayavi3", "Sanjith Hegde3", "Album3"));
		sl.insertionDll(new PlayList("Mayavi4", "Sanjith Hegde4", "Album4"));
		sl.forwardTraverse();
//		sl.playOnce();
	}
}
