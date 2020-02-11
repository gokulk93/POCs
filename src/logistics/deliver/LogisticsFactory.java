package logistics.deliver;

public class LogisticsFactory {
	
	public Transport getTransportType(String type){
		return (
				type.equalsIgnoreCase("road") 
					? new Truck() 
					: type.equalsIgnoreCase("sea") 
						? new Ship()
						: type.equalsIgnoreCase("air")
							? new Flight()
							: null
				);
	}
}
