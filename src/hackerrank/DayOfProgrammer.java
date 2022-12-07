





   public static String dayOfProgrammer(int year) {
        
        if(year>1918){
            if(year%400==0||year%4==0&&year%100!=0)
                return "12.09."+year;
            return "13.09."+year;
        }
        else if(year==1918)return "26.09."+year;
        
        return year%4==0?"12.09."+year:"13.09."+year;
    }
