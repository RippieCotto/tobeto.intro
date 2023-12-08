package com.example.a.spring.into.repositories;

import com.example.a.spring.into.entities.Brand;
import com.example.a.spring.into.services.dtos.brand.responses.GetListBrandResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Generic
public interface BrandRepository extends JpaRepository<Brand,Integer> {


    //Derived Query Method => Fonksiyon İsimlendirmesi Kuralları
    //Derived Query Matodlar sadece veritabanı entity türüyle çalışır.

    // Tablo ismi değil entity ismi kullanulacak (brands X Brand \/)
    //Entity'e her zaman alias verilecek (Brand b)
    //Dinamik alanlarda fonksiyon parametresi okumak için :parametreAdi kalıbı kullanılacak
    //JPQL içinde obje newlenebilir.
    //NEWlenen objeler tam yoluyla belirtilmelidir. Tam Yol => com.example.a.spring.into.services.dtos.brand.responses
   // List<Brand> findByName(String name);
    List<Brand> findByNameStartingWith(String name);

    @Query("Select new com.example.a.spring.into.services.dtos.brand.responses.GetListBrandResponse(b.id, b.name) FROM Brand b WHERE b.name= :name") //SQL Değil JPQL ---jpaa + sql--- Custom Query
        // Kaynak: https://docs.oracle.com/cd/E17904_01/apirefs.1111/e13946/ejb3_langref.html
    //Kaynak2: https://www.objectdb.com/java/jpa/query/jpql/select
    //Kaynak 3: https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
    List<GetListBrandResponse> findByName(String name);


}
