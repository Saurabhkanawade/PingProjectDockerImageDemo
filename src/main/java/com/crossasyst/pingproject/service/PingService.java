package com.crossasyst.pingproject.service;

import com.crossasyst.pingproject.model.PingRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PingService {

    private static List<PingRequest> list = new ArrayList();
    {
        list.add(new PingRequest("saurabh", "Kanwade"));
        list.add(new PingRequest("shailesh", "Karpe"));
    }

    public List<PingRequest> getList(){
        return list;
    }

}
