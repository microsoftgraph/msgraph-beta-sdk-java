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
 * This type contains specific information regarding a Powerlift incident, such as when it was uploaded, the platform the device was on, and a string array of files associated to the incident.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PowerliftIncidentDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PowerliftIncidentDetail} and sets the default values.
     */
    public PowerliftIncidentDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PowerliftIncidentDetail}
     */
    @jakarta.annotation.Nonnull
    public static PowerliftIncidentDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PowerliftIncidentDetail();
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
     * Gets the applicationName property value. TThe name of the application for which the diagnostic is collected. Example: com.microsoft.CompanyPortal
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationName() {
        return this.backingStore.get("applicationName");
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
     * Gets the clientApplicationVersion property value. The version of the application for which the diagnostic is collected. Example: 5.2203.1
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientApplicationVersion() {
        return this.backingStore.get("clientApplicationVersion");
    }
    /**
     * Gets the createdDateTime property value. The time the app diagnostic was created. The value cannot be modified and is automatically populated when the diagnostic is uploaded. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.Example: 2022-04-19T17:24:45.313Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the easyId property value. The unique app diagnostic identifier as a user friendly 8 character hexadecimal string. This id is smaller compared to the powerliftId. Th Example: 8520467A
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEasyId() {
        return this.backingStore.get("easyId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("applicationName", (n) -> { this.setApplicationName(n.getStringValue()); });
        deserializerMap.put("clientApplicationVersion", (n) -> { this.setClientApplicationVersion(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("easyId", (n) -> { this.setEasyId(n.getStringValue()); });
        deserializerMap.put("fileNames", (n) -> { this.setFileNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("locale", (n) -> { this.setLocale(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("platformDisplayName", (n) -> { this.setPlatformDisplayName(n.getStringValue()); });
        deserializerMap.put("powerliftId", (n) -> { this.setPowerliftId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileNames property value. A list of files that are associated with the diagnostic.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFileNames() {
        return this.backingStore.get("fileNames");
    }
    /**
     * Gets the locale property value. The locale information of the application for which the diagnostic is collected. Example: en-US
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocale() {
        return this.backingStore.get("locale");
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
     * Gets the platformDisplayName property value. The operating system of the device from which diagnostics are collected. Example: iOS
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlatformDisplayName() {
        return this.backingStore.get("platformDisplayName");
    }
    /**
     * Gets the powerliftId property value. The unique identifier of the app diagnostic. This id is assigned to a diagnostic when it is uploaded to Powerlift. Example: 8520467a-49a9-44a4-8447-8dfb8bec6726
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPowerliftId() {
        return this.backingStore.get("powerliftId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicationName", this.getApplicationName());
        writer.writeStringValue("clientApplicationVersion", this.getClientApplicationVersion());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("easyId", this.getEasyId());
        writer.writeCollectionOfPrimitiveValues("fileNames", this.getFileNames());
        writer.writeStringValue("locale", this.getLocale());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("platformDisplayName", this.getPlatformDisplayName());
        writer.writeStringValue("powerliftId", this.getPowerliftId());
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
     * Sets the applicationName property value. TThe name of the application for which the diagnostic is collected. Example: com.microsoft.CompanyPortal
     * @param value Value to set for the applicationName property.
     */
    public void setApplicationName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationName", value);
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
     * Sets the clientApplicationVersion property value. The version of the application for which the diagnostic is collected. Example: 5.2203.1
     * @param value Value to set for the clientApplicationVersion property.
     */
    public void setClientApplicationVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientApplicationVersion", value);
    }
    /**
     * Sets the createdDateTime property value. The time the app diagnostic was created. The value cannot be modified and is automatically populated when the diagnostic is uploaded. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.Example: 2022-04-19T17:24:45.313Z
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the easyId property value. The unique app diagnostic identifier as a user friendly 8 character hexadecimal string. This id is smaller compared to the powerliftId. Th Example: 8520467A
     * @param value Value to set for the easyId property.
     */
    public void setEasyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("easyId", value);
    }
    /**
     * Sets the fileNames property value. A list of files that are associated with the diagnostic.
     * @param value Value to set for the fileNames property.
     */
    public void setFileNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("fileNames", value);
    }
    /**
     * Sets the locale property value. The locale information of the application for which the diagnostic is collected. Example: en-US
     * @param value Value to set for the locale property.
     */
    public void setLocale(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("locale", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the platformDisplayName property value. The operating system of the device from which diagnostics are collected. Example: iOS
     * @param value Value to set for the platformDisplayName property.
     */
    public void setPlatformDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("platformDisplayName", value);
    }
    /**
     * Sets the powerliftId property value. The unique identifier of the app diagnostic. This id is assigned to a diagnostic when it is uploaded to Powerlift. Example: 8520467a-49a9-44a4-8447-8dfb8bec6726
     * @param value Value to set for the powerliftId property.
     */
    public void setPowerliftId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("powerliftId", value);
    }
}
