package courierservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class Ekart_service {
        @Autowired
        Task jpa;

        public Enity_class post(Enity_class data){
            return jpa.save(data);
        }

        public List<Enity_class> get_excutive(String name){
            return  jpa.findAllByExecutiveName(name);
        }

        public List<Enity_class> get_address(String address){
            return jpa.findAllByReceiverAddress(address);
        }

        public List<Enity_class> get_receiver(String receiver){
            return jpa.findAllByReceiverName(receiver);
        }


    }

