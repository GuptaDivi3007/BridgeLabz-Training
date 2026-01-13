public class EmailAlertService implements AlertService {
    
	@Override
    public void sendAlert(String message) {
        System.out.println("[EMAIL ALERT] " + message);
    }
}
