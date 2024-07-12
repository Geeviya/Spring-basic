package courierservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Base")
public class rest {
        @Autowired
        Ekart_service Service;


        @PostMapping("/old")
        public Enity_class Posting(@RequestBody Enity_class new_data){
            return Service.post(new_data);
        }
        @GetMapping("/get/{executive}")
        public List<Enity_class> getExecutive(@PathVariable("executive") String executive){
            return Service.get_excutive(executive);
        }

        @GetMapping("/get/{address}")
        public List<Enity_class> getaddress(@PathVariable("address") String address){
            return Service.get_address(address);
        }

        @GetMapping("/get/{receiver}")
        public List<Enity_class> getreceiver(@PathVariable("receiver") String receiver){
            return Service.get_receiver(receiver);
        }


    }

