package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MobileAppTroubleshootingAppTargetHistory extends MobileAppTroubleshootingHistoryItem implements Parsable {
    /** Error code for the failure, empty if no failure. */
    private String _errorCode;
    /** Indicates the type of execution status of the device management script. */
    private RunState _runState;
    /** AAD security group id to which it was targeted. */
    private String _securityGroupId;
    /**
     * Instantiates a new MobileAppTroubleshootingAppTargetHistory and sets the default values.
     * @return a void
     */
    public MobileAppTroubleshootingAppTargetHistory() {
        super();
        this.setOdataType("#microsoft.graph.mobileAppTroubleshootingAppTargetHistory");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppTroubleshootingAppTargetHistory
     */
    @javax.annotation.Nonnull
    public static MobileAppTroubleshootingAppTargetHistory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppTroubleshootingAppTargetHistory();
    }
    /**
     * Gets the errorCode property value. Error code for the failure, empty if no failure.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorCode() {
        return this._errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileAppTroubleshootingAppTargetHistory currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("errorCode", (n) -> { currentObject.setErrorCode(n.getStringValue()); });
            this.put("runState", (n) -> { currentObject.setRunState(n.getEnumValue(RunState.class)); });
            this.put("securityGroupId", (n) -> { currentObject.setSecurityGroupId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the runState property value. Indicates the type of execution status of the device management script.
     * @return a runState
     */
    @javax.annotation.Nullable
    public RunState getRunState() {
        return this._runState;
    }
    /**
     * Gets the securityGroupId property value. AAD security group id to which it was targeted.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSecurityGroupId() {
        return this._securityGroupId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeEnumValue("runState", this.getRunState());
        writer.writeStringValue("securityGroupId", this.getSecurityGroupId());
    }
    /**
     * Sets the errorCode property value. Error code for the failure, empty if no failure.
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    public void setErrorCode(@javax.annotation.Nullable final String value) {
        this._errorCode = value;
    }
    /**
     * Sets the runState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the runState property.
     * @return a void
     */
    public void setRunState(@javax.annotation.Nullable final RunState value) {
        this._runState = value;
    }
    /**
     * Sets the securityGroupId property value. AAD security group id to which it was targeted.
     * @param value Value to set for the securityGroupId property.
     * @return a void
     */
    public void setSecurityGroupId(@javax.annotation.Nullable final String value) {
        this._securityGroupId = value;
    }
}
