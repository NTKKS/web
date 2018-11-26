package cz.uhk.fim.spring.web.utils;

import cz.uhk.fim.spring.web.model.RSSSource;
import org.springframework.util.ResourceUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    private static final String CONFIG_FILE = "config.cfg";

    public static String loadStringFromFile(File file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(file.getPath())));
    }
    /*
    public static void saveStringToFile(File filepath, byte[] data) throws IOException {
        Path path = Paths.get(filepath);
        Files.write(path, data);
    }*/

    public static List<RSSSource> loadSources() throws IOException {
        List<RSSSource> sources = new ArrayList<>();
        new BufferedReader(new StringReader(loadStringFromFile(ResourceUtils.getFile("classpath:static/sources.cfg"))))
                .lines().forEach(lines -> {
            String[] parts = lines.split(";");
            sources.add(new RSSSource(parts[0],parts[1]));
        });

        return sources;
    }

    public static void saveSources (List<RSSSource> sources){
        StringBuilder fileContent = new StringBuilder();
        for (int i = 0; i<sources.size();i++){
            fileContent.append(String.format("%s;%s",
                    sources.get(i).getName(),
                    sources.get(i).getSource()));
            fileContent.append(i != sources.size() - 1 ? "\n" : "");
        }
        /*
        try {
            saveStringToFile(CONFIG_FILE,fileContent.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

}
