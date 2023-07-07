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
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Pid;
    private String name;
    private String address;
    private String p_number;


    @ManyToOne
    @JoinColumn(name = "Did")
    private Daladala daladala;
}
