package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base entity for the display presentation of any of the additional options in a group policy definition.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyPresentation extends Entity implements Parsable {
    /**
     * Instantiates a new GroupPolicyPresentation and sets the default values.
     */
    public GroupPolicyPresentation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyPresentation
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyPresentation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.groupPolicyPresentationCheckBox": return new GroupPolicyPresentationCheckBox();
                case "#microsoft.graph.groupPolicyPresentationComboBox": return new GroupPolicyPresentationComboBox();
                case "#microsoft.graph.groupPolicyPresentationDecimalTextBox": return new GroupPolicyPresentationDecimalTextBox();
                case "#microsoft.graph.groupPolicyPresentationDropdownList": return new GroupPolicyPresentationDropdownList();
                case "#microsoft.graph.groupPolicyPresentationListBox": return new GroupPolicyPresentationListBox();
                case "#microsoft.graph.groupPolicyPresentationLongDecimalTextBox": return new GroupPolicyPresentationLongDecimalTextBox();
                case "#microsoft.graph.groupPolicyPresentationMultiTextBox": return new GroupPolicyPresentationMultiTextBox();
                case "#microsoft.graph.groupPolicyPresentationText": return new GroupPolicyPresentationText();
                case "#microsoft.graph.groupPolicyPresentationTextBox": return new GroupPolicyPresentationTextBox();
                case "#microsoft.graph.groupPolicyUploadedPresentation": return new GroupPolicyUploadedPresentation();
            }
        }
        return new GroupPolicyPresentation();
    }
    /**
     * Gets the definition property value. The group policy definition associated with the presentation.
     * @return a GroupPolicyDefinition
     */
    @jakarta.annotation.Nullable
    public GroupPolicyDefinition getDefinition() {
        return this.BackingStore.get("definition");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("definition", (n) -> { this.setDefinition(n.getObjectValue(GroupPolicyDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. Localized text label for any presentation entity. The default value is empty.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.BackingStore.get("label");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("definition", this.getDefinition());
        writer.writeStringValue("label", this.getLabel());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
    }
    /**
     * Sets the definition property value. The group policy definition associated with the presentation.
     * @param value Value to set for the definition property.
     */
    public void setDefinition(@jakarta.annotation.Nullable final GroupPolicyDefinition value) {
        this.BackingStore.set("definition", value);
    }
    /**
     * Sets the label property value. Localized text label for any presentation entity. The default value is empty.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("label", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
}
