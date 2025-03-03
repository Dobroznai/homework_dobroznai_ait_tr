package de.ait.consultation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    String name;
    int age;
    String password;

    public void setName(@NonNull String name) {
        this.name = name;
    }
}
