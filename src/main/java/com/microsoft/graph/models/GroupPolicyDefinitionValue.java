package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The definition value entity stores the value for a single group policy definition.
 */
public class GroupPolicyDefinitionValue extends Entity implements Parsable {
    /**
     * Group Policy Configuration Type
     */
    private GroupPolicyConfigurationType configurationType;
    /**
     * The date and time the object was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The associated group policy definition with the value.
     */
    private GroupPolicyDefinition definition;
    /**
     * Enables or disables the associated group policy definition.
     */
    private Boolean enabled;
    /**
     * The date and time the entity was last modified.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The associated group policy presentation values with the definition value.
     */
    private java.util.List<GroupPolicyPresentationValue> presentationValues;
    /**
     * Instantiates a new groupPolicyDefinitionValue and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public GroupPolicyDefinitionValue() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicyDefinitionValue
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyDefinitionValue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyDefinitionValue();
    }
    /**
     * Gets the configurationType property value. Group Policy Configuration Type
     * @return a groupPolicyConfigurationType
     */
    @jakarta.annotation.Nullable
    public GroupPolicyConfigurationType getConfigurationType() {
        return this.configurationType;
    }
    /**
     * Gets the createdDateTime property value. The date and time the object was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the definition property value. The associated group policy definition with the value.
     * @return a groupPolicyDefinition
     */
    @jakarta.annotation.Nullable
    public GroupPolicyDefinition getDefinition() {
        return this.definition;
    }
    /**
     * Gets the enabled property value. Enables or disables the associated group policy definition.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configurationType", (n) -> { this.setConfigurationType(n.getEnumValue(GroupPolicyConfigurationType.class)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("definition", (n) -> { this.setDefinition(n.getObjectValue(GroupPolicyDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("presentationValues", (n) -> { this.setPresentationValues(n.getCollectionOfObjectValues(GroupPolicyPresentationValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the presentationValues property value. The associated group policy presentation values with the definition value.
     * @return a groupPolicyPresentationValue
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyPresentationValue> getPresentationValues() {
        return this.presentationValues;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("configurationType", this.getConfigurationType());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("definition", this.getDefinition());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("presentationValues", this.getPresentationValues());
    }
    /**
     * Sets the configurationType property value. Group Policy Configuration Type
     * @param value Value to set for the configurationType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConfigurationType(@jakarta.annotation.Nullable final GroupPolicyConfigurationType value) {
        this.configurationType = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the definition property value. The associated group policy definition with the value.
     * @param value Value to set for the definition property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDefinition(@jakarta.annotation.Nullable final GroupPolicyDefinition value) {
        this.definition = value;
    }
    /**
     * Sets the enabled property value. Enables or disables the associated group policy definition.
     * @param value Value to set for the enabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the presentationValues property value. The associated group policy presentation values with the definition value.
     * @param value Value to set for the presentationValues property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPresentationValues(@jakarta.annotation.Nullable final java.util.List<GroupPolicyPresentationValue> value) {
        this.presentationValues = value;
    }
}
