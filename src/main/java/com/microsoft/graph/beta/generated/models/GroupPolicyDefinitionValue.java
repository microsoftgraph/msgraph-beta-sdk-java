package com.microsoft.graph.beta.models;

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyDefinitionValue extends Entity implements Parsable {
    /**
     * Instantiates a new {@link GroupPolicyDefinitionValue} and sets the default values.
     */
    public GroupPolicyDefinitionValue() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GroupPolicyDefinitionValue}
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyDefinitionValue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyDefinitionValue();
    }
    /**
     * Gets the configurationType property value. Group Policy Configuration Type
     * @return a {@link GroupPolicyConfigurationType}
     */
    @jakarta.annotation.Nullable
    public GroupPolicyConfigurationType getConfigurationType() {
        return this.backingStore.get("configurationType");
    }
    /**
     * Gets the createdDateTime property value. The date and time the object was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the definition property value. The associated group policy definition with the value.
     * @return a {@link GroupPolicyDefinition}
     */
    @jakarta.annotation.Nullable
    public GroupPolicyDefinition getDefinition() {
        return this.backingStore.get("definition");
    }
    /**
     * Gets the enabled property value. Enables or disables the associated group policy definition.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.backingStore.get("enabled");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configurationType", (n) -> { this.setConfigurationType(n.getEnumValue(GroupPolicyConfigurationType::forValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("definition", (n) -> { this.setDefinition(n.getObjectValue(GroupPolicyDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("presentationValues", (n) -> { this.setPresentationValues(n.getCollectionOfObjectValues(GroupPolicyPresentationValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the presentationValues property value. The associated group policy presentation values with the definition value.
     * @return a {@link java.util.List<GroupPolicyPresentationValue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyPresentationValue> getPresentationValues() {
        return this.backingStore.get("presentationValues");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setConfigurationType(@jakarta.annotation.Nullable final GroupPolicyConfigurationType value) {
        this.backingStore.set("configurationType", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time the object was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the definition property value. The associated group policy definition with the value.
     * @param value Value to set for the definition property.
     */
    public void setDefinition(@jakarta.annotation.Nullable final GroupPolicyDefinition value) {
        this.backingStore.set("definition", value);
    }
    /**
     * Sets the enabled property value. Enables or disables the associated group policy definition.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enabled", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the presentationValues property value. The associated group policy presentation values with the definition value.
     * @param value Value to set for the presentationValues property.
     */
    public void setPresentationValues(@jakarta.annotation.Nullable final java.util.List<GroupPolicyPresentationValue> value) {
        this.backingStore.set("presentationValues", value);
    }
}
