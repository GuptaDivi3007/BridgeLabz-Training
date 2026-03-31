public class ValidateIpAddress {

    public static boolean isValidIPv4(String ip) {
        if (ip == null || ip.length() < 7 || ip.length() > 15) {
        	return false;
        }
        String[] parts = ip.split("\\.", -1); 
        if (parts.length != 4) {
            return false;
        }
        
        for (String part : parts) {
            if (part.length() == 0 || part.length() > 3) {
            	return false;
            }
            if (part.startsWith("0") && part.length() > 1) {
            	return false;
            }
            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) {
                    return false;
                }
            }
            catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isValidIPv4("128.0.0.1"));  
        System.out.println(isValidIPv4("222.111.111.111"));
        System.out.println(isValidIPv4("0.0.0.0"));     
        System.out.println(isValidIPv4("255.255.255.255"));
        System.out.println(isValidIPv4("1.2.3.4."));    
        System.out.println(isValidIPv4("01.2.3.4"));    
        System.out.println(isValidIPv4("256.1.2.3"));    
        System.out.println(isValidIPv4("1.2.3"));         
    }
}
