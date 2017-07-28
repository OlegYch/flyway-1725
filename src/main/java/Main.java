import org.flywaydb.core.Flyway;

public class Main {
    public static void main(String[] args) {
        new Flyway() {{
            setDataSource("jdbc:mysql://localhost/flyway_1725?createDatabaseIfNotExist=true", "root", null);
            setBaselineOnMigrate(true);
            migrate();
        }};
    }
}
