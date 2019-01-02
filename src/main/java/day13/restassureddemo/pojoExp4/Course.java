package day13.restassureddemo.pojoExp4;

import java.util.ArrayList;

public class Course {


    String name;
    String score;
    ArrayList<String> topics;


    public Course(String name, String score) {
        this.name = name;
        this.score = score;
        topics = new ArrayList<String>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public ArrayList<String> getTopics() {
        return topics;
    }

    public void setTopics(String topic) {
       topics.add(topic);
    }

}
