public enum Day {
    MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"),
    THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");
        private String translation;
        Day (String translation) {
            this.translation = translation;
        }
    public String getRusName() {
            return translation;
    }
    public boolean isWeekend() {
        Day day = Day.SUNDAY;
        switch (day) {
            case SATURDAY, SUNDAY:
                return true;
            default:
                return false;
        }

    }
}

