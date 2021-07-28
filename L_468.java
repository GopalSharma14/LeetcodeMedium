class Solution {
    public String validIPAddress(String IP) {
        String[] IPv4= IP.split("\\.",-1);
        String[] IPv6=IP.split(":",-1);
        if(IP.chars().filter(ch -> ch=='.').count()==3){
            for(String s: IPv4){
            if(IPV4(s))
                continue;
            else
                return "Neither";
            
        }
            return "IPv4";
        }
         if(IP.chars().filter(ch -> ch==':').count()==7){
             for(String s: IPv6){
            if(IPV6(s))
                continue;
            else
                return "Neither";
            
        }
             return "IPv6";
         }
        
        return "Neither";
    }
    public boolean IPV4(String s){
        try{
            return String.valueOf(Integer.valueOf(s)).equals(s) && Integer.parseInt(s)>=0 && Integer.parseInt(s)<=255;
        }
        catch (NumberFormatException e){
            return false;
        }
            
    }
    
    public boolean IPV6(String s){
        if(s.length()>4)
            return false;
        try{
            return Integer.parseInt(s,16) >=0 ;
        }
        catch (NumberFormatException e){
            return false;
        }
            
        
    }
}