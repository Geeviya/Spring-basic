package courierservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface Task extends JpaRepository<Enity_class, Long> {



        List<Enity_class> findAllByExecutiveName(String executiveName);
        List<Enity_class> findAllByReceiverAddress(String receiverAddress);
        List<Enity_class> findAllByReceiverName(String receiverName);
    }

