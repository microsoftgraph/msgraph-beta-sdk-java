package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base presentation value entity that stores the value for a single group policy presentation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyPresentationValue extends Entity implements Parsable {
    /**
     * Instantiates a new GroupPolicyPresentationValue and sets the default values.
     */
    public GroupPolicyPresentationValue() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyPresentationValue
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyPresentationValue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.groupPolicyPresentationValueBoolean": return new GroupPolicyPresentationValueBoolean();
                case "#microsoft.graph.groupPolicyPresentationValueDecimal": return new GroupPolicyPresentationValueDecimal();
                case "#microsoft.graph.groupPolicyPresentationValueList": return new GroupPolicyPresentationValueList();
                case "#microsoft.graph.groupPolicyPresentationValueLongDecimal": return new GroupPolicyPresentationValueLongDecimal();
                case "#microsoft.graph.groupPolicyPresentationValueMultiText": return new GroupPolicyPresentationValueMultiText();
                case "#microsoft.graph.groupPolicyPresentationValueText": return new GroupPolicyPresentationValueText();
            }
        }
        return new GroupPolicyPresentationValue();
    }
    /**
     * Gets the createdDateTime property value. The date and time the object was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the definitionValue property value. The group policy definition value associated with the presentation value.
     * @return a GroupPolicyDefinitionValue
     */
    @jakarta.annotation.Nullable
    public GroupPolicyDefinitionValue getDefinitionValue() {
        return this.backingStore.get("definitionValue");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("definitionValue", (n) -> { this.setDefinitionValue(n.getObjectValue(GroupPolicyDefinitionValue::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("presentation", (n) -> { this.setPresentation(n.getObjectValue(GroupPolicyPresentation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the object was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the presentation property value. The group policy presentation associated with the presentation value.
     * @return a GroupPolicyPresentation
     */
    @jakarta.annotation.Nullable
    public GroupPolicyPresentation getPresentation() {
        return this.backingStore.get("presentation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("definitionValue", this.getDefinitionValue());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("presentation", this.getPresentation());
    }
    /**
     * Sets the createdDateTime property value. The date and time the object was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the definitionValue property value. The group policy definition value associated with the presentation value.
     * @param value Value to set for the definitionValue property.
     */
    public void setDefinitionValue(@jakarta.annotation.Nullable final GroupPolicyDefinitionValue value) {
        this.backingStore.set("definitionValue", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the presentation property value. The group policy presentation associated with the presentation value.
     * @param value Value to set for the presentation property.
     */
    public void setPresentation(@jakarta.annotation.Nullable final GroupPolicyPresentation value) {
        this.backingStore.set("presentation", value);
    }
}
