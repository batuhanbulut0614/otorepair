package ibmtal.otorepair.business.managers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import ibmtal.otorepair.core.result.Result;
import ibmtal.otorepair.database.CarDao;
import ibmtal.otorepair.database.CustomerDao;
import ibmtal.otorepair.dtos.CarAddDto;
import ibmtal.otorepair.entities.Car;

public class CarManagers {
	private CarDao carDao;
    private CustomerDao customerDao;
    @Autowired
	public CarManegers(CarDao carDao,CustomerDao customerDao) {
		super();
		this.carDao = carDao;
		this.customerDao = customerDao;
	}

	@Override
	public Result<Car> getAll() {
		Result<Car> result=new Result<>();
		result.setData(new ArrayList<Car>(this.carDao.findAll()));
		return result;
	}

	@Override
	public Result<Car> addCar(CarAddDto addDto) {
		Result<Car> result=new Result<>();
		if(this.customerDao.findById(addDto.getBrand()).isEmpty()) {
			result.newError("brand","Marka Kaydı Bulunamadı");
		}
		if(addDto.getName().isBlank()) {
			result.newError("name","Araba Adını Boş Geçemesiniz");
		}
		if(result.isSuccess()) {
			Car car=new Car();
			car.setName(addDto.getName());
			car.setPrice(addDto.getPrice());
			car.setBrand(this.customerDao.findById(addDto.getBrand()).get());
			this.carDao.save(car);
			result.getData().add(car);
		}
		return result;
	}
    
}
