package com.microsoft.graph.beta.models.healthmonitoring;

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
public class ResourceImpactSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ResourceImpactSummary} and sets the default values.
     */
    public ResourceImpactSummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ResourceImpactSummary}
     */
    @jakarta.annotation.Nonnull
    public static ResourceImpactSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.healthMonitoring.applicationImpactSummary": return new ApplicationImpactSummary();
                case "#microsoft.graph.healthMonitoring.deviceImpactSummary": return new DeviceImpactSummary();
                case "#microsoft.graph.healthMonitoring.directoryObjectImpactSummary": return new DirectoryObjectImpactSummary();
                case "#microsoft.graph.healthMonitoring.groupImpactSummary": return new GroupImpactSummary();
                case "#microsoft.graph.healthMonitoring.servicePrincipalImpactSummary": return new ServicePrincipalImpactSummary();
                case "#microsoft.graph.healthMonitoring.userImpactSummary": return new UserImpactSummary();
            }
        }
        return new ResourceImpactSummary();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("impactedCount", (n) -> { this.setImpactedCount(n.getStringValue()); });
        deserializerMap.put("impactedCountLimitExceeded", (n) -> { this.setImpactedCountLimitExceeded(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resourceType", (n) -> { this.setResourceType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the impactedCount property value. The impactedCount property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImpactedCount() {
        return this.backingStore.get("impactedCount");
    }
    /**
     * Gets the impactedCountLimitExceeded property value. The impactedCountLimitExceeded property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getImpactedCountLimitExceeded() {
        return this.backingStore.get("impactedCountLimitExceeded");
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
     * Gets the resourceType property value. The resourceType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceType() {
        return this.backingStore.get("resourceType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("impactedCount", this.getImpactedCount());
        writer.writeBooleanValue("impactedCountLimitExceeded", this.getImpactedCountLimitExceeded());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("resourceType", this.getResourceType());
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
     * Sets the impactedCount property value. The impactedCount property
     * @param value Value to set for the impactedCount property.
     */
    public void setImpactedCount(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("impactedCount", value);
    }
    /**
     * Sets the impactedCountLimitExceeded property value. The impactedCountLimitExceeded property
     * @param value Value to set for the impactedCountLimitExceeded property.
     */
    public void setImpactedCountLimitExceeded(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("impactedCountLimitExceeded", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the resourceType property value. The resourceType property
     * @param value Value to set for the resourceType property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceType", value);
    }
}
