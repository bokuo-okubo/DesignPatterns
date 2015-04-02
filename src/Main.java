import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        String name = IOHandler.selectProject();
        Starter.startProject(name);
    }
}

class IOHandler{
    public static String selectProject() throws IOException {
        System.out.println("type project name");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
        return r.readLine();
    }
}