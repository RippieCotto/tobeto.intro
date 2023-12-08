package com.example.a.spring.into.services.dtos.employee.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class AddEmployeeRequest {

    @NotBlank(message = "isim boş geçilemez!")
    private String name;
    @NotBlank(message = "Soyisim boş geçilemez!")
    private String lastName;

    @Length(min = 11, message = "Telefon numarasını alan kodu ile birlikte giriniz!")
    private String phone;
    private String eMail;

    @NotBlank(message = "Unvan boş bırakılamaz!")
    private  String department;
    private  String title;

    @Min(value = 10000, message = "Maaş 10000'den büyük olmalıdır!")
    private double salary;
}
