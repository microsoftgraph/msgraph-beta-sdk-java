package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagementIntent extends Entity implements Parsable {
    /** The display name for the management intent. Optional. Read-only. */
    private String displayName;
    /** A flag indicating whether the management intent is global. Required. Read-only. */
    private Boolean isGlobal;
    /** The collection of management templates associated with the management intent. Optional. Read-only. */
    private java.util.List<ManagementTemplateDetailedInfo> managementTemplates;
    /**
     * Instantiates a new managementIntent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagementIntent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementIntent
     */
    @javax.annotation.Nonnull
    public static ManagementIntent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementIntent();
    }
    /**
     * Gets the displayName property value. The display name for the management intent. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isGlobal", (n) -> { this.setIsGlobal(n.getBooleanValue()); });
        deserializerMap.put("managementTemplates", (n) -> { this.setManagementTemplates(n.getCollectionOfObjectValues(ManagementTemplateDetailedInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isGlobal property value. A flag indicating whether the management intent is global. Required. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsGlobal() {
        return this.isGlobal;
    }
    /**
     * Gets the managementTemplates property value. The collection of management templates associated with the management intent. Optional. Read-only.
     * @return a managementTemplateDetailedInfo
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementTemplateDetailedInfo> getManagementTemplates() {
        return this.managementTemplates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isGlobal", this.getIsGlobal());
        writer.writeCollectionOfObjectValues("managementTemplates", this.getManagementTemplates());
    }
    /**
     * Sets the displayName property value. The display name for the management intent. Optional. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isGlobal property value. A flag indicating whether the management intent is global. Required. Read-only.
     * @param value Value to set for the isGlobal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsGlobal(@javax.annotation.Nullable final Boolean value) {
        this.isGlobal = value;
    }
    /**
     * Sets the managementTemplates property value. The collection of management templates associated with the management intent. Optional. Read-only.
     * @param value Value to set for the managementTemplates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementTemplates(@javax.annotation.Nullable final java.util.List<ManagementTemplateDetailedInfo> value) {
        this.managementTemplates = value;
    }
}
