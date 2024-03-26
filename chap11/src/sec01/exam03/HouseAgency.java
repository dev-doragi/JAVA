package sec01.exam03;

public class HouseAgency implements Rentable<House> {

	@Override
	public House rent() {
		return new House("오피스텔");
	}
	
}
