package com.example.a.spring.into.services.dtos.car.requests;

import com.example.a.spring.into.entities.Brand;
import com.example.a.spring.into.entities.Color;
import com.example.a.spring.into.entities.Type;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class AddCarRequest {

    @Min(value = 1980, message = "Model yılı 1980'den eski olamaz!")
    private int modelYear;

    @NotBlank(message = "Model ismi girilmelidir!")
    @NotNull
    private String name;
    // private Brand brand_id;

    @NotBlank
    @Length(min = 6, message = "Plaka bilgisi '00 xx 00' formatında girilmelidir!")
    private String numberPlate;
    // private Type type_id;
    // private Color color_id;

    private boolean isAvailable;

    @Positive(message = "id 0'dan büyük olmalıdır.")
    private int brandId;

}
