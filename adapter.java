interface AudioPlayer {
    void play(String audioType, String fileName);
}
interface WAVPlayer {
    void playWAV (String fileName);
}
interface AACPlayer {
    void playAAC (String fileName);
}

class MP3Player implements AudioPlayer {
    AudioAdapter audioAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("MP3")) {
            System.out.println("Playing MP3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("WAV") || audioType.equalsIgnoreCase("AAC")) {
            audioAdapter = new AudioAdapter(audioType);
            audioAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Invalid media. MP3, WAV, and AAC formats supported only.");
        }
    }
}

class AdvancedAudioPlayer implements WAVPlayer, AACPlayer {
    @Override
    public void playWAV (String fileName) {
        System.out.println("Playing WAV file. Name: " + fileName);
    }
    @Override
    public void playAAC (String fileName) {
        System.out.println("Playing AAC file. Name: " + fileName);
    }
}

class AudioAdapter implements AudioPlayer {
    AdvancedAudioPlayer advancedAudioPlayer;

    public AudioAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("WAV")) {
            advancedAudioPlayer = new AdvancedAudioPlayer();
        }
        else if (audioType.equalsIgnoreCase("AAC")) {
            advancedAudioPlayer = new AdvancedAudioPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("WAV")) {
            advancedAudioPlayer.playWAV(fileName);
        }
        else if (audioType.equalsIgnoreCase("AAC")) {
            advancedAudioPlayer.playAAC(fileName);
        }
    }
}