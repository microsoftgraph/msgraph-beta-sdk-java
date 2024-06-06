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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PreApprovalDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PreApprovalDetail} and sets the default values.
     */
    public PreApprovalDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PreApprovalDetail}
     */
    @jakarta.annotation.Nonnull
    public static PreApprovalDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PreApprovalDetail();
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
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getObjectValue(PreApprovedPermissions::createFromDiscriminatorValue)); });
        deserializerMap.put("scopeType", (n) -> { this.setScopeType(n.getEnumValue(ResourceScopeType::forValue)); });
        deserializerMap.put("sensitivityLabels", (n) -> { this.setSensitivityLabels(n.getObjectValue(ScopeSensitivityLabels::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the permissions property value. The permissions property
     * @return a {@link PreApprovedPermissions}
     */
    @jakarta.annotation.Nullable
    public PreApprovedPermissions getPermissions() {
        return this.backingStore.get("permissions");
    }
    /**
     * Gets the scopeType property value. The scopeType property
     * @return a {@link ResourceScopeType}
     */
    @jakarta.annotation.Nullable
    public ResourceScopeType getScopeType() {
        return this.backingStore.get("scopeType");
    }
    /**
     * Gets the sensitivityLabels property value. The sensitivityLabels property
     * @return a {@link ScopeSensitivityLabels}
     */
    @jakarta.annotation.Nullable
    public ScopeSensitivityLabels getSensitivityLabels() {
        return this.backingStore.get("sensitivityLabels");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("permissions", this.getPermissions());
        writer.writeEnumValue("scopeType", this.getScopeType());
        writer.writeObjectValue("sensitivityLabels", this.getSensitivityLabels());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the permissions property value. The permissions property
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final PreApprovedPermissions value) {
        this.backingStore.set("permissions", value);
    }
    /**
     * Sets the scopeType property value. The scopeType property
     * @param value Value to set for the scopeType property.
     */
    public void setScopeType(@jakarta.annotation.Nullable final ResourceScopeType value) {
        this.backingStore.set("scopeType", value);
    }
    /**
     * Sets the sensitivityLabels property value. The sensitivityLabels property
     * @param value Value to set for the sensitivityLabels property.
     */
    public void setSensitivityLabels(@jakarta.annotation.Nullable final ScopeSensitivityLabels value) {
        this.backingStore.set("sensitivityLabels", value);
    }
}
