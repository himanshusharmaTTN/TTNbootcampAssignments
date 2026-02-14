package com.example.RestFulWebServices.Model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.swagger.v3.oas.annotations.media.Schema;

@JacksonXmlRootElement(localName = "user")
@Schema(description = "User entity representing application user")
public class User {

        @Schema(description = "User ID", example = "1")
        private int id;

        @Schema(description = "User name", example = "Himanshu")
        private String name;

        @Schema(description = "User email", example = "himanshu@gmail.com")
        private String email;
        @JsonIgnore
         private String password;
        public User() {}

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}

