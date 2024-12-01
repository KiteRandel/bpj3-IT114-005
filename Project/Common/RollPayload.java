//bpj3 11/19
package Project.Common;

public class RollPayload extends Payload {
    private String rollCommand;
    private int rollResult;

    public RollPayload() {
        super.setPayloadType(PayloadType.ROLLstuff);
    }

    public String getRollCommand() {
        return this.rollCommand;
    }

    public void setRollCommand(String rollCommand) {
        if (rollCommand != null && !rollCommand.isEmpty()) {
            this.rollCommand = rollCommand;
        } else {
            throw new IllegalArgumentException("Roll command cannot be null or empty.");
        }
    }

    public int getRollResult() {
        return this.rollResult;
    }

    public void setRollResult(int rollResult) {
        if (rollResult >= 0) {
            this.rollResult = rollResult;
        } else {
            throw new IllegalArgumentException("Roll result cannot be negative.");
        }
    }

    // Converting the RollPayload object into string format
    @Override
    public String toString() {
        return "RollPayload {" +
               "PayloadType=" + getPayloadType() +
               ", RollCommand='" + rollCommand + '\'' +
               ", RollResult=" + rollResult +
               '}';
    }
}
