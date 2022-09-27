package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Describes the embedded SIM activation code deployment state in relation to a device. */
public class EmbeddedSIMDeviceState extends Entity implements Parsable {
    /** The time the embedded SIM device status was created. Generated service side. */
    private OffsetDateTime _createdDateTime;
    /** Device name to which the subscription was provisioned e.g. DESKTOP-JOE */
    private String _deviceName;
    /** The time the embedded SIM device last checked in. Updated service side. */
    private OffsetDateTime _lastSyncDateTime;
    /** The time the embedded SIM device status was last modified. Updated service side. */
    private OffsetDateTime _modifiedDateTime;
    /** Describes the various states for an embedded SIM activation code. */
    private EmbeddedSIMDeviceStateValue _state;
    /** String description of the provisioning state. */
    private String _stateDetails;
    /** The Universal Integrated Circuit Card Identifier (UICCID) identifying the hardware onto which a profile is to be deployed. */
    private String _universalIntegratedCircuitCardIdentifier;
    /** Username which the subscription was provisioned to e.g. joe@contoso.com */
    private String _userName;
    /**
     * Instantiates a new embeddedSIMDeviceState and sets the default values.
     * @return a void
     */
    public EmbeddedSIMDeviceState() {
        super();
        this.setOdataType("#microsoft.graph.embeddedSIMDeviceState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a embeddedSIMDeviceState
     */
    @javax.annotation.Nonnull
    public static EmbeddedSIMDeviceState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmbeddedSIMDeviceState();
    }
    /**
     * Gets the createdDateTime property value. The time the embedded SIM device status was created. Generated service side.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the deviceName property value. Device name to which the subscription was provisioned e.g. DESKTOP-JOE
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
        final EmbeddedSIMDeviceState currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("modifiedDateTime", (n) -> { currentObject.setModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(EmbeddedSIMDeviceStateValue.class)); });
            this.put("stateDetails", (n) -> { currentObject.setStateDetails(n.getStringValue()); });
            this.put("universalIntegratedCircuitCardIdentifier", (n) -> { currentObject.setUniversalIntegratedCircuitCardIdentifier(n.getStringValue()); });
            this.put("userName", (n) -> { currentObject.setUserName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastSyncDateTime property value. The time the embedded SIM device last checked in. Updated service side.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
    }
    /**
     * Gets the modifiedDateTime property value. The time the embedded SIM device status was last modified. Updated service side.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this._modifiedDateTime;
    }
    /**
     * Gets the state property value. Describes the various states for an embedded SIM activation code.
     * @return a embeddedSIMDeviceStateValue
     */
    @javax.annotation.Nullable
    public EmbeddedSIMDeviceStateValue getState() {
        return this._state;
    }
    /**
     * Gets the stateDetails property value. String description of the provisioning state.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStateDetails() {
        return this._stateDetails;
    }
    /**
     * Gets the universalIntegratedCircuitCardIdentifier property value. The Universal Integrated Circuit Card Identifier (UICCID) identifying the hardware onto which a profile is to be deployed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUniversalIntegratedCircuitCardIdentifier() {
        return this._universalIntegratedCircuitCardIdentifier;
    }
    /**
     * Gets the userName property value. Username which the subscription was provisioned to e.g. joe@contoso.com
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this._userName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("stateDetails", this.getStateDetails());
        writer.writeStringValue("universalIntegratedCircuitCardIdentifier", this.getUniversalIntegratedCircuitCardIdentifier());
        writer.writeStringValue("userName", this.getUserName());
    }
    /**
     * Sets the createdDateTime property value. The time the embedded SIM device status was created. Generated service side.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the deviceName property value. Device name to which the subscription was provisioned e.g. DESKTOP-JOE
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the lastSyncDateTime property value. The time the embedded SIM device last checked in. Updated service side.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the modifiedDateTime property value. The time the embedded SIM device status was last modified. Updated service side.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._modifiedDateTime = value;
    }
    /**
     * Sets the state property value. Describes the various states for an embedded SIM activation code.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final EmbeddedSIMDeviceStateValue value) {
        this._state = value;
    }
    /**
     * Sets the stateDetails property value. String description of the provisioning state.
     * @param value Value to set for the stateDetails property.
     * @return a void
     */
    public void setStateDetails(@javax.annotation.Nullable final String value) {
        this._stateDetails = value;
    }
    /**
     * Sets the universalIntegratedCircuitCardIdentifier property value. The Universal Integrated Circuit Card Identifier (UICCID) identifying the hardware onto which a profile is to be deployed.
     * @param value Value to set for the universalIntegratedCircuitCardIdentifier property.
     * @return a void
     */
    public void setUniversalIntegratedCircuitCardIdentifier(@javax.annotation.Nullable final String value) {
        this._universalIntegratedCircuitCardIdentifier = value;
    }
    /**
     * Sets the userName property value. Username which the subscription was provisioned to e.g. joe@contoso.com
     * @param value Value to set for the userName property.
     * @return a void
     */
    public void setUserName(@javax.annotation.Nullable final String value) {
        this._userName = value;
    }
}
