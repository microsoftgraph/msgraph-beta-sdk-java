package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupPolicyDefinitionValue extends Entity implements Parsable {
    /** Group Policy Configuration Type */
    private GroupPolicyConfigurationType _configurationType;
    /** The date and time the object was created. */
    private OffsetDateTime _createdDateTime;
    /** The associated group policy definition with the value. */
    private GroupPolicyDefinition _definition;
    /** Enables or disables the associated group policy definition. */
    private Boolean _enabled;
    /** The date and time the entity was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The associated group policy presentation values with the definition value. */
    private java.util.List<GroupPolicyPresentationValue> _presentationValues;
    /**
     * Instantiates a new groupPolicyDefinitionValue and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinitionValue() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyDefinitionValue");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicyDefinitionValue
     */
    @javax.annotation.Nonnull
    public static GroupPolicyDefinitionValue createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyDefinitionValue();
    }
    /**
     * Gets the configurationType property value. Group Policy Configuration Type
     * @return a groupPolicyConfigurationType
     */
    @javax.annotation.Nullable
    public GroupPolicyConfigurationType getConfigurationType() {
        return this._configurationType;
    }
    /**
     * Gets the createdDateTime property value. The date and time the object was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the definition property value. The associated group policy definition with the value.
     * @return a groupPolicyDefinition
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinition getDefinition() {
        return this._definition;
    }
    /**
     * Gets the enabled property value. Enables or disables the associated group policy definition.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this._enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupPolicyDefinitionValue currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("configurationType", (n) -> { currentObject.setConfigurationType(n.getEnumValue(GroupPolicyConfigurationType.class)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("definition", (n) -> { currentObject.setDefinition(n.getObjectValue(GroupPolicyDefinition::createFromDiscriminatorValue)); });
            this.put("enabled", (n) -> { currentObject.setEnabled(n.getBooleanValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("presentationValues", (n) -> { currentObject.setPresentationValues(n.getCollectionOfObjectValues(GroupPolicyPresentationValue::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the presentationValues property value. The associated group policy presentation values with the definition value.
     * @return a groupPolicyPresentationValue
     */
    @javax.annotation.Nullable
    public java.util.List<GroupPolicyPresentationValue> getPresentationValues() {
        return this._presentationValues;
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
    @javax.annotation.Nonnull
    public void setConfigurationType(@javax.annotation.Nullable final GroupPolicyConfigurationType value) {
        this._configurationType = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the definition property value. The associated group policy definition with the value.
     * @param value Value to set for the definition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefinition(@javax.annotation.Nullable final GroupPolicyDefinition value) {
        this._definition = value;
    }
    /**
     * Sets the enabled property value. Enables or disables the associated group policy definition.
     * @param value Value to set for the enabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this._enabled = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the presentationValues property value. The associated group policy presentation values with the definition value.
     * @param value Value to set for the presentationValues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPresentationValues(@javax.annotation.Nullable final java.util.List<GroupPolicyPresentationValue> value) {
        this._presentationValues = value;
    }
}
