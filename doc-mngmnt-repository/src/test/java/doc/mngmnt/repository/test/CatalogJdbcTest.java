package doc.mngmnt.repository.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/*
@JdbcTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
@Sql(scripts = {
    //init schema
    "classpath:db.migration/V1__init.sql",
    //Setup test data
    "classpath:V2__set_data.sql"
})
@ContextConfiguration(locations = {"classpath:doc-mngmnt-runner"})
public class CatalogJdbcTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void assertJdbcTemplateNotNull() {
        assertNotNull(jdbcTemplate);
    }

    @Test
    public void testAlterNameOfCatalog() {
        final String newName = "newName";
        final Long id = 1L;
        jdbcTemplate.update("UPDATE catalog SET name = ? WHERE id=?", newName, id);
        String catalogName = jdbcTemplate
            .queryForObject("SELECT catalog.name FROM catalog WHERE id=" + id, String.class);
        assertEquals(newName, catalogName);
    }

    @Test
    public void testDetachFileFromCatalog() {
        final Long detachDocumentIdFromCatalog = 1L;
        final int hasDetached = jdbcTemplate.update("UPDATE document AS doc SET catalog_id=? WHERE doc.id=?", null, detachDocumentIdFromCatalog);
        assertEquals(1, hasDetached);
    }
}
*/
