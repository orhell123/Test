package model;

import java.util.ArrayList;

public class Test {
    private int id;

    private String topic;

    private String question;

    private short quantity;

    private ArrayList <String> answers;

    private short fixing;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public String getQuestion() {
        return question;
    }

    public short getQuantity() {
        return quantity;
    }


    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public short getFixing() {
        return fixing;
    }

    public void setFixing(short fixing) {
        this.fixing = fixing;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Test(int id, String topic, String question, short quantity, ArrayList<String> answers, short fixing) {
        this.id = id;
        this.topic = topic;
        this.question = question;
        this.quantity = quantity;
        this.answers = answers;
        this.fixing = fixing;
    }

    public Test() {
        this.id = 0;
        this.topic = "";
        this.question = "";
        this.quantity = 0;
        this.answers = new ArrayList<>();
        this.fixing = 0;
    }
    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", question='" + question + '\'' +
                ", quantity=" + quantity +
                ", answers=" + answers +
                ", fixing=" + fixing +
                '}';
    }
}
