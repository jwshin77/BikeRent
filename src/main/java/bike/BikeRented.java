package bike;

public class BikeRented extends AbstractEvent {

    private Long id;
    private Long bikeInventoryId;
    private String status;


    public BikeRented(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getBikeInventoryId() {
        return bikeInventoryId;
    }

    public void setBikeInventoryId(Long bikeInventoryId) {
        this.bikeInventoryId = bikeInventoryId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
