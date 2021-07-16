package co.yedam.exercise;

public class Car {
	private int carId;
	private String carName;
	private int carPrice;

	public Car() {

	}

	public Car(int carId, String carName, int carPrice) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carPrice = carPrice;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int string) {
		this.carPrice = string;
	}

}
