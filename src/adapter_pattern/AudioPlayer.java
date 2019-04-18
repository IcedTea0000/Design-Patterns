package adapter_pattern;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaPlayer;
	
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if (audioType.equalsIgnoreCase("mp3")){
			System.out.println("playing mp3 file: "+fileName);
		}
		
		else if (audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
			mediaPlayer=new MediaAdapter(audioType);
			mediaPlayer.play(audioType, fileName);
		}
		
		else {
			System.out.println("invalid media: "+audioType+" format not support");
		}
	}
}
