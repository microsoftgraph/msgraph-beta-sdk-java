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
public class GroupPolicyPresentationValue extends Entity implements Parsable {
    /** The date and time the object was created. */
    private OffsetDateTime createdDateTime;
    /** The group policy definition value associated with the presentation value. */
    private GroupPolicyDefinitionValue definitionValue;
    /** The date and time the object was last modified. */
    private OffsetDateTime lastModifiedDateTime;
    /** The group policy presentation associated with the presentation value. */
    private GroupPolicyPresentation presentation;
    /**
     * Instantiates a new groupPolicyPresentationValue and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupPolicyPresentationValue() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicyPresentationValue
     */
    @javax.annotation.Nonnull
    public static GroupPolicyPresentationValue createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the definitionValue property value. The group policy definition value associated with the presentation value.
     * @return a groupPolicyDefinitionValue
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinitionValue getDefinitionValue() {
        return this.definitionValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the presentation property value. The group policy presentation associated with the presentation value.
     * @return a groupPolicyPresentation
     */
    @javax.annotation.Nullable
    public GroupPolicyPresentation getPresentation() {
        return this.presentation;
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("definitionValue", this.getDefinitionValue());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("presentation", this.getPresentation());
    }
    /**
     * Sets the createdDateTime property value. The date and time the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the definitionValue property value. The group policy definition value associated with the presentation value.
     * @param value Value to set for the definitionValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefinitionValue(@javax.annotation.Nullable final GroupPolicyDefinitionValue value) {
        this.definitionValue = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the presentation property value. The group policy presentation associated with the presentation value.
     * @param value Value to set for the presentation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPresentation(@javax.annotation.Nullable final GroupPolicyPresentation value) {
        this.presentation = value;
    }
}
