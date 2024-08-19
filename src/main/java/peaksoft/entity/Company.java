package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "companies")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "company_gen")
    @SequenceGenerator(name = "company_gen",
    sequenceName = "company_seq",
    allocationSize = 1)
    private Long id;
    private String name;
    private String description;
    private String image;
}
