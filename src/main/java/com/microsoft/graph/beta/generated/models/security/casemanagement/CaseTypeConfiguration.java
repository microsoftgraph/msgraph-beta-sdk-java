package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CaseTypeConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CaseTypeConfiguration} and sets the default values.
     */
    public CaseTypeConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CaseTypeConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static CaseTypeConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CaseTypeConfiguration();
    }
    /**
     * Gets the customFields property value. The contained custom-field definitions that make up the blank-form schema for this case type. Read-only. Supports $count, $expand, $filter, $orderby, $select, $skip, and $top.
     * @return a {@link java.util.List<CustomFieldDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomFieldDefinition> getCustomFields() {
        return this.backingStore.get("customFields");
    }
    /**
     * Gets the defaultStatusId property value. The id of the top-level status that a new case of this type starts in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultStatusId() {
        return this.backingStore.get("defaultStatusId");
    }
    /**
     * Gets the displayName property value. The human-readable label of the case type.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customFields", (n) -> { this.setCustomFields(n.getCollectionOfObjectValues(CustomFieldDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultStatusId", (n) -> { this.setDefaultStatusId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("statuses", (n) -> { this.setStatuses(n.getCollectionOfObjectValues(StatusDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the statuses property value. The contained top-level statuses that a case of this type can be set to. Read-only. Supports $count, $expand, $filter, $orderby, $select, $skip, and $top.
     * @return a {@link java.util.List<StatusDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<StatusDefinition> getStatuses() {
        return this.backingStore.get("statuses");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("customFields", this.getCustomFields());
        writer.writeStringValue("defaultStatusId", this.getDefaultStatusId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("statuses", this.getStatuses());
    }
    /**
     * Sets the customFields property value. The contained custom-field definitions that make up the blank-form schema for this case type. Read-only. Supports $count, $expand, $filter, $orderby, $select, $skip, and $top.
     * @param value Value to set for the customFields property.
     */
    public void setCustomFields(@jakarta.annotation.Nullable final java.util.List<CustomFieldDefinition> value) {
        this.backingStore.set("customFields", value);
    }
    /**
     * Sets the defaultStatusId property value. The id of the top-level status that a new case of this type starts in.
     * @param value Value to set for the defaultStatusId property.
     */
    public void setDefaultStatusId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultStatusId", value);
    }
    /**
     * Sets the displayName property value. The human-readable label of the case type.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the statuses property value. The contained top-level statuses that a case of this type can be set to. Read-only. Supports $count, $expand, $filter, $orderby, $select, $skip, and $top.
     * @param value Value to set for the statuses property.
     */
    public void setStatuses(@jakarta.annotation.Nullable final java.util.List<StatusDefinition> value) {
        this.backingStore.set("statuses", value);
    }
}
