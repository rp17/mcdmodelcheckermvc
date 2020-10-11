package controller.dataTypes.testHelpers;

public enum PassFail {
    PASS("Pass"),
    FAIL("Fail");

    private String string;

    PassFail(String string) {
        this.string = string;
    }

    public String toString() { return string; }
}