package vn.name.linh;

import com.jcraft.jsch.*;


/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // The command to run in a PTY...
        String[] cmd = { "/bin/sh", "-l" };
        // The initial environment to pass to the PTY child process...
        String[] env = { "TERM=xterm" };

        PtyProcess pty = PtyProcess.exec(cmd, env);

        OutputStream os = pty.getOutputStream();
        InputStream is = pty.getInputStream();

    }
}
