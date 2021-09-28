package io.github.axel1.tp7setetedos;

public class TrancheAge {
    private int code;
    private int ageMin;
    private int ageMax;

    public TrancheAge(int code, int ageMin, int ageMax) {
        this.code = code;
        this.ageMin = ageMin;
        this.ageMax = ageMax;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }

    public int getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(int ageMax) {
        this.ageMax = ageMax;
    }

    @Override
    public String toString() {
        return "TrancheAge{" +
                "code=" + code +
                ", ageMin=" + ageMin +
                ", ageMax=" + ageMax +
                '}';
    }
}
