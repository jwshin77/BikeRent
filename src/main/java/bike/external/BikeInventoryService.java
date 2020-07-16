
package bike.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="BikeInventory", url="http://BikeInventory:8080")
public interface BikeInventoryService {

    @RequestMapping(method= RequestMethod.POST, path="/bikeInventories")
    public void registBike(@RequestBody BikeInventory bikeInventory);

}