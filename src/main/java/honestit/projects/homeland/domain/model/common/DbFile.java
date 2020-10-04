package honestit.projects.homeland.domain.model.common;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "files")
@Getter @Setter @ToString(exclude = "data") @EqualsAndHashCode(of = "id")
public class DbFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "file_name", nullable = false)
    private String fileName;
    @Column(name = "original_file_name")
    private String originalFileName;
    @Column(name = "content_type", nullable = false)
    private String contentType;
    private Long size;
    @Lob
    @Basic(fetch = FetchType.LAZY, optional = false)
    @Column(nullable = false, columnDefinition = "MEDIUMBLOB")
    private byte[] data;

    @Column(name = "created_on", updatable = false)
    private LocalDateTime createdOn;

    @PrePersist
    public void prePersist() {
        createdOn = LocalDateTime.now();
    }

}
