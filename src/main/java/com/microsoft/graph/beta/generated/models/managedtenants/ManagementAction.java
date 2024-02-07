package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagementAction extends Entity implements Parsable {
    /**
     * Instantiates a new ManagementAction and sets the default values.
     */
    public ManagementAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagementAction
     */
    @jakarta.annotation.Nonnull
    public static ManagementAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementAction();
    }
    /**
     * Gets the category property value. The category property
     * @return a ManagementCategory
     */
    @jakarta.annotation.Nullable
    public ManagementCategory getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the description property value. The description for the management action. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name for the management action. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(ManagementCategory::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("referenceTemplateId", (n) -> { this.setReferenceTemplateId(n.getStringValue()); });
        deserializerMap.put("referenceTemplateVersion", (n) -> { this.setReferenceTemplateVersion(n.getIntegerValue()); });
        deserializerMap.put("workloadActions", (n) -> { this.setWorkloadActions(n.getCollectionOfObjectValues(WorkloadAction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the referenceTemplateId property value. The reference for the management template used to generate the management action. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReferenceTemplateId() {
        return this.backingStore.get("referenceTemplateId");
    }
    /**
     * Gets the referenceTemplateVersion property value. The referenceTemplateVersion property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getReferenceTemplateVersion() {
        return this.backingStore.get("referenceTemplateVersion");
    }
    /**
     * Gets the workloadActions property value. The collection of workload actions associated with the management action. Required. Read-only.
     * @return a java.util.List<WorkloadAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkloadAction> getWorkloadActions() {
        return this.backingStore.get("workloadActions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("referenceTemplateId", this.getReferenceTemplateId());
        writer.writeIntegerValue("referenceTemplateVersion", this.getReferenceTemplateVersion());
        writer.writeCollectionOfObjectValues("workloadActions", this.getWorkloadActions());
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final ManagementCategory value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the description property value. The description for the management action. Optional. Read-only.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name for the management action. Optional. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the referenceTemplateId property value. The reference for the management template used to generate the management action. Required. Read-only.
     * @param value Value to set for the referenceTemplateId property.
     */
    public void setReferenceTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("referenceTemplateId", value);
    }
    /**
     * Sets the referenceTemplateVersion property value. The referenceTemplateVersion property
     * @param value Value to set for the referenceTemplateVersion property.
     */
    public void setReferenceTemplateVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("referenceTemplateVersion", value);
    }
    /**
     * Sets the workloadActions property value. The collection of workload actions associated with the management action. Required. Read-only.
     * @param value Value to set for the workloadActions property.
     */
    public void setWorkloadActions(@jakarta.annotation.Nullable final java.util.List<WorkloadAction> value) {
        this.backingStore.set("workloadActions", value);
    }
}
