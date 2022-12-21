package ibmtal.otorepair.business.services;

import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.dtos.CarAddDto;
import ibmtal.otorepair.entities.Car;

public interface CarService {
	Result<Car> getAll();
    Result<Car> addCar(CarAddDto addDto);

}
