package com.technotree.codeassessment.application.socialmedia.comment.dto;

public class UpdateCommentDTO {

    private int id;
    private String name;
    private String email;
    private String body;

    public UpdateCommentDTO(int id, String name, String email, String body) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public UpdateCommentDTO() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBody() {
        return body;
    }
}
