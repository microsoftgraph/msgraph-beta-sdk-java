package com.microsoft.graph.beta.models;

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
 * The firmware version from Samsung for a specific device model, sales code, and CSC (Consumer Software Customization). Used to create Samsung E-FOTA deployments.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SamsungEFotaFirmwareVersion implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SamsungEFotaFirmwareVersion} and sets the default values.
     */
    public SamsungEFotaFirmwareVersion() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SamsungEFotaFirmwareVersion}
     */
    @jakarta.annotation.Nonnull
    public static SamsungEFotaFirmwareVersion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SamsungEFotaFirmwareVersion();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the androidProcessorVersionName property value. The Android Processor version name. This property is populated by Samsung. Eg. &apos;G960U1UES9FVD1&apos;. Default value: null. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAndroidProcessorVersionName() {
        return this.backingStore.get("androidProcessorVersionName");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the consumerSoftwareCustomizationCode property value. The Consumer Software Customization which is a specific code associated with the region or carrier customization of a Samsung device. This property is populated by Samsung. Eg. &apos;OYM&apos;. Read-only. Returned by default.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConsumerSoftwareCustomizationCode() {
        return this.backingStore.get("consumerSoftwareCustomizationCode");
    }
    /**
     * Gets the description property value. The firmware description. This property is populated by Samsung. Default value: null. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the deviceModelName property value. Samsung device model. This property is populated by Samsung. Eg. &apos;SM-960F&apos;. Read-only. Returned by default.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceModelName() {
        return this.backingStore.get("deviceModelName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("androidProcessorVersionName", (n) -> { this.setAndroidProcessorVersionName(n.getStringValue()); });
        deserializerMap.put("consumerSoftwareCustomizationCode", (n) -> { this.setConsumerSoftwareCustomizationCode(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceModelName", (n) -> { this.setDeviceModelName(n.getStringValue()); });
        deserializerMap.put("firmwareVersion", (n) -> { this.setFirmwareVersion(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("osVersionName", (n) -> { this.setOsVersionName(n.getStringValue()); });
        deserializerMap.put("releaseDateTime", (n) -> { this.setReleaseDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("requestFirmwareTypeName", (n) -> { this.setRequestFirmwareTypeName(n.getStringValue()); });
        deserializerMap.put("salesCode", (n) -> { this.setSalesCode(n.getStringValue()); });
        deserializerMap.put("securityPatchVersion", (n) -> { this.setSecurityPatchVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firmwareVersion property value. The firmware version. This property is populated by Samsung Eg. &apos;T575XXU4EAAA/T575OXM4EAAA/T575XXU4EAAA&apos;. Default value: null. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFirmwareVersion() {
        return this.backingStore.get("firmwareVersion");
    }
    /**
     * Gets the id property value. Firmware ID from Samsung. This property is populated by Samsung. Eg. &apos;FW2022033111797487&apos;. Read-only. Returned by default.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the osVersionName property value. The OS version name. This property is populated by Samsung. Eg. &apos;Pie(Android 9)&apos;. Default value: null. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsVersionName() {
        return this.backingStore.get("osVersionName");
    }
    /**
     * Gets the releaseDateTime property value. Firmware release date. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. This property is populated by Samsung. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Default value: null. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReleaseDateTime() {
        return this.backingStore.get("releaseDateTime");
    }
    /**
     * Gets the requestFirmwareTypeName property value. The firmware request type. This property is populated by Samsung Eg. &apos;NORMAL&apos;. Default value: null. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRequestFirmwareTypeName() {
        return this.backingStore.get("requestFirmwareTypeName");
    }
    /**
     * Gets the salesCode property value. Sales code of a Samsung device that corresponds to its georgraphic area or carrier network. This property is populated by Samsung. Eg. &apos;TMB&apos;. Read-only. Returned by default.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSalesCode() {
        return this.backingStore.get("salesCode");
    }
    /**
     * Gets the securityPatchVersion property value. The firmware security patch. This property is populated by Samsung Eg. &apos;2023-09-07 07:50:57&apos;. Default value: null. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecurityPatchVersion() {
        return this.backingStore.get("securityPatchVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("androidProcessorVersionName", this.getAndroidProcessorVersionName());
        writer.writeStringValue("consumerSoftwareCustomizationCode", this.getConsumerSoftwareCustomizationCode());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("deviceModelName", this.getDeviceModelName());
        writer.writeStringValue("firmwareVersion", this.getFirmwareVersion());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("osVersionName", this.getOsVersionName());
        writer.writeOffsetDateTimeValue("releaseDateTime", this.getReleaseDateTime());
        writer.writeStringValue("requestFirmwareTypeName", this.getRequestFirmwareTypeName());
        writer.writeStringValue("salesCode", this.getSalesCode());
        writer.writeStringValue("securityPatchVersion", this.getSecurityPatchVersion());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the androidProcessorVersionName property value. The Android Processor version name. This property is populated by Samsung. Eg. &apos;G960U1UES9FVD1&apos;. Default value: null. Read-only.
     * @param value Value to set for the androidProcessorVersionName property.
     */
    public void setAndroidProcessorVersionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("androidProcessorVersionName", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the consumerSoftwareCustomizationCode property value. The Consumer Software Customization which is a specific code associated with the region or carrier customization of a Samsung device. This property is populated by Samsung. Eg. &apos;OYM&apos;. Read-only. Returned by default.
     * @param value Value to set for the consumerSoftwareCustomizationCode property.
     */
    public void setConsumerSoftwareCustomizationCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("consumerSoftwareCustomizationCode", value);
    }
    /**
     * Sets the description property value. The firmware description. This property is populated by Samsung. Default value: null. Read-only.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the deviceModelName property value. Samsung device model. This property is populated by Samsung. Eg. &apos;SM-960F&apos;. Read-only. Returned by default.
     * @param value Value to set for the deviceModelName property.
     */
    public void setDeviceModelName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceModelName", value);
    }
    /**
     * Sets the firmwareVersion property value. The firmware version. This property is populated by Samsung Eg. &apos;T575XXU4EAAA/T575OXM4EAAA/T575XXU4EAAA&apos;. Default value: null. Read-only.
     * @param value Value to set for the firmwareVersion property.
     */
    public void setFirmwareVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("firmwareVersion", value);
    }
    /**
     * Sets the id property value. Firmware ID from Samsung. This property is populated by Samsung. Eg. &apos;FW2022033111797487&apos;. Read-only. Returned by default.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the osVersionName property value. The OS version name. This property is populated by Samsung. Eg. &apos;Pie(Android 9)&apos;. Default value: null. Read-only.
     * @param value Value to set for the osVersionName property.
     */
    public void setOsVersionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersionName", value);
    }
    /**
     * Sets the releaseDateTime property value. Firmware release date. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. This property is populated by Samsung. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Default value: null. Read-only.
     * @param value Value to set for the releaseDateTime property.
     */
    public void setReleaseDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("releaseDateTime", value);
    }
    /**
     * Sets the requestFirmwareTypeName property value. The firmware request type. This property is populated by Samsung Eg. &apos;NORMAL&apos;. Default value: null. Read-only.
     * @param value Value to set for the requestFirmwareTypeName property.
     */
    public void setRequestFirmwareTypeName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestFirmwareTypeName", value);
    }
    /**
     * Sets the salesCode property value. Sales code of a Samsung device that corresponds to its georgraphic area or carrier network. This property is populated by Samsung. Eg. &apos;TMB&apos;. Read-only. Returned by default.
     * @param value Value to set for the salesCode property.
     */
    public void setSalesCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("salesCode", value);
    }
    /**
     * Sets the securityPatchVersion property value. The firmware security patch. This property is populated by Samsung Eg. &apos;2023-09-07 07:50:57&apos;. Default value: null. Read-only.
     * @param value Value to set for the securityPatchVersion property.
     */
    public void setSecurityPatchVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("securityPatchVersion", value);
    }
}
