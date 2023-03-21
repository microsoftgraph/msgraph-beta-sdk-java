package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RemoteActionAudit extends Entity implements Parsable {
    /** Remote actions Intune supports. */
    private RemoteAction action;
    /** The actionState property */
    private ActionState actionState;
    /** Intune device name. */
    private String deviceDisplayName;
    /** IMEI of the device. */
    private String deviceIMEI;
    /** Upn of the device owner. */
    private String deviceOwnerUserPrincipalName;
    /** User who initiated the device action, format is UPN. */
    private String initiatedByUserPrincipalName;
    /** Action target. */
    private String managedDeviceId;
    /** Time when the action was issued, given in UTC. */
    private OffsetDateTime requestDateTime;
    /** [deprecated] Please use InitiatedByUserPrincipalName instead. */
    private String userName;
    /**
     * Instantiates a new RemoteActionAudit and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RemoteActionAudit() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RemoteActionAudit
     */
    @javax.annotation.Nonnull
    public static RemoteActionAudit createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteActionAudit();
    }
    /**
     * Gets the action property value. Remote actions Intune supports.
     * @return a remoteAction
     */
    @javax.annotation.Nullable
    public RemoteAction getAction() {
        return this.action;
    }
    /**
     * Gets the actionState property value. The actionState property
     * @return a actionState
     */
    @javax.annotation.Nullable
    public ActionState getActionState() {
        return this.actionState;
    }
    /**
     * Gets the deviceDisplayName property value. Intune device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceDisplayName() {
        return this.deviceDisplayName;
    }
    /**
     * Gets the deviceIMEI property value. IMEI of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceIMEI() {
        return this.deviceIMEI;
    }
    /**
     * Gets the deviceOwnerUserPrincipalName property value. Upn of the device owner.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceOwnerUserPrincipalName() {
        return this.deviceOwnerUserPrincipalName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(RemoteAction.class)); });
        deserializerMap.put("actionState", (n) -> { this.setActionState(n.getEnumValue(ActionState.class)); });
        deserializerMap.put("deviceDisplayName", (n) -> { this.setDeviceDisplayName(n.getStringValue()); });
        deserializerMap.put("deviceIMEI", (n) -> { this.setDeviceIMEI(n.getStringValue()); });
        deserializerMap.put("deviceOwnerUserPrincipalName", (n) -> { this.setDeviceOwnerUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("initiatedByUserPrincipalName", (n) -> { this.setInitiatedByUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("requestDateTime", (n) -> { this.setRequestDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiatedByUserPrincipalName property value. User who initiated the device action, format is UPN.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInitiatedByUserPrincipalName() {
        return this.initiatedByUserPrincipalName;
    }
    /**
     * Gets the managedDeviceId property value. Action target.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }
    /**
     * Gets the requestDateTime property value. Time when the action was issued, given in UTC.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRequestDateTime() {
        return this.requestDateTime;
    }
    /**
     * Gets the userName property value. [deprecated] Please use InitiatedByUserPrincipalName instead.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeEnumValue("actionState", this.getActionState());
        writer.writeStringValue("deviceDisplayName", this.getDeviceDisplayName());
        writer.writeStringValue("deviceIMEI", this.getDeviceIMEI());
        writer.writeStringValue("deviceOwnerUserPrincipalName", this.getDeviceOwnerUserPrincipalName());
        writer.writeStringValue("initiatedByUserPrincipalName", this.getInitiatedByUserPrincipalName());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeOffsetDateTimeValue("requestDateTime", this.getRequestDateTime());
        writer.writeStringValue("userName", this.getUserName());
    }
    /**
     * Sets the action property value. Remote actions Intune supports.
     * @param value Value to set for the action property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAction(@javax.annotation.Nullable final RemoteAction value) {
        this.action = value;
    }
    /**
     * Sets the actionState property value. The actionState property
     * @param value Value to set for the actionState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionState(@javax.annotation.Nullable final ActionState value) {
        this.actionState = value;
    }
    /**
     * Sets the deviceDisplayName property value. Intune device name.
     * @param value Value to set for the deviceDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceDisplayName(@javax.annotation.Nullable final String value) {
        this.deviceDisplayName = value;
    }
    /**
     * Sets the deviceIMEI property value. IMEI of the device.
     * @param value Value to set for the deviceIMEI property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceIMEI(@javax.annotation.Nullable final String value) {
        this.deviceIMEI = value;
    }
    /**
     * Sets the deviceOwnerUserPrincipalName property value. Upn of the device owner.
     * @param value Value to set for the deviceOwnerUserPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceOwnerUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.deviceOwnerUserPrincipalName = value;
    }
    /**
     * Sets the initiatedByUserPrincipalName property value. User who initiated the device action, format is UPN.
     * @param value Value to set for the initiatedByUserPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitiatedByUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.initiatedByUserPrincipalName = value;
    }
    /**
     * Sets the managedDeviceId property value. Action target.
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this.managedDeviceId = value;
    }
    /**
     * Sets the requestDateTime property value. Time when the action was issued, given in UTC.
     * @param value Value to set for the requestDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.requestDateTime = value;
    }
    /**
     * Sets the userName property value. [deprecated] Please use InitiatedByUserPrincipalName instead.
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this.userName = value;
    }
}
