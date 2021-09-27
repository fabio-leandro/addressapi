package com.fabio.addressapi.consumer;

import com.fabio.addressapi.entity.Address;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsumerCep {

    public Object consumerCepApi(String cep){

        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();

        ResponseEntity<Address> address =
                restTemplate.getForEntity("https://viacep.com.br/ws/"+cep+"/json/", Address.class);

        return address;

    }
}
