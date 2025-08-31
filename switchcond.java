public class switchcond{
    public static void main(String[] args) {
        int day=7;
        String dayName;
        switch(day){
            case 1:
            dayName="Moanday";
            break;
            case 2:
            dayName="Tue";
            break;
            case 3:
            dayName="weden";
            break;
            case 4:
            dayName="thu";
            break;
            case 5:
            dayName="frid";
            break;
            case 6:
            dayName="sat";
            break;
            case 7:
            dayName="sund";
            break;
            default:
            dayName="not matching";
        }
        System.out.println("day of the week is "+ dayName);
    }
}