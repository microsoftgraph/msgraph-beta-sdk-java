package com.microsoft.graph.beta.solutions.migrations.crosstenantmigrationjobs.validate;

import com.microsoft.graph.beta.models.ExchangeOnlineCrossTenantMigrationSettings;
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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ValidatePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ValidatePostRequestBody} and sets the default values.
     */
    public ValidatePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ValidatePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ValidatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ValidatePostRequestBody();
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
     * Gets the completeAfterDateTime property value. The completeAfterDateTime property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompleteAfterDateTime() {
        return this.backingStore.get("completeAfterDateTime");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the exchangeSettings property value. The exchangeSettings property
     * @return a {@link ExchangeOnlineCrossTenantMigrationSettings}
     */
    @jakarta.annotation.Nullable
    public ExchangeOnlineCrossTenantMigrationSettings getExchangeSettings() {
        return this.backingStore.get("exchangeSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("completeAfterDateTime", (n) -> { this.setCompleteAfterDateTime(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("exchangeSettings", (n) -> { this.setExchangeSettings(n.getObjectValue(ExchangeOnlineCrossTenantMigrationSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("resourceType", (n) -> { this.setResourceType(n.getStringValue()); });
        deserializerMap.put("sourceTenantId", (n) -> { this.setSourceTenantId(n.getStringValue()); });
        deserializerMap.put("workloads", (n) -> { this.setWorkloads(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the resources property value. The resources property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResources() {
        return this.backingStore.get("resources");
    }
    /**
     * Gets the resourceType property value. The resourceType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceType() {
        return this.backingStore.get("resourceType");
    }
    /**
     * Gets the sourceTenantId property value. The sourceTenantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceTenantId() {
        return this.backingStore.get("sourceTenantId");
    }
    /**
     * Gets the workloads property value. The workloads property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getWorkloads() {
        return this.backingStore.get("workloads");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("completeAfterDateTime", this.getCompleteAfterDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("exchangeSettings", this.getExchangeSettings());
        writer.writeCollectionOfPrimitiveValues("resources", this.getResources());
        writer.writeStringValue("resourceType", this.getResourceType());
        writer.writeStringValue("sourceTenantId", this.getSourceTenantId());
        writer.writeCollectionOfPrimitiveValues("workloads", this.getWorkloads());
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
     * Sets the completeAfterDateTime property value. The completeAfterDateTime property
     * @param value Value to set for the completeAfterDateTime property.
     */
    public void setCompleteAfterDateTime(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("completeAfterDateTime", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the exchangeSettings property value. The exchangeSettings property
     * @param value Value to set for the exchangeSettings property.
     */
    public void setExchangeSettings(@jakarta.annotation.Nullable final ExchangeOnlineCrossTenantMigrationSettings value) {
        this.backingStore.set("exchangeSettings", value);
    }
    /**
     * Sets the resources property value. The resources property
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("resources", value);
    }
    /**
     * Sets the resourceType property value. The resourceType property
     * @param value Value to set for the resourceType property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceType", value);
    }
    /**
     * Sets the sourceTenantId property value. The sourceTenantId property
     * @param value Value to set for the sourceTenantId property.
     */
    public void setSourceTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceTenantId", value);
    }
    /**
     * Sets the workloads property value. The workloads property
     * @param value Value to set for the workloads property.
     */
    public void setWorkloads(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("workloads", value);
    }
}
