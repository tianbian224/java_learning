package 常用工具.jackson.domain;

public enum Department {
    /**
     *
     */
    music(1, "音乐"),
    english(2, "英语");

    private int code;
    private String text;

    Department(int code, String text) {
        this.code = code;
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
