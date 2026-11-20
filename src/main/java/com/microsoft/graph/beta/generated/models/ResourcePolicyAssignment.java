package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResourcePolicyAssignment implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ResourcePolicyAssignment} and sets the default values.
     */
    public ResourcePolicyAssignment() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ResourcePolicyAssignment}
     */
    @jakarta.annotation.Nonnull
    public static ResourcePolicyAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourcePolicyAssignment();
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
     * Gets the assignedPolicy property value. The assignedPolicy property
     * @return a {@link AssignedPolicyReference}
     */
    @jakarta.annotation.Nullable
    public AssignedPolicyReference getAssignedPolicy() {
        return this.backingStore.get("assignedPolicy");
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
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deletedDateTime property value. The deletedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this.backingStore.get("deletedDateTime");
    }
    /**
     * Gets the enforcementMode property value. The enforcementMode property
     * @return a {@link EnforcementMode}
     */
    @jakarta.annotation.Nullable
    public EnforcementMode getEnforcementMode() {
        return this.backingStore.get("enforcementMode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("assignedPolicy", (n) -> { this.setAssignedPolicy(n.getObjectValue(AssignedPolicyReference::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deletedDateTime", (n) -> { this.setDeletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("enforcementMode", (n) -> { this.setEnforcementMode(n.getEnumValue(EnforcementMode::forValue)); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("params", (n) -> { this.setParams(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getStringValue()); });
        deserializerMap.put("uniqueName", (n) -> { this.setUniqueName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. The isEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
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
     * Gets the params property value. The params property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getParams() {
        return this.backingStore.get("params");
    }
    /**
     * Gets the scope property value. The scope property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScope() {
        return this.backingStore.get("scope");
    }
    /**
     * Gets the uniqueName property value. The uniqueName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUniqueName() {
        return this.backingStore.get("uniqueName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("assignedPolicy", this.getAssignedPolicy());
        writer.writeEnumValue("enforcementMode", this.getEnforcementMode());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("params", this.getParams());
        writer.writeStringValue("scope", this.getScope());
        writer.writeStringValue("uniqueName", this.getUniqueName());
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
     * Sets the assignedPolicy property value. The assignedPolicy property
     * @param value Value to set for the assignedPolicy property.
     */
    public void setAssignedPolicy(@jakarta.annotation.Nullable final AssignedPolicyReference value) {
        this.backingStore.set("assignedPolicy", value);
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
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deletedDateTime property value. The deletedDateTime property
     * @param value Value to set for the deletedDateTime property.
     */
    public void setDeletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("deletedDateTime", value);
    }
    /**
     * Sets the enforcementMode property value. The enforcementMode property
     * @param value Value to set for the enforcementMode property.
     */
    public void setEnforcementMode(@jakarta.annotation.Nullable final EnforcementMode value) {
        this.backingStore.set("enforcementMode", value);
    }
    /**
     * Sets the isEnabled property value. The isEnabled property
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the params property value. The params property
     * @param value Value to set for the params property.
     */
    public void setParams(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("params", value);
    }
    /**
     * Sets the scope property value. The scope property
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scope", value);
    }
    /**
     * Sets the uniqueName property value. The uniqueName property
     * @param value Value to set for the uniqueName property.
     */
    public void setUniqueName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uniqueName", value);
    }
}
