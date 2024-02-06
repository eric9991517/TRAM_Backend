package com.example.pvsm.model;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    private String uuid;
    private String username;
    private String userpws;
    private String email;
    private String nickname;

    public Users() {
        // 可以是空的或者初始化屬性的操作
    }

    public Users(String uuid, String username, String userpws, String email, String nickname) {

        this.uuid = uuid;
        this.username = username;
        this.userpws = userpws;
        this.email = email;
        this.nickname = nickname;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpws() {
        return userpws;
    }

    public void setUserpws(String userpws) {
        this.userpws = userpws;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
