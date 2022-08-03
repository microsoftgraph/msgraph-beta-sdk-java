package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The base presentation value entity that stores the value for a single group policy presentation. */
public class GroupPolicyPresentationValue extends Entity implements Parsable {
    /** The date and time the object was created. */
    private OffsetDateTime _createdDateTime;
    /** The group policy definition value associated with the presentation value. */
    private GroupPolicyDefinitionValue _definitionValue;
    /** The date and time the object was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The group policy presentation associated with the presentation value. */
    private GroupPolicyPresentation _presentation;
    /**
     * Instantiates a new groupPolicyPresentationValue and sets the default values.
     * @return a void
     */
    public GroupPolicyPresentationValue() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyPresentationValue");
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
        return this._createdDateTime;
    }
    /**
     * Gets the definitionValue property value. The group policy definition value associated with the presentation value.
     * @return a groupPolicyDefinitionValue
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinitionValue getDefinitionValue() {
        return this._definitionValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupPolicyPresentationValue currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("definitionValue", (n) -> { currentObject.setDefinitionValue(n.getObjectValue(GroupPolicyDefinitionValue::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("presentation", (n) -> { currentObject.setPresentation(n.getObjectValue(GroupPolicyPresentation::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the object was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the presentation property value. The group policy presentation associated with the presentation value.
     * @return a groupPolicyPresentation
     */
    @javax.annotation.Nullable
    public GroupPolicyPresentation getPresentation() {
        return this._presentation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the definitionValue property value. The group policy definition value associated with the presentation value.
     * @param value Value to set for the definitionValue property.
     * @return a void
     */
    public void setDefinitionValue(@javax.annotation.Nullable final GroupPolicyDefinitionValue value) {
        this._definitionValue = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the presentation property value. The group policy presentation associated with the presentation value.
     * @param value Value to set for the presentation property.
     * @return a void
     */
    public void setPresentation(@javax.annotation.Nullable final GroupPolicyPresentation value) {
        this._presentation = value;
    }
}
