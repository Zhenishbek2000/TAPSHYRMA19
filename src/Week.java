public enum Week {
    ДУЙШОМБУ("""
             14:30 - 16:30 -> English
             18:00 - 20:00 -> Duishombu kunu java okuim
            """),

    ШЕЙШЕМБИ("""
            14:30 -16:30 -> talking clab english
            18:00 - 20:00 ->praktika lesson Java""");
    private String lessons;

    Week(String lessons) {
        this.lessons = lessons;
    }

    public String getLessons() {
        return lessons;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Week = " +
                "lessons = " + lessons + '\'' +
                '=' + super.toString();
    }
}
