package com.example.demo;

/*import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/v1/api")
public class FetchTheEmployeeDetails {

    @PostMapping("/updateTheEmployeeDetails")
    public String fetchTheEmployeeDetails(@RequestBody UpdateEmployeeRequest updateEmployeeRequest)
    {
        EmplyoeeEntity emplyoeeEntity=iEmployeeRespository.findById(employeeId);
        emplyoeeEntity.setName(updateEmployeeRequest.getName());
        emplyoeeEntity.setAddress(updateEmployeeRequest.getAddress());
        emplyoeeEntity.setPhoneNumber(updateEmployeeRequest.getPhoneNumber());
        iEmployeeRespository.save(emplyoeeEntity);
        return "The Values Updated Successfully";
    }

    /*public void checkTheCircularLinkedList()
    {
        current=head;
        while(current.next!=null)
        {
            if(current.next!=null)
            {
                return true;
            }
            current=current.next;
        }
    }*/
//}
