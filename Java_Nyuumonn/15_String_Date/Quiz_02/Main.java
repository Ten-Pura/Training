public class Main {
    public static void main(String[] args) {
        if (args.length == 2) {
            String path;
            path = getFilePath(args[0], args[1]);
            System.out.println(path);
        }
        else {
            System.out.println("引数は2つ入力してください。");
        }
    }

    public static String getFilePath(String folder, String file) {
        if(folder.matches(".*¥$")) {
            return folder + file;
        }
        else {
            return folder + "¥" + file;
        }
    }
}
