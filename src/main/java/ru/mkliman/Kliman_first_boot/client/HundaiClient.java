package ru.mkliman.Kliman_first_boot.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import ru.mkliman.Kliman_first_boot.model.Car;

public class HundaiClient {
    public static Car getTemplate() {
        RestTemplate template = new RestTemplate();
        ResponseEntity<Car> response = template.getForEntity("https://showroom.hyundai.ru/rest/car", Car.class);

        return response.getBody();
    }

}
