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
public class ResourcePolicyDefinition implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ResourcePolicyDefinition} and sets the default values.
     */
    public ResourcePolicyDefinition() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ResourcePolicyDefinition}
     */
    @jakarta.annotation.Nonnull
    public static ResourcePolicyDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourcePolicyDefinition();
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
     * Gets the assignments property value. The assignments property
     * @return a {@link java.util.List<ResourcePolicyAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourcePolicyAssignment> getAssignments() {
        return this.backingStore.get("assignments");
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
     * Gets the category property value. The category property
     * @return a {@link PolicyCategory}
     */
    @jakarta.annotation.Nullable
    public PolicyCategory getCategory() {
        return this.backingStore.get("category");
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
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(ResourcePolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(PolicyCategory::forValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deletedDateTime", (n) -> { this.setDeletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("paramsSchema", (n) -> { this.setParamsSchema(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("previousVersions", (n) -> { this.setPreviousVersions(n.getCollectionOfObjectValues(ResourcePolicyDefinitionVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("rule", (n) -> { this.setRule(n.getObjectValue(ResourcePolicyRule::createFromDiscriminatorValue)); });
        deserializerMap.put("uniqueName", (n) -> { this.setUniqueName(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the paramsSchema property value. The paramsSchema property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getParamsSchema() {
        return this.backingStore.get("paramsSchema");
    }
    /**
     * Gets the previousVersions property value. The previousVersions property
     * @return a {@link java.util.List<ResourcePolicyDefinitionVersion>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourcePolicyDefinitionVersion> getPreviousVersions() {
        return this.backingStore.get("previousVersions");
    }
    /**
     * Gets the rule property value. The rule property
     * @return a {@link ResourcePolicyRule}
     */
    @jakarta.annotation.Nullable
    public ResourcePolicyRule getRule() {
        return this.backingStore.get("rule");
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
     * Gets the version property value. The version property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("previousVersions", this.getPreviousVersions());
        writer.writeObjectValue("rule", this.getRule());
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
     * Sets the assignments property value. The assignments property
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<ResourcePolicyAssignment> value) {
        this.backingStore.set("assignments", value);
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
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final PolicyCategory value) {
        this.backingStore.set("category", value);
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
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
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
     * Sets the paramsSchema property value. The paramsSchema property
     * @param value Value to set for the paramsSchema property.
     */
    public void setParamsSchema(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("paramsSchema", value);
    }
    /**
     * Sets the previousVersions property value. The previousVersions property
     * @param value Value to set for the previousVersions property.
     */
    public void setPreviousVersions(@jakarta.annotation.Nullable final java.util.List<ResourcePolicyDefinitionVersion> value) {
        this.backingStore.set("previousVersions", value);
    }
    /**
     * Sets the rule property value. The rule property
     * @param value Value to set for the rule property.
     */
    public void setRule(@jakarta.annotation.Nullable final ResourcePolicyRule value) {
        this.backingStore.set("rule", value);
    }
    /**
     * Sets the uniqueName property value. The uniqueName property
     * @param value Value to set for the uniqueName property.
     */
    public void setUniqueName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uniqueName", value);
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
