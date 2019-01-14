package Week_4.ex10;

import Week_4.ex9.FileReader;
import exercise.week4.ex7.Topic;


import java.util.ArrayList;
import java.util.List;

public class TopicReader {

    private FileReader reader = new FileReader();

    public List<Topic> asList() {
        List<String> lines = readAllLines();
        List<Topic> topics = parseTopics(lines);
        return topics;
    }

    private List<String> readAllLines() {
        String filePath = "exercise/week4/ex10/topics.txt";
        return reader.getlines(filePath);
    }

    private List<Topic> parseTopics(List<String> lines) {
        List<Topic> topics = new ArrayList<>();
        for (String line : lines) {
            topics.add(new Topic(line));
        }
        return topics;
    }

}
