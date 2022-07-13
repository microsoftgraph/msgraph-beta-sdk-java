package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContentLabel implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The assignmentMethod property */
    private AssignmentMethod _assignmentMethod;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The sensitivityLabelId property */
    private String _sensitivityLabelId;
    /**
     * Instantiates a new contentLabel and sets the default values.
     * @return a void
     */
    public ContentLabel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a contentLabel
     */
    @javax.annotation.Nonnull
    public static ContentLabel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentLabel();
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
     * Gets the assignmentMethod property value. The assignmentMethod property
     * @return a assignmentMethod
     */
    @javax.annotation.Nullable
    public AssignmentMethod getAssignmentMethod() {
        return this._assignmentMethod;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ContentLabel currentObject = this;
        return new HashMap<>(3) {{
            this.put("assignmentMethod", (n) -> { currentObject.setAssignmentMethod(n.getEnumValue(AssignmentMethod.class)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("sensitivityLabelId", (n) -> { currentObject.setSensitivityLabelId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the sensitivityLabelId property value. The sensitivityLabelId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSensitivityLabelId() {
        return this._sensitivityLabelId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("assignmentMethod", this.getAssignmentMethod());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("sensitivityLabelId", this.getSensitivityLabelId());
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
     * Sets the assignmentMethod property value. The assignmentMethod property
     * @param value Value to set for the assignmentMethod property.
     * @return a void
     */
    public void setAssignmentMethod(@javax.annotation.Nullable final AssignmentMethod value) {
        this._assignmentMethod = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the sensitivityLabelId property value. The sensitivityLabelId property
     * @param value Value to set for the sensitivityLabelId property.
     * @return a void
     */
    public void setSensitivityLabelId(@javax.annotation.Nullable final String value) {
        this._sensitivityLabelId = value;
    }
}
