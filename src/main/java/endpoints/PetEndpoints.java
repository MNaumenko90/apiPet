package endpoints;

public enum PetEndpoints {
    GET_USER("/Account/v1/User/");

    private final String endpoints;

    PetEndpoints(String endpoints) {
        this.endpoints = endpoints;
    }

    public String getEndpoints() {
        return endpoints;
    }
}
