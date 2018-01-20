package com.project.runcooperative.web.services.defaultinterface;

import com.project.runcooperative.web.entities.PersonnelEntity;

public interface PersonnelServiceInt {
    public void save(PersonnelEntity personnel);
    public void delete();
    public Boolean AuthenticatePersonnel(String email,String Password);
}
