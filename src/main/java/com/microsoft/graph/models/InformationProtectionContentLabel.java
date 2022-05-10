package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InformationProtectionContentLabel implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Possible values are: standard, privileged, auto. */
    private AssignmentMethod _assignmentMethod;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _creationDateTime;
    /** Details on the label that is currently applied to the file. */
    private LabelDetails _label;
    /**
     * Instantiates a new informationProtectionContentLabel and sets the default values.
     * @return a void
     */
    public InformationProtectionContentLabel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a informationProtectionContentLabel
     */
    @javax.annotation.Nonnull
    public static InformationProtectionContentLabel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationProtectionContentLabel();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the assignmentMethod property value. Possible values are: standard, privileged, auto.
     * @return a assignmentMethod
     */
    @javax.annotation.Nullable
    public AssignmentMethod getAssignmentMethod() {
        return this._assignmentMethod;
    }
    /**
     * Gets the creationDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this._creationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InformationProtectionContentLabel currentObject = this;
        return new HashMap<>(3) {{
            this.put("assignmentMethod", (n) -> { currentObject.setAssignmentMethod(n.getEnumValue(AssignmentMethod.class)); });
            this.put("creationDateTime", (n) -> { currentObject.setCreationDateTime(n.getOffsetDateTimeValue()); });
            this.put("label", (n) -> { currentObject.setLabel(n.getObjectValue(LabelDetails::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the label property value. Details on the label that is currently applied to the file.
     * @return a labelDetails
     */
    @javax.annotation.Nullable
    public LabelDetails getLabel() {
        return this._label;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("assignmentMethod", this.getAssignmentMethod());
        writer.writeOffsetDateTimeValue("creationDateTime", this.getCreationDateTime());
        writer.writeObjectValue("label", this.getLabel());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the assignmentMethod property value. Possible values are: standard, privileged, auto.
     * @param value Value to set for the assignmentMethod property.
     * @return a void
     */
    public void setAssignmentMethod(@javax.annotation.Nullable final AssignmentMethod value) {
        this._assignmentMethod = value;
    }
    /**
     * Sets the creationDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the creationDateTime property.
     * @return a void
     */
    public void setCreationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._creationDateTime = value;
    }
    /**
     * Sets the label property value. Details on the label that is currently applied to the file.
     * @param value Value to set for the label property.
     * @return a void
     */
    public void setLabel(@javax.annotation.Nullable final LabelDetails value) {
        this._label = value;
    }
}
