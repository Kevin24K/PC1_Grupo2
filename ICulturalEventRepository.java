package pe.edu.upc.demopc1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demopc1.entities.CulturalEvent;

import java.util.List;

@Repository
public interface ICulturalEventRepository extends JpaRepository<CulturalEvent, Long> {

    @Query(value = "SELECT e.modality, c.name, COUNT(a.id)" +
    "FROM cultural_activity a " +
    "JOIN cultural_event e ON a.categoryid = c.id" +
    "GROUP BY e.modality, c.name", nativeQuery = true)
    List<Object[]> obtenerCantidadActividadesPorModalidadYCategoria();
}
