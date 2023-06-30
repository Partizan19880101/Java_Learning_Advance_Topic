package javaAdvance.enums;


public enum WeekDays {
        MONDAY("hard to concentrate"),
        TUESDAY("normal"),
        WEDNESDAY("easy"),
        THURSDAY("calm"),
        FRIDAY("tired"),
        SATURDAY("sleepy"),
        SUNDAY("little sad");

        private String mood;

        private WeekDays(String mood){
                this.mood = mood;
        }

        public String getMood(){
                return mood;
        }
}
