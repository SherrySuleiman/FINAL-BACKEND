package PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
public class Daladala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Did;
    private String name;


    @ManyToOne
    @JoinColumn(name = "Sid")
    private Station station;

    @ManyToOne
    @JoinColumn(name = "Oid")
    private Officer officer;
}
