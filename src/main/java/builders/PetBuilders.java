package builders;

import dto.request.PetDto;

public class PetBuilders {

    public PetDto petDefaultBuilder() {
        return PetDto.builder()
                .name("Bobby good dog")
                .build();
    }
}
