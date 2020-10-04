package honestit.projects.homeland.domain.repositories;

import honestit.projects.homeland.domain.model.common.DbFile;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DbFileRepository extends JpaRepository<DbFile, Long> {

    List<DbFile> findAllByContentTypeStartsWith(String mediaType);

    @EntityGraph(type = EntityGraph.EntityGraphType.LOAD, attributePaths = "data")
    DbFile findWithDataById(Long id);
}
