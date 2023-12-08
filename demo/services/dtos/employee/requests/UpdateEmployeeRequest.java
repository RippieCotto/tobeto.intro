package com.example.a.spring.into.services.dtos.employee.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UpdateEmployeeRequest {
    @Positive(message = "id 0'dan büyük olmalıdır.")
    private int id;

    @NotBlank(message = "isim boş geçilemez!")
    private String name;

    @NotBlank(message = "soyisim boş geçilemez!")
    private String lastName;

    @Length(min = 11, message = "Telefon numarasını alan kodu ile birlikte giriniz!")
    private String phone;
    private String eMail;
    private String department;

    @NotBlank(message = "Unvan boş bırakılamaz!")
    private String title;

    @Min(value = 10000, message = "Maaş 10000'den küçük olamaz!")
    private double salary;
}
