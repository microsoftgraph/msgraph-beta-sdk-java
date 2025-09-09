package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HardwareOathTokenAuthenticationMethodDevice extends AuthenticationMethodDevice implements Parsable {
    /**
     * Instantiates a new {@link HardwareOathTokenAuthenticationMethodDevice} and sets the default values.
     */
    public HardwareOathTokenAuthenticationMethodDevice() {
        super();
        this.setOdataType("#microsoft.graph.hardwareOathTokenAuthenticationMethodDevice");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HardwareOathTokenAuthenticationMethodDevice}
     */
    @jakarta.annotation.Nonnull
    public static HardwareOathTokenAuthenticationMethodDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HardwareOathTokenAuthenticationMethodDevice();
    }
    /**
     * Gets the assignedTo property value. User the token is assigned to. Nullable. Supports $filter (eq).
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getAssignedTo() {
        return this.backingStore.get("assignedTo");
    }
    /**
     * Gets the assignTo property value. Assign the hardware OATH token to a user.
     * @return a {@link User}
     */
    @jakarta.annotation.Nullable
    public User getAssignTo() {
        return this.backingStore.get("assignTo");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("assignTo", (n) -> { this.setAssignTo(n.getObjectValue(User::createFromDiscriminatorValue)); });
        deserializerMap.put("hashFunction", (n) -> { this.setHashFunction(n.getEnumValue(HardwareOathTokenHashFunction::forValue)); });
        deserializerMap.put("lastUsedDateTime", (n) -> { this.setLastUsedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("secretKey", (n) -> { this.setSecretKey(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(HardwareOathTokenStatus::forValue)); });
        deserializerMap.put("timeIntervalInSeconds", (n) -> { this.setTimeIntervalInSeconds(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hashFunction property value. Hash function of the hardrware token. The possible values are: hmacsha1 or hmacsha256. Default value is: hmacsha1. Supports $filter (eq).
     * @return a {@link HardwareOathTokenHashFunction}
     */
    @jakarta.annotation.Nullable
    public HardwareOathTokenHashFunction getHashFunction() {
        return this.backingStore.get("hashFunction");
    }
    /**
     * Gets the lastUsedDateTime property value. The lastUsedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUsedDateTime() {
        return this.backingStore.get("lastUsedDateTime");
    }
    /**
     * Gets the manufacturer property value. Manufacturer name of the hardware token. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the model property value. Model name of the hardware token. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the secretKey property value. Secret key of the specific hardware token, provided by the vendor.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecretKey() {
        return this.backingStore.get("secretKey");
    }
    /**
     * Gets the serialNumber property value. Serial number of the specific hardware token, often found on the back of the device. Supports $select and $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.backingStore.get("serialNumber");
    }
    /**
     * Gets the status property value. Status of the hardware OATH token.The possible values are: available, assigned, activated, failedActivation. Supports $filter(eq).
     * @return a {@link HardwareOathTokenStatus}
     */
    @jakarta.annotation.Nullable
    public HardwareOathTokenStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the timeIntervalInSeconds property value. Refresh interval of the 6-digit verification code, in seconds. The possible values are: 30 or 60. Supports $filter (eq).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTimeIntervalInSeconds() {
        return this.backingStore.get("timeIntervalInSeconds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("assignedTo", this.getAssignedTo());
        writer.writeObjectValue("assignTo", this.getAssignTo());
        writer.writeEnumValue("hashFunction", this.getHashFunction());
        writer.writeOffsetDateTimeValue("lastUsedDateTime", this.getLastUsedDateTime());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("secretKey", this.getSecretKey());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeIntegerValue("timeIntervalInSeconds", this.getTimeIntervalInSeconds());
    }
    /**
     * Sets the assignedTo property value. User the token is assigned to. Nullable. Supports $filter (eq).
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("assignedTo", value);
    }
    /**
     * Sets the assignTo property value. Assign the hardware OATH token to a user.
     * @param value Value to set for the assignTo property.
     */
    public void setAssignTo(@jakarta.annotation.Nullable final User value) {
        this.backingStore.set("assignTo", value);
    }
    /**
     * Sets the hashFunction property value. Hash function of the hardrware token. The possible values are: hmacsha1 or hmacsha256. Default value is: hmacsha1. Supports $filter (eq).
     * @param value Value to set for the hashFunction property.
     */
    public void setHashFunction(@jakarta.annotation.Nullable final HardwareOathTokenHashFunction value) {
        this.backingStore.set("hashFunction", value);
    }
    /**
     * Sets the lastUsedDateTime property value. The lastUsedDateTime property
     * @param value Value to set for the lastUsedDateTime property.
     */
    public void setLastUsedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUsedDateTime", value);
    }
    /**
     * Sets the manufacturer property value. Manufacturer name of the hardware token. Supports $filter (eq).
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the model property value. Model name of the hardware token. Supports $filter (eq).
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the secretKey property value. Secret key of the specific hardware token, provided by the vendor.
     * @param value Value to set for the secretKey property.
     */
    public void setSecretKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("secretKey", value);
    }
    /**
     * Sets the serialNumber property value. Serial number of the specific hardware token, often found on the back of the device. Supports $select and $filter (eq).
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serialNumber", value);
    }
    /**
     * Sets the status property value. Status of the hardware OATH token.The possible values are: available, assigned, activated, failedActivation. Supports $filter(eq).
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final HardwareOathTokenStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the timeIntervalInSeconds property value. Refresh interval of the 6-digit verification code, in seconds. The possible values are: 30 or 60. Supports $filter (eq).
     * @param value Value to set for the timeIntervalInSeconds property.
     */
    public void setTimeIntervalInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("timeIntervalInSeconds", value);
    }
}
