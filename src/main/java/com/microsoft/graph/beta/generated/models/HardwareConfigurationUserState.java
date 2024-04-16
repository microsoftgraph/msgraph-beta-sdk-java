package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for User state of the hardware configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HardwareConfigurationUserState extends Entity implements Parsable {
    /**
     * Instantiates a new {@link HardwareConfigurationUserState} and sets the default values.
     */
    public HardwareConfigurationUserState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HardwareConfigurationUserState}
     */
    @jakarta.annotation.Nonnull
    public static HardwareConfigurationUserState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HardwareConfigurationUserState();
    }
    /**
     * Gets the errorDeviceCount property value. Error device count for specific user.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this.backingStore.get("errorDeviceCount");
    }
    /**
     * Gets the failedDeviceCount property value. Failed device count for specific user.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this.backingStore.get("failedDeviceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errorDeviceCount", (n) -> { this.setErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("failedDeviceCount", (n) -> { this.setFailedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("lastStateUpdateDateTime", (n) -> { this.setLastStateUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notApplicableDeviceCount", (n) -> { this.setNotApplicableDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("pendingDeviceCount", (n) -> { this.setPendingDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("successfulDeviceCount", (n) -> { this.setSuccessfulDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("unknownDeviceCount", (n) -> { this.setUnknownDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("upn", (n) -> { this.setUpn(n.getStringValue()); });
        deserializerMap.put("userEmail", (n) -> { this.setUserEmail(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastStateUpdateDateTime property value. Last timestamp when the hardware configuration executed
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastStateUpdateDateTime() {
        return this.backingStore.get("lastStateUpdateDateTime");
    }
    /**
     * Gets the notApplicableDeviceCount property value. Not applicable device count for specific user.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableDeviceCount() {
        return this.backingStore.get("notApplicableDeviceCount");
    }
    /**
     * Gets the pendingDeviceCount property value. Pending device count for specific user.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPendingDeviceCount() {
        return this.backingStore.get("pendingDeviceCount");
    }
    /**
     * Gets the successfulDeviceCount property value. Success device count for specific user.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulDeviceCount() {
        return this.backingStore.get("successfulDeviceCount");
    }
    /**
     * Gets the unknownDeviceCount property value. Unknown device count for specific user.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this.backingStore.get("unknownDeviceCount");
    }
    /**
     * Gets the upn property value. User Principal Name (UPN).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUpn() {
        return this.backingStore.get("upn");
    }
    /**
     * Gets the userEmail property value. User Email address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserEmail() {
        return this.backingStore.get("userEmail");
    }
    /**
     * Gets the userName property value. User name
     * @return a {@link String}
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
        writer.writeIntegerValue("errorDeviceCount", this.getErrorDeviceCount());
        writer.writeIntegerValue("failedDeviceCount", this.getFailedDeviceCount());
        writer.writeOffsetDateTimeValue("lastStateUpdateDateTime", this.getLastStateUpdateDateTime());
        writer.writeIntegerValue("notApplicableDeviceCount", this.getNotApplicableDeviceCount());
        writer.writeIntegerValue("pendingDeviceCount", this.getPendingDeviceCount());
        writer.writeIntegerValue("successfulDeviceCount", this.getSuccessfulDeviceCount());
        writer.writeIntegerValue("unknownDeviceCount", this.getUnknownDeviceCount());
        writer.writeStringValue("upn", this.getUpn());
        writer.writeStringValue("userEmail", this.getUserEmail());
        writer.writeStringValue("userName", this.getUserName());
    }
    /**
     * Sets the errorDeviceCount property value. Error device count for specific user.
     * @param value Value to set for the errorDeviceCount property.
     */
    public void setErrorDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errorDeviceCount", value);
    }
    /**
     * Sets the failedDeviceCount property value. Failed device count for specific user.
     * @param value Value to set for the failedDeviceCount property.
     */
    public void setFailedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedDeviceCount", value);
    }
    /**
     * Sets the lastStateUpdateDateTime property value. Last timestamp when the hardware configuration executed
     * @param value Value to set for the lastStateUpdateDateTime property.
     */
    public void setLastStateUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastStateUpdateDateTime", value);
    }
    /**
     * Sets the notApplicableDeviceCount property value. Not applicable device count for specific user.
     * @param value Value to set for the notApplicableDeviceCount property.
     */
    public void setNotApplicableDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notApplicableDeviceCount", value);
    }
    /**
     * Sets the pendingDeviceCount property value. Pending device count for specific user.
     * @param value Value to set for the pendingDeviceCount property.
     */
    public void setPendingDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingDeviceCount", value);
    }
    /**
     * Sets the successfulDeviceCount property value. Success device count for specific user.
     * @param value Value to set for the successfulDeviceCount property.
     */
    public void setSuccessfulDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successfulDeviceCount", value);
    }
    /**
     * Sets the unknownDeviceCount property value. Unknown device count for specific user.
     * @param value Value to set for the unknownDeviceCount property.
     */
    public void setUnknownDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("unknownDeviceCount", value);
    }
    /**
     * Sets the upn property value. User Principal Name (UPN).
     * @param value Value to set for the upn property.
     */
    public void setUpn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("upn", value);
    }
    /**
     * Sets the userEmail property value. User Email address.
     * @param value Value to set for the userEmail property.
     */
    public void setUserEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userEmail", value);
    }
    /**
     * Sets the userName property value. User name
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userName", value);
    }
}
