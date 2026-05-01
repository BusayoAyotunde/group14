package outdrive.exceptions;

public class VehicleNotAvailableException extends Exception {

    public VehicleNotAvailableException(String plateNumber) {
        super("Vehicle not available: " + plateNumber);
    }
}