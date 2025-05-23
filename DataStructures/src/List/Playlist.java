package List;

class PlayList {
	private String songName;
	private String movieName;
	private String singer;

	protected PlayList(String songName, String movieName, String singer) {
		super();
		this.songName = songName;
		this.movieName = movieName;
		this.singer = singer;
	}

	public String getSongName() {
		return songName;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getSinger() {
		return singer;
	}

	@Override
	public String toString() {
		return "PlayList [songName=" + songName + ", movieName=" + movieName + ", singer=" + singer + "]";
	}

}

class BoxNode {
	public PlayList song;
	public BoxNode next;
	public BoxNode prev;
}

class SongList {
	public BoxNode headNode;
	public BoxNode tailNode;
	public int totalSongs;

	public BoxNode creationOfDll(PlayList songList) {
		BoxNode node = new BoxNode();
		node.song = songList;
		node.next = node.prev = node;
		headNode = tailNode = node;
		totalSongs = 1;
		return headNode;
	}

	public void insertionDll(PlayList songList) {
		BoxNode node = new BoxNode();
		node.song = songList;
		if(headNode==null) {
			creationOfDll(songList);
		}else {
			node.next=headNode;
			node.prev = tailNode;
			tailNode.next = node;
			tailNode = node;
			headNode.prev = tailNode;
		}
		totalSongs++;
	}

	public void playOnce() {
		BoxNode tempNode = headNode;
		int i = 0;
		while (i < totalSongs) {
			PlayList play = tempNode.song;
			System.out.println(play.getSongName());
			tempNode = tempNode.next;
			i++;
		}
	}

	public void forwardTraverse() {
		BoxNode tempNode = headNode;
		while (tempNode != null) {
			PlayList songs = tempNode.song;
			System.out.println(songs.toString());
			tempNode = tempNode.next;
		}
	}

	public void backwardTraverse() {
		BoxNode tempNode = tailNode;
		while (tempNode != null) {
			PlayList songs = tempNode.song;
			System.out.println(songs.toString());
			tempNode = tempNode.prev;
		}
	}

	public void searchBySong(String songName) {

	}

	public void searchByMovieName(String MovieName) {

	}

	public void searchBySinger(String singerName) {

	}

	public void deletion() {

	}
}