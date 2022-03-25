package com.glunlimited.sfgpetclinic.bootstrap;

import com.glunlimited.sfgpetclinic.model.Owner;
import com.glunlimited.sfgpetclinic.model.Vet;
import com.glunlimited.sfgpetclinic.services.VetService;
import com.glunlimited.sfgpetclinic.services.map.OwnerServiceMap;
import com.glunlimited.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.glunlimited.sfgpetclinic.services.OwnerService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastNmae("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastNmae("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1l);
        vet1.setFirstName("Sam");
        vet1.setLastNmae("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2l);
        vet2.setFirstName("Jessie");
        vet2.setLastNmae("Porter");

        vetService.save(vet2);
        System.out.println("Loaded Vets....");
    }
}
