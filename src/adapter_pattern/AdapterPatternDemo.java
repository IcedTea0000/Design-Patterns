package adapter_pattern;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer=new AudioPlayer();
		
		audioPlayer.play("mp3", "lullaby.mp3");
		audioPlayer.play("mp4", "avenger.mp4");
		audioPlayer.play("avi", "test.avi");
	}
}
