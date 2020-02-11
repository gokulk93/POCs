package logistics.deliver;

public class Ship implements Transport{

	@Override
	public void deliver() {
		System.out.println("Delivered using Ship");
	}

}
