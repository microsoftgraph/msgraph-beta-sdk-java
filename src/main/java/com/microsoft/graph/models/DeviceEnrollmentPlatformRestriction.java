package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Platform specific enrollment restrictions
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceEnrollmentPlatformRestriction implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Collection of blocked Manufacturers.
     */
    private java.util.List<String> blockedManufacturers;
    /**
     * Collection of blocked Skus.
     */
    private java.util.List<String> blockedSkus;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Max OS version supported
     */
    private String osMaximumVersion;
    /**
     * Min OS version supported
     */
    private String osMinimumVersion;
    /**
     * Block personally owned devices from enrolling
     */
    private Boolean personalDeviceEnrollmentBlocked;
    /**
     * Block the platform from enrolling
     */
    private Boolean platformBlocked;
    /**
     * Instantiates a new DeviceEnrollmentPlatformRestriction and sets the default values.
     */
    public DeviceEnrollmentPlatformRestriction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceEnrollmentPlatformRestriction
     */
    @jakarta.annotation.Nonnull
    public static DeviceEnrollmentPlatformRestriction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEnrollmentPlatformRestriction();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the blockedManufacturers property value. Collection of blocked Manufacturers.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBlockedManufacturers() {
        return this.blockedManufacturers;
    }
    /**
     * Gets the blockedSkus property value. Collection of blocked Skus.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBlockedSkus() {
        return this.blockedSkus;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("blockedManufacturers", (n) -> { this.setBlockedManufacturers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("blockedSkus", (n) -> { this.setBlockedSkus(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("osMaximumVersion", (n) -> { this.setOsMaximumVersion(n.getStringValue()); });
        deserializerMap.put("osMinimumVersion", (n) -> { this.setOsMinimumVersion(n.getStringValue()); });
        deserializerMap.put("personalDeviceEnrollmentBlocked", (n) -> { this.setPersonalDeviceEnrollmentBlocked(n.getBooleanValue()); });
        deserializerMap.put("platformBlocked", (n) -> { this.setPlatformBlocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the osMaximumVersion property value. Max OS version supported
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsMaximumVersion() {
        return this.osMaximumVersion;
    }
    /**
     * Gets the osMinimumVersion property value. Min OS version supported
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsMinimumVersion() {
        return this.osMinimumVersion;
    }
    /**
     * Gets the personalDeviceEnrollmentBlocked property value. Block personally owned devices from enrolling
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPersonalDeviceEnrollmentBlocked() {
        return this.personalDeviceEnrollmentBlocked;
    }
    /**
     * Gets the platformBlocked property value. Block the platform from enrolling
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPlatformBlocked() {
        return this.platformBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("blockedManufacturers", this.getBlockedManufacturers());
        writer.writeCollectionOfPrimitiveValues("blockedSkus", this.getBlockedSkus());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("osMaximumVersion", this.getOsMaximumVersion());
        writer.writeStringValue("osMinimumVersion", this.getOsMinimumVersion());
        writer.writeBooleanValue("personalDeviceEnrollmentBlocked", this.getPersonalDeviceEnrollmentBlocked());
        writer.writeBooleanValue("platformBlocked", this.getPlatformBlocked());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the blockedManufacturers property value. Collection of blocked Manufacturers.
     * @param value Value to set for the blockedManufacturers property.
     */
    public void setBlockedManufacturers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.blockedManufacturers = value;
    }
    /**
     * Sets the blockedSkus property value. Collection of blocked Skus.
     * @param value Value to set for the blockedSkus property.
     */
    public void setBlockedSkus(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.blockedSkus = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the osMaximumVersion property value. Max OS version supported
     * @param value Value to set for the osMaximumVersion property.
     */
    public void setOsMaximumVersion(@jakarta.annotation.Nullable final String value) {
        this.osMaximumVersion = value;
    }
    /**
     * Sets the osMinimumVersion property value. Min OS version supported
     * @param value Value to set for the osMinimumVersion property.
     */
    public void setOsMinimumVersion(@jakarta.annotation.Nullable final String value) {
        this.osMinimumVersion = value;
    }
    /**
     * Sets the personalDeviceEnrollmentBlocked property value. Block personally owned devices from enrolling
     * @param value Value to set for the personalDeviceEnrollmentBlocked property.
     */
    public void setPersonalDeviceEnrollmentBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.personalDeviceEnrollmentBlocked = value;
    }
    /**
     * Sets the platformBlocked property value. Block the platform from enrolling
     * @param value Value to set for the platformBlocked property.
     */
    public void setPlatformBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.platformBlocked = value;
    }
}
