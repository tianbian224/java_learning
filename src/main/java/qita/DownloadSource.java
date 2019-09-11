package qita;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 用于下载公司源码
 */
public class DownloadSource {
    public static void main(String[] args) {
//        Runtime runtime = Runtime.getRuntime();
//        String cmd = "mvn dependency:sources";
//        File path = new File("G:\\CodeLib\\qunarCodeLib\\project");
//        File[] files = path.listFiles();
//        for (File file : files) {
//            if (file.isDirectory()) {
//                file.getAbsolutePath();
//            }
//        }


        String cmdd = "cmd ";// mvn dependency:sources  G:\\CodeLib\\qunarCodeLib\\project\\anti-crawl";
        test(cmdd);
    }

    public static void test(String commandStr) {
        BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec(commandStr);
            int exitValue = p.waitFor();
            if (0 != exitValue) p.destroy();

            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
