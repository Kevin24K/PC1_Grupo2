package pe.edu.upc.demopc1.servicesinterfaces;

import pe.edu.upc.demopc1.entities.CulturalCategory;

import java.util.List;

public interface ICulturalEventService {
    void e2_updateCategory(CulturalCategory e2_categoria);
        CulturalCategory e2_findCategoryById(Long e2_id);
    List<Object[]> e2_getCategoriesSummary();
}
