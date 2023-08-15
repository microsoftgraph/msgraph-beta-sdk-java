package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Unmanaged device discovered in the network.
 */
public class UnmanagedDevice implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Device name.
     */
    private String deviceName;
    /**
     * Domain.
     */
    private String domain;
    /**
     * IP address.
     */
    private String ipAddress;
    /**
     * Last logged on user.
     */
    private String lastLoggedOnUser;
    /**
     * Last seen date and time.
     */
    private OffsetDateTime lastSeenDateTime;
    /**
     * Location.
     */
    private String location;
    /**
     * MAC address.
     */
    private String macAddress;
    /**
     * Manufacturer.
     */
    private String manufacturer;
    /**
     * Model.
     */
    private String model;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Operating system.
     */
    private String os;
    /**
     * Operating system version.
     */
    private String osVersion;
    /**
     * Instantiates a new unmanagedDevice and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UnmanagedDevice() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unmanagedDevice
     */
    @jakarta.annotation.Nonnull
    public static UnmanagedDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnmanagedDevice();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the deviceName property value. Device name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the domain property value. Domain.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDomain() {
        return this.domain;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("domain", (n) -> { this.setDomain(n.getStringValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("lastLoggedOnUser", (n) -> { this.setLastLoggedOnUser(n.getStringValue()); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getStringValue()); });
        deserializerMap.put("macAddress", (n) -> { this.setMacAddress(n.getStringValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("os", (n) -> { this.setOs(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. IP address.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Gets the lastLoggedOnUser property value. Last logged on user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLastLoggedOnUser() {
        return this.lastLoggedOnUser;
    }
    /**
     * Gets the lastSeenDateTime property value. Last seen date and time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.lastSeenDateTime;
    }
    /**
     * Gets the location property value. Location.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLocation() {
        return this.location;
    }
    /**
     * Gets the macAddress property value. MAC address.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMacAddress() {
        return this.macAddress;
    }
    /**
     * Gets the manufacturer property value. Manufacturer.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the model property value. Model.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the os property value. Operating system.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOs() {
        return this.os;
    }
    /**
     * Gets the osVersion property value. Operating system version.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("domain", this.getDomain());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("lastLoggedOnUser", this.getLastLoggedOnUser());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeStringValue("location", this.getLocation());
        writer.writeStringValue("macAddress", this.getMacAddress());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("os", this.getOs());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceName property value. Device name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the domain property value. Domain.
     * @param value Value to set for the domain property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDomain(@jakarta.annotation.Nullable final String value) {
        this.domain = value;
    }
    /**
     * Sets the ipAddress property value. IP address.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the lastLoggedOnUser property value. Last logged on user.
     * @param value Value to set for the lastLoggedOnUser property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastLoggedOnUser(@jakarta.annotation.Nullable final String value) {
        this.lastLoggedOnUser = value;
    }
    /**
     * Sets the lastSeenDateTime property value. Last seen date and time.
     * @param value Value to set for the lastSeenDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSeenDateTime = value;
    }
    /**
     * Sets the location property value. Location.
     * @param value Value to set for the location property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLocation(@jakarta.annotation.Nullable final String value) {
        this.location = value;
    }
    /**
     * Sets the macAddress property value. MAC address.
     * @param value Value to set for the macAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMacAddress(@jakarta.annotation.Nullable final String value) {
        this.macAddress = value;
    }
    /**
     * Sets the manufacturer property value. Manufacturer.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the model property value. Model.
     * @param value Value to set for the model property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the os property value. Operating system.
     * @param value Value to set for the os property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOs(@jakarta.annotation.Nullable final String value) {
        this.os = value;
    }
    /**
     * Sets the osVersion property value. Operating system version.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.osVersion = value;
    }
}
