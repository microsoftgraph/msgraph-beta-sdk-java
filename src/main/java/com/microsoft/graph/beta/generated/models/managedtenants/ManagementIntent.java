package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagementIntent extends Entity implements Parsable {
    /**
     * Instantiates a new ManagementIntent and sets the default values.
     */
    public ManagementIntent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagementIntent
     */
    @jakarta.annotation.Nonnull
    public static ManagementIntent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementIntent();
    }
    /**
     * Gets the displayName property value. The display name for the management intent. Optional. Read-only.
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
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isGlobal", (n) -> { this.setIsGlobal(n.getBooleanValue()); });
        deserializerMap.put("managementTemplates", (n) -> { this.setManagementTemplates(n.getCollectionOfObjectValues(ManagementTemplateDetailedInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isGlobal property value. A flag indicating whether the management intent is global. Required. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsGlobal() {
        return this.backingStore.get("isGlobal");
    }
    /**
     * Gets the managementTemplates property value. The collection of management templates associated with the management intent. Optional. Read-only.
     * @return a java.util.List<ManagementTemplateDetailedInfo>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateDetailedInfo> getManagementTemplates() {
        return this.backingStore.get("managementTemplates");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isGlobal", this.getIsGlobal());
        writer.writeCollectionOfObjectValues("managementTemplates", this.getManagementTemplates());
    }
    /**
     * Sets the displayName property value. The display name for the management intent. Optional. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isGlobal property value. A flag indicating whether the management intent is global. Required. Read-only.
     * @param value Value to set for the isGlobal property.
     */
    public void setIsGlobal(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isGlobal", value);
    }
    /**
     * Sets the managementTemplates property value. The collection of management templates associated with the management intent. Optional. Read-only.
     * @param value Value to set for the managementTemplates property.
     */
    public void setManagementTemplates(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateDetailedInfo> value) {
        this.backingStore.set("managementTemplates", value);
    }
}
