package ro.agilehub.javacourse.car.hire.user.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "base_entity")
@Data
@EqualsAndHashCode(of = "id")
public class BaseUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String password;
    private String firstName;
    private String lastName;

    @OneToOne
    @JoinColumn(name = "name_and_password")
    private User nameAndPassword;
}
