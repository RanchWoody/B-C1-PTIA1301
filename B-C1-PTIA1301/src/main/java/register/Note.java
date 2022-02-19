package register;

public class Note {

    private String name;
    private String topic;
    private String text;

    public String getName() {
        return name;
    }

    public Note()
    {
        this.name = "Anonymous";
        this.topic = "Default topic";
        this.text = "blank";
    }

    public Note(String name, String topic, String text) {
        this.name = name;
        this.topic = topic;
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNoteText()
    {
        return this.name+" ("+this.topic+"): "+this.text;
    }

}
