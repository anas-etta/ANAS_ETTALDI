package dao.Entities.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import dao.Entities.entities.Computer;



public interface ComputerRepository extends JpaRepository<Computer, Long> {
    List<Computer> findByProce(String proce);
    boolean existsByMacAddress(String macAddress);
}
