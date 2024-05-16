package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A `managedAppLogUpload` represents the log upload result for a given Mobile Application Management (MAM) Logs Uploading Component. Such components can be the application itself, the MAM SDK, and other on-device components that are capable of uploading diagnostic logs.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedAppLogUpload implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ManagedAppLogUpload} and sets the default values.
     */
    public ManagedAppLogUpload() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagedAppLogUpload}
     */
    @jakarta.annotation.Nonnull
    public static ManagedAppLogUpload createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAppLogUpload();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("managedAppComponent", (n) -> { this.setManagedAppComponent(n.getStringValue()); });
        deserializerMap.put("managedAppComponentDescription", (n) -> { this.setManagedAppComponentDescription(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("referenceId", (n) -> { this.setReferenceId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ManagedAppLogUploadState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the managedAppComponent property value. The Mobile Application Management (MAM) Logs Uploading Component. Such components can be the application itself, the MAM SDK, and other on-device components that are capable of uploading diagnostic logs. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedAppComponent() {
        return this.backingStore.get("managedAppComponent");
    }
    /**
     * Gets the managedAppComponentDescription property value. The Mobile Application Management (MAM) Logs Uploading Component. Such components can be the application itself, the MAM SDK, and other on-device components that are capable of uploading diagnostic logs. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedAppComponentDescription() {
        return this.backingStore.get("managedAppComponentDescription");
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
     * Gets the referenceId property value. A provider-specific reference id for the uploaded logs. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReferenceId() {
        return this.backingStore.get("referenceId");
    }
    /**
     * Gets the status property value. Represents the current status of the associated `managedAppLogCollectionRequest`.
     * @return a {@link ManagedAppLogUploadState}
     */
    @jakarta.annotation.Nullable
    public ManagedAppLogUploadState getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("managedAppComponent", this.getManagedAppComponent());
        writer.writeStringValue("managedAppComponentDescription", this.getManagedAppComponentDescription());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("referenceId", this.getReferenceId());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the managedAppComponent property value. The Mobile Application Management (MAM) Logs Uploading Component. Such components can be the application itself, the MAM SDK, and other on-device components that are capable of uploading diagnostic logs. Read-only.
     * @param value Value to set for the managedAppComponent property.
     */
    public void setManagedAppComponent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedAppComponent", value);
    }
    /**
     * Sets the managedAppComponentDescription property value. The Mobile Application Management (MAM) Logs Uploading Component. Such components can be the application itself, the MAM SDK, and other on-device components that are capable of uploading diagnostic logs. Read-only.
     * @param value Value to set for the managedAppComponentDescription property.
     */
    public void setManagedAppComponentDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedAppComponentDescription", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the referenceId property value. A provider-specific reference id for the uploaded logs. Read-only.
     * @param value Value to set for the referenceId property.
     */
    public void setReferenceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("referenceId", value);
    }
    /**
     * Sets the status property value. Represents the current status of the associated `managedAppLogCollectionRequest`.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ManagedAppLogUploadState value) {
        this.backingStore.set("status", value);
    }
}
