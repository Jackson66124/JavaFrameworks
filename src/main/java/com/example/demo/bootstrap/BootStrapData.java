package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(partRepository.count() == 0) {
            InhousePart joystick = new InhousePart();
            joystick.setName("Joystick");
            joystick.setInv(23);
            joystick.setPrice(5.00);
            joystick.setId(100L);
            partRepository.save(joystick);

            InhousePart trigger = new InhousePart();
            trigger.setName("Trigger");
            trigger.setInv(14);
            trigger.setPrice(8.00);
            trigger.setId(101L);
            partRepository.save(trigger);

            InhousePart button = new InhousePart();
            button.setName("Button");
            button.setInv(25);
            button.setPrice(3.00);
            button.setId(102L);
            partRepository.save(button);

            InhousePart dpad = new InhousePart();
            dpad.setName("D-Pad");
            dpad.setInv(20);
            dpad.setPrice(10.00);
            dpad.setId(103L);
            partRepository.save(dpad);

            InhousePart bumper = new InhousePart();
            bumper.setName("Bumper");
            bumper.setInv(12);
            bumper.setPrice(7.00);
            bumper.setId(104L);
            partRepository.save(bumper);
        }


        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

//        System.out.println(thePart.getCompanyName());
//        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        if(productRepository.count() == 0) {
            Product xboxController = new Product("Xbox Controller", 60.0, 20);
            Product playStationController = new Product("Playstation Controller", 60.0, 20);
            Product switchController = new Product("Switch Controller", 50.0, 25);
            Product playStationProController = new Product("Playstation Pro Controller", 90.0, 15);
            Product xboxProController = new Product("Xbox Pro Controller", 90.0, 15);

            productRepository.save(xboxController);
            productRepository.save(playStationController);
            productRepository.save(switchController);
            productRepository.save(playStationProController);
            productRepository.save(xboxProController);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
