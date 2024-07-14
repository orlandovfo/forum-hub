@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String message;
    private Date creationDate;
    private Status status;
    @ManyToOne
    private Course course;
    @ManyToOne
    private User author;
}