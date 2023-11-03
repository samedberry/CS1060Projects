public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //increase by this many seconds
    public void increment(int increment) {
        this.second = this.second + increment;
        if (this.second > 59) {
            this.minute = this.minute + this.second / 60;
            this.second = this.second % 60;
        }
        if (this.minute > 59) {
            this.hour = this.hour + this.minute / 60;
            this.minute = this.minute % 60;
        }
        if (this.hour > 24) {
            this.hour = this.hour % 24;
        }
    }

    //print time object
    public void print(boolean military) {
        if (military) {
            System.out.printf(this.hour + ":%02d:%02d\n", this.minute, this.second);
        } else {
            int displayHour = this.hour;
            String amOrPm;
            if (this.hour < 12) {
                amOrPm = "AM";
                if (this.hour == 0) {
                    displayHour = 12;
                }
            } else {
                amOrPm = "PM";
                if (this.hour > 12) {
                    displayHour = this.hour - 12;
                }
            }
            System.out.printf(displayHour + ":%02d:%02d ", this.minute, this.second);
            System.out.printf(amOrPm);
            System.out.println();
        }
    }


    //timestamp must be formatted "HH:MM:SS"
    public static Time fromString(String timestamp) {
        return new Time(Integer.parseInt(timestamp.split(":")[0]), Integer.parseInt(timestamp.split(":")[1]), Integer.parseInt(timestamp.split(":")[2]));
    }
}


