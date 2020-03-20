public class DofProgram {
    public String Day(int year) {
        if (year == 1918) {
            return 26 + ".09." + year;
        }
        if ((year < 1917 && year % 4 == 0) || (year > 1918 && year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return 12+".09."+year;
        }
        else{
            return 13+".09."+year;
        }
    }
    public static void main(String[] args){
        DofProgram t1 =new DofProgram ();
        System.out.println(t1.Day (2200));
    }
}
