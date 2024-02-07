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
import java.util.UUID;
/**
 * Collection of app diagnostics associated with a user.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PowerliftIncidentMetadata implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new PowerliftIncidentMetadata and sets the default values.
     */
    public PowerliftIncidentMetadata() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PowerliftIncidentMetadata
     */
    @jakarta.annotation.Nonnull
    public static PowerliftIncidentMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PowerliftIncidentMetadata();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the application property value. The name of the application the diagnostic is from. Example: com.microsoft.CompanyPortal
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getApplication() {
        return this.backingStore.get("application");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the clientVersion property value. The version of the application. Example: 5.2203.1
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClientVersion() {
        return this.backingStore.get("clientVersion");
    }
    /**
     * Gets the createdAtDateTime property value. The time the app diagnostic was created. Example: 2022-04-19T17:24:45.313Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAtDateTime() {
        return this.backingStore.get("createdAtDateTime");
    }
    /**
     * Gets the easyId property value. The unique app diagnostic identifier as a user friendly 8 character hexadecimal string. Example: 8520467A
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEasyId() {
        return this.backingStore.get("easyId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("application", (n) -> { this.setApplication(n.getStringValue()); });
        deserializerMap.put("clientVersion", (n) -> { this.setClientVersion(n.getStringValue()); });
        deserializerMap.put("createdAtDateTime", (n) -> { this.setCreatedAtDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("easyId", (n) -> { this.setEasyId(n.getStringValue()); });
        deserializerMap.put("fileNames", (n) -> { this.setFileNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("locale", (n) -> { this.setLocale(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getStringValue()); });
        deserializerMap.put("powerliftId", (n) -> { this.setPowerliftId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileNames property value. A list of files that are associated with the diagnostic.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFileNames() {
        return this.backingStore.get("fileNames");
    }
    /**
     * Gets the locale property value. The locale information of the application. Example: en-US
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocale() {
        return this.backingStore.get("locale");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the platform property value. The device's OS the diagnostic is from. Example: iOS
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPlatform() {
        return this.backingStore.get("platform");
    }
    /**
     * Gets the powerliftId property value. The unique identifier of the app diagnostic. Example: 8520467a-49a9-44a4-8447-8dfb8bec6726
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getPowerliftId() {
        return this.backingStore.get("powerliftId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("application", this.getApplication());
        writer.writeStringValue("clientVersion", this.getClientVersion());
        writer.writeOffsetDateTimeValue("createdAtDateTime", this.getCreatedAtDateTime());
        writer.writeStringValue("easyId", this.getEasyId());
        writer.writeCollectionOfPrimitiveValues("fileNames", this.getFileNames());
        writer.writeStringValue("locale", this.getLocale());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("platform", this.getPlatform());
        writer.writeUUIDValue("powerliftId", this.getPowerliftId());
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
     * Sets the application property value. The name of the application the diagnostic is from. Example: com.microsoft.CompanyPortal
     * @param value Value to set for the application property.
     */
    public void setApplication(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("application", value);
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
     * Sets the clientVersion property value. The version of the application. Example: 5.2203.1
     * @param value Value to set for the clientVersion property.
     */
    public void setClientVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientVersion", value);
    }
    /**
     * Sets the createdAtDateTime property value. The time the app diagnostic was created. Example: 2022-04-19T17:24:45.313Z
     * @param value Value to set for the createdAtDateTime property.
     */
    public void setCreatedAtDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdAtDateTime", value);
    }
    /**
     * Sets the easyId property value. The unique app diagnostic identifier as a user friendly 8 character hexadecimal string. Example: 8520467A
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
     * Sets the locale property value. The locale information of the application. Example: en-US
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
     * Sets the platform property value. The device's OS the diagnostic is from. Example: iOS
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("platform", value);
    }
    /**
     * Sets the powerliftId property value. The unique identifier of the app diagnostic. Example: 8520467a-49a9-44a4-8447-8dfb8bec6726
     * @param value Value to set for the powerliftId property.
     */
    public void setPowerliftId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("powerliftId", value);
    }
}
