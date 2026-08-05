package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomFieldDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CustomFieldDefinition} and sets the default values.
     */
    public CustomFieldDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomFieldDefinition}
     */
    @jakarta.annotation.Nonnull
    public static CustomFieldDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.caseManagement.dateTimeCustomFieldDefinition": return new DateTimeCustomFieldDefinition();
                case "#microsoft.graph.security.caseManagement.numberCustomFieldDefinition": return new NumberCustomFieldDefinition();
                case "#microsoft.graph.security.caseManagement.optionsCustomFieldDefinition": return new OptionsCustomFieldDefinition();
                case "#microsoft.graph.security.caseManagement.stringCustomFieldDefinition": return new StringCustomFieldDefinition();
            }
        }
        return new CustomFieldDefinition();
    }
    /**
     * Gets the description property value. The field description. Supports $filter and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The field label shown on the case form. Supports $filter and $orderby.
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
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isDisabled", (n) -> { this.setIsDisabled(n.getBooleanValue()); });
        deserializerMap.put("isRequired", (n) -> { this.setIsRequired(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDisabled property value. true if the field is disabled; otherwise, false. Supports $filter and $orderby.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDisabled() {
        return this.backingStore.get("isDisabled");
    }
    /**
     * Gets the isRequired property value. true if a value is required for this field; otherwise, false. Supports $filter and $orderby.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRequired() {
        return this.backingStore.get("isRequired");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isDisabled", this.getIsDisabled());
        writer.writeBooleanValue("isRequired", this.getIsRequired());
    }
    /**
     * Sets the description property value. The field description. Supports $filter and $orderby.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The field label shown on the case form. Supports $filter and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isDisabled property value. true if the field is disabled; otherwise, false. Supports $filter and $orderby.
     * @param value Value to set for the isDisabled property.
     */
    public void setIsDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDisabled", value);
    }
    /**
     * Sets the isRequired property value. true if a value is required for this field; otherwise, false. Supports $filter and $orderby.
     * @param value Value to set for the isRequired property.
     */
    public void setIsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRequired", value);
    }
}
