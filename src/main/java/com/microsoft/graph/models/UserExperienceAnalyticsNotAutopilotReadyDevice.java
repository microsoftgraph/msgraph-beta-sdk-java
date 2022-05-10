package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsNotAutopilotReadyDevice extends Entity implements Parsable {
    /** The intune device's autopilotProfileAssigned. */
    private Boolean _autoPilotProfileAssigned;
    /** The intune device's autopilotRegistered. */
    private Boolean _autoPilotRegistered;
    /** The intune device's azure Ad joinType. */
    private String _azureAdJoinType;
    /** The intune device's azureAdRegistered. */
    private Boolean _azureAdRegistered;
    /** The intune device's name. */
    private String _deviceName;
    /** The intune device's managed by. */
    private String _managedBy;
    /** The intune device's manufacturer. */
    private String _manufacturer;
    /** The intune device's model. */
    private String _model;
    /** The intune device's serial number. */
    private String _serialNumber;
    /**
     * Instantiates a new userExperienceAnalyticsNotAutopilotReadyDevice and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsNotAutopilotReadyDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsNotAutopilotReadyDevice
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsNotAutopilotReadyDevice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsNotAutopilotReadyDevice();
    }
    /**
     * Gets the autoPilotProfileAssigned property value. The intune device's autopilotProfileAssigned.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutoPilotProfileAssigned() {
        return this._autoPilotProfileAssigned;
    }
    /**
     * Gets the autoPilotRegistered property value. The intune device's autopilotRegistered.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutoPilotRegistered() {
        return this._autoPilotRegistered;
    }
    /**
     * Gets the azureAdJoinType property value. The intune device's azure Ad joinType.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureAdJoinType() {
        return this._azureAdJoinType;
    }
    /**
     * Gets the azureAdRegistered property value. The intune device's azureAdRegistered.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAzureAdRegistered() {
        return this._azureAdRegistered;
    }
    /**
     * Gets the deviceName property value. The intune device's name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsNotAutopilotReadyDevice currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("autoPilotProfileAssigned", (n) -> { currentObject.setAutoPilotProfileAssigned(n.getBooleanValue()); });
            this.put("autoPilotRegistered", (n) -> { currentObject.setAutoPilotRegistered(n.getBooleanValue()); });
            this.put("azureAdJoinType", (n) -> { currentObject.setAzureAdJoinType(n.getStringValue()); });
            this.put("azureAdRegistered", (n) -> { currentObject.setAzureAdRegistered(n.getBooleanValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("managedBy", (n) -> { currentObject.setManagedBy(n.getStringValue()); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
            this.put("serialNumber", (n) -> { currentObject.setSerialNumber(n.getStringValue()); });
        }};
    }
    /**
     * Gets the managedBy property value. The intune device's managed by.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedBy() {
        return this._managedBy;
    }
    /**
     * Gets the manufacturer property value. The intune device's manufacturer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the model property value. The intune device's model.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Gets the serialNumber property value. The intune device's serial number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSerialNumber() {
        return this._serialNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("autoPilotProfileAssigned", this.getAutoPilotProfileAssigned());
        writer.writeBooleanValue("autoPilotRegistered", this.getAutoPilotRegistered());
        writer.writeStringValue("azureAdJoinType", this.getAzureAdJoinType());
        writer.writeBooleanValue("azureAdRegistered", this.getAzureAdRegistered());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("managedBy", this.getManagedBy());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
    }
    /**
     * Sets the autoPilotProfileAssigned property value. The intune device's autopilotProfileAssigned.
     * @param value Value to set for the autoPilotProfileAssigned property.
     * @return a void
     */
    public void setAutoPilotProfileAssigned(@javax.annotation.Nullable final Boolean value) {
        this._autoPilotProfileAssigned = value;
    }
    /**
     * Sets the autoPilotRegistered property value. The intune device's autopilotRegistered.
     * @param value Value to set for the autoPilotRegistered property.
     * @return a void
     */
    public void setAutoPilotRegistered(@javax.annotation.Nullable final Boolean value) {
        this._autoPilotRegistered = value;
    }
    /**
     * Sets the azureAdJoinType property value. The intune device's azure Ad joinType.
     * @param value Value to set for the azureAdJoinType property.
     * @return a void
     */
    public void setAzureAdJoinType(@javax.annotation.Nullable final String value) {
        this._azureAdJoinType = value;
    }
    /**
     * Sets the azureAdRegistered property value. The intune device's azureAdRegistered.
     * @param value Value to set for the azureAdRegistered property.
     * @return a void
     */
    public void setAzureAdRegistered(@javax.annotation.Nullable final Boolean value) {
        this._azureAdRegistered = value;
    }
    /**
     * Sets the deviceName property value. The intune device's name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the managedBy property value. The intune device's managed by.
     * @param value Value to set for the managedBy property.
     * @return a void
     */
    public void setManagedBy(@javax.annotation.Nullable final String value) {
        this._managedBy = value;
    }
    /**
     * Sets the manufacturer property value. The intune device's manufacturer.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the model property value. The intune device's model.
     * @param value Value to set for the model property.
     * @return a void
     */
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
    /**
     * Sets the serialNumber property value. The intune device's serial number.
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    public void setSerialNumber(@javax.annotation.Nullable final String value) {
        this._serialNumber = value;
    }
}
