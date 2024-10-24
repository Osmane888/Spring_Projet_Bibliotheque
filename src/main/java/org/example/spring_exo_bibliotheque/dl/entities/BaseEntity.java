package org.example.spring_exo_bibliotheque.dl.entities;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@MappedSuperclass
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
@Getter
public abstract class BaseEntity<T> {

    @Id
    private T id;

    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public BaseEntity(T id) {
        this.id = id;
    }
}
