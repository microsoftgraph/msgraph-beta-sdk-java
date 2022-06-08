package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The base entity for the display presentation of any of the additional options in a group policy definition. */
public class GroupPolicyPresentation extends Entity implements Parsable {
    /** The group policy definition associated with the presentation. */
    private GroupPolicyDefinition _definition;
    /** Localized text label for any presentation entity. The default value is empty. */
    private String _label;
    /** The date and time the entity was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /**
     * Instantiates a new groupPolicyPresentation and sets the default values.
     * @return a void
     */
    public GroupPolicyPresentation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicyPresentation
     */
    @javax.annotation.Nonnull
    public static GroupPolicyPresentation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.groupPolicyPresentation": return new GroupPolicyPresentation();
            }
        }
        return new GroupPolicyPresentation();
    }
    /**
     * Gets the definition property value. The group policy definition associated with the presentation.
     * @return a groupPolicyDefinition
     */
    @javax.annotation.Nullable
    public GroupPolicyDefinition getDefinition() {
        return this._definition;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupPolicyPresentation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("definition", (n) -> { currentObject.setDefinition(n.getObjectValue(GroupPolicyDefinition::createFromDiscriminatorValue)); });
            this.put("label", (n) -> { currentObject.setLabel(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the label property value. Localized text label for any presentation entity. The default value is empty.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLabel() {
        return this._label;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("definition", this.getDefinition());
        writer.writeStringValue("label", this.getLabel());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
    }
    /**
     * Sets the definition property value. The group policy definition associated with the presentation.
     * @param value Value to set for the definition property.
     * @return a void
     */
    public void setDefinition(@javax.annotation.Nullable final GroupPolicyDefinition value) {
        this._definition = value;
    }
    /**
     * Sets the label property value. Localized text label for any presentation entity. The default value is empty.
     * @param value Value to set for the label property.
     * @return a void
     */
    public void setLabel(@javax.annotation.Nullable final String value) {
        this._label = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
}
