package com.example.spring_poc_curd;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Ekart")
public class EkartMapping {
    private List<Ekart> flipkart = new ArrayList<>();

    @PostConstruct
    public void product() {
        flipkart.add(new Ekart(11,"Sri","mobile","salem",234432,6575,"transit","samsung"));
        flipkart.add(new Ekart(12, "hari", "Laptop", "Namakkal", 12364, 96000, "Transist", "HP"));
    }


    @GetMapping("/")
    public List<Ekart> viewAll(){
        return flipkart;
    }

    @PostMapping("/add")
    public Ekart id(@RequestBody Ekart product) {
        flipkart.add(product);
        return product;
    }
    @PutMapping("/new")
    public String Update(@RequestBody Ekart New_updates){
        boolean update=false;

        for(int i=0;i<flipkart.size();i++){
            if(flipkart.get(i).getParcelId()==New_updates.getParcelId()){
                flipkart.get(i).setProductStatus(New_updates.getProductStatus());
                System.out.println(flipkart.get(i).getParcelId());
                update=true;
                break;
            }
        }
        if(update==true){
            return "Iterm_status "+New_updates.getProductStatus() +"is updated";
        }
        else {
            return "The parcelID"+New_updates.getParcelId()+" is not in the list";
        }
    }
    @GetMapping("/Get/rec/{receiver}")
    public List<Ekart> recevier (@PathVariable( "recevier") String receiver ) {
        return flipkart.stream().filter(list -> list.getReceiverName().equalsIgnoreCase(receiver)).collect(Collectors.toList());

    }

    @GetMapping("/get/address/{address}")
    public List<Ekart>  address(@PathVariable("address") String address){
        return flipkart.stream().filter(list -> list.getReceiverAddress().equalsIgnoreCase(address)).collect(Collectors.toList());
    }

    @GetMapping("/get/{executive}")
    public List<Ekart> executive(@PathVariable("executive") String executive) {
        return flipkart.stream().filter(list -> list.getExecutiveName().equalsIgnoreCase(executive)).collect(Collectors.toList());
    }
}
