package bike;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="BikeRent_table")
public class BikeRent {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long bikeInventoryId;
    private Long status;

    @PostPersist
    public void onPostPersist(){
        BikeRented bikeRented = new BikeRented();
        BeanUtils.copyProperties(this, bikeRented);
        bikeRented.publishAfterCommit();


    }

    @PostUpdate
    public void onPostUpdate(){
        BikeReturned bikeReturned = new BikeReturned();
        BeanUtils.copyProperties(this, bikeReturned);
        bikeReturned.publishAfterCommit();


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
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }




}
