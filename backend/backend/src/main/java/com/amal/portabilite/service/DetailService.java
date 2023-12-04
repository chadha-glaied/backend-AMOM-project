package com.amal.portabilite.service;

import com.amal.portabilite.model.Detail;

import java.util.List;
import java.util.Set;

public interface DetailService {

    List<Detail> getDetails();
    Detail getDetail( Long detailId );
}
