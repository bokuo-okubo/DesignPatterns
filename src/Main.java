import com.bko.Starter;

import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        String execute = "composite";
        Starter.startProject(execute);
    }
}

class IOHandler{
    public static String selectProject() throws IOException {
        System.out.println("type project name");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
        return r.readLine();
    }
}