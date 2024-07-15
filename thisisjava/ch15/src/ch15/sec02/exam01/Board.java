package ch15.sec02.exam01;

public class Board {
    private String subject;
    private String content;
    private String writer;

    public Board(String content, String subject, String writer) {
        this.content = content;
        this.subject = subject;
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public String getSubject() {
        return subject;
    }

    public String getWriter() {
        return writer;
    }
}
