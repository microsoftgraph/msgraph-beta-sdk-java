package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Unmanaged device discovered in the network.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnmanagedDevice implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new UnmanagedDevice and sets the default values.
     */
    public UnmanagedDevice() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnmanagedDevice
     */
    @jakarta.annotation.Nonnull
    public static UnmanagedDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnmanagedDevice();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the deviceName property value. Device name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.BackingStore.get("deviceName");
    }
    /**
     * Gets the domain property value. Domain.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDomain() {
        return this.BackingStore.get("domain");
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.BackingStore.get("ipAddress");
    }
    /**
     * Gets the lastLoggedOnUser property value. Last logged on user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastLoggedOnUser() {
        return this.BackingStore.get("lastLoggedOnUser");
    }
    /**
     * Gets the lastSeenDateTime property value. Last seen date and time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.BackingStore.get("lastSeenDateTime");
    }
    /**
     * Gets the location property value. Location.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocation() {
        return this.BackingStore.get("location");
    }
    /**
     * Gets the macAddress property value. MAC address.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMacAddress() {
        return this.BackingStore.get("macAddress");
    }
    /**
     * Gets the manufacturer property value. Manufacturer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.BackingStore.get("manufacturer");
    }
    /**
     * Gets the model property value. Model.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.BackingStore.get("model");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the os property value. Operating system.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOs() {
        return this.BackingStore.get("os");
    }
    /**
     * Gets the osVersion property value. Operating system version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.BackingStore.get("osVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the deviceName property value. Device name.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("deviceName", value);
    }
    /**
     * Sets the domain property value. Domain.
     * @param value Value to set for the domain property.
     */
    public void setDomain(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("domain", value);
    }
    /**
     * Sets the ipAddress property value. IP address.
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("ipAddress", value);
    }
    /**
     * Sets the lastLoggedOnUser property value. Last logged on user.
     * @param value Value to set for the lastLoggedOnUser property.
     */
    public void setLastLoggedOnUser(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("lastLoggedOnUser", value);
    }
    /**
     * Sets the lastSeenDateTime property value. Last seen date and time.
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastSeenDateTime", value);
    }
    /**
     * Sets the location property value. Location.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("location", value);
    }
    /**
     * Sets the macAddress property value. MAC address.
     * @param value Value to set for the macAddress property.
     */
    public void setMacAddress(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("macAddress", value);
    }
    /**
     * Sets the manufacturer property value. Manufacturer.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("manufacturer", value);
    }
    /**
     * Sets the model property value. Model.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("model", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the os property value. Operating system.
     * @param value Value to set for the os property.
     */
    public void setOs(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("os", value);
    }
    /**
     * Sets the osVersion property value. Operating system version.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("osVersion", value);
    }
}
