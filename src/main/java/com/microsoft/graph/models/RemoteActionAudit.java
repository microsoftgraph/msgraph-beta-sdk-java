package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Report of remote actions initiated on the devices belonging to a certain tenant.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RemoteActionAudit extends Entity implements Parsable {
    /**
     * Instantiates a new RemoteActionAudit and sets the default values.
     */
    public RemoteActionAudit() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RemoteActionAudit
     */
    @jakarta.annotation.Nonnull
    public static RemoteActionAudit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteActionAudit();
    }
    /**
     * Gets the action property value. Remote actions Intune supports.
     * @return a RemoteAction
     */
    @jakarta.annotation.Nullable
    public RemoteAction getAction() {
        return this.backingStore.get("action");
    }
    /**
     * Gets the actionState property value. The actionState property
     * @return a ActionState
     */
    @jakarta.annotation.Nullable
    public ActionState getActionState() {
        return this.backingStore.get("actionState");
    }
    /**
     * Gets the deviceDisplayName property value. Intune device name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceDisplayName() {
        return this.backingStore.get("deviceDisplayName");
    }
    /**
     * Gets the deviceIMEI property value. IMEI of the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceIMEI() {
        return this.backingStore.get("deviceIMEI");
    }
    /**
     * Gets the deviceOwnerUserPrincipalName property value. Upn of the device owner.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceOwnerUserPrincipalName() {
        return this.backingStore.get("deviceOwnerUserPrincipalName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(RemoteAction::forValue)); });
        deserializerMap.put("actionState", (n) -> { this.setActionState(n.getEnumValue(ActionState::forValue)); });
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInitiatedByUserPrincipalName() {
        return this.backingStore.get("initiatedByUserPrincipalName");
    }
    /**
     * Gets the managedDeviceId property value. Action target.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.backingStore.get("managedDeviceId");
    }
    /**
     * Gets the requestDateTime property value. Time when the action was issued, given in UTC.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestDateTime() {
        return this.backingStore.get("requestDateTime");
    }
    /**
     * Gets the userName property value. [deprecated] Please use InitiatedByUserPrincipalName instead.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.backingStore.get("userName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAction(@jakarta.annotation.Nullable final RemoteAction value) {
        this.backingStore.set("action", value);
    }
    /**
     * Sets the actionState property value. The actionState property
     * @param value Value to set for the actionState property.
     */
    public void setActionState(@jakarta.annotation.Nullable final ActionState value) {
        this.backingStore.set("actionState", value);
    }
    /**
     * Sets the deviceDisplayName property value. Intune device name.
     * @param value Value to set for the deviceDisplayName property.
     */
    public void setDeviceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceDisplayName", value);
    }
    /**
     * Sets the deviceIMEI property value. IMEI of the device.
     * @param value Value to set for the deviceIMEI property.
     */
    public void setDeviceIMEI(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceIMEI", value);
    }
    /**
     * Sets the deviceOwnerUserPrincipalName property value. Upn of the device owner.
     * @param value Value to set for the deviceOwnerUserPrincipalName property.
     */
    public void setDeviceOwnerUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceOwnerUserPrincipalName", value);
    }
    /**
     * Sets the initiatedByUserPrincipalName property value. User who initiated the device action, format is UPN.
     * @param value Value to set for the initiatedByUserPrincipalName property.
     */
    public void setInitiatedByUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("initiatedByUserPrincipalName", value);
    }
    /**
     * Sets the managedDeviceId property value. Action target.
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceId", value);
    }
    /**
     * Sets the requestDateTime property value. Time when the action was issued, given in UTC.
     * @param value Value to set for the requestDateTime property.
     */
    public void setRequestDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("requestDateTime", value);
    }
    /**
     * Sets the userName property value. [deprecated] Please use InitiatedByUserPrincipalName instead.
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userName", value);
    }
}
