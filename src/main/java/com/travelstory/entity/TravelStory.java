package com.travelstory.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Component
@ToString(exclude = { "comments", "likes", "userOwner" })
@JsonIgnoreProperties(value = { "handler", "hibernateLazyInitializer" })
public class TravelStory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @NotBlank
    private String head;

    private String description;
    private LocalDate createdDate;

    private LocalDate updatedDate;

    @Enumerated(EnumType.STRING)
    private TravelStoryStatus travelStoryStatus;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "travelStory")
    private List<Like> likes;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "travelStory")
    private List<Comment> comments;

    @ManyToOne
    @JsonBackReference
    @NotBlank
    private User userOwner;

    private enum TravelStoryStatus {
        STATUS_ACTIVE, STATUS_INACTIVE;
    }

}
