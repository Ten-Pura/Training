public class Exception_17_13{
    public static void main(String[] args) {
        try {
            throw new UnsupportedMusicFileException("Unsupported file");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}