package com.glunlimited.sfgpetclinic.services;

import com.glunlimited.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
