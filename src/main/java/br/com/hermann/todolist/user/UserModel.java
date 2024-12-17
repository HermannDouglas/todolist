package br.com.hermann.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    
    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // // Getters and Setters
    // public void setUsername(String username){
    //     this.username = username;
    // }

    // public String getUsername(){
    //     return this.username;
    // }

    // public void setName(String name){
    //     this.name = name;
    // }

    // public String getName(){
    //     return this.name;
    // }

    // public void setPassword(String password){
    //     this.password = password;
    // }

    // public String getPassword(){
    //     return this.password;
    // }
}
