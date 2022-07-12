package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SensitivityLabelAssignment implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The assignmentMethod property */
    private SensitivityLabelAssignmentMethod _assignmentMethod;
    /** The unique identifier for the sensitivity label assigned to the file. */
    private String _sensitivityLabelId;
    /** The unique identifier for the tenant that hosts the file when this label is applied. */
    private String _tenantId;
    /**
     * Instantiates a new sensitivityLabelAssignment and sets the default values.
     * @return a void
     */
    public SensitivityLabelAssignment() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sensitivityLabelAssignment
     */
    @javax.annotation.Nonnull
    public static SensitivityLabelAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitivityLabelAssignment();
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
     * @return a sensitivityLabelAssignmentMethod
     */
    @javax.annotation.Nullable
    public SensitivityLabelAssignmentMethod getAssignmentMethod() {
        return this._assignmentMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SensitivityLabelAssignment currentObject = this;
        return new HashMap<>(3) {{
            this.put("assignmentMethod", (n) -> { currentObject.setAssignmentMethod(n.getEnumValue(SensitivityLabelAssignmentMethod.class)); });
            this.put("sensitivityLabelId", (n) -> { currentObject.setSensitivityLabelId(n.getStringValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the sensitivityLabelId property value. The unique identifier for the sensitivity label assigned to the file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSensitivityLabelId() {
        return this._sensitivityLabelId;
    }
    /**
     * Gets the tenantId property value. The unique identifier for the tenant that hosts the file when this label is applied.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("assignmentMethod", this.getAssignmentMethod());
        writer.writeStringValue("sensitivityLabelId", this.getSensitivityLabelId());
        writer.writeStringValue("tenantId", this.getTenantId());
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
    public void setAssignmentMethod(@javax.annotation.Nullable final SensitivityLabelAssignmentMethod value) {
        this._assignmentMethod = value;
    }
    /**
     * Sets the sensitivityLabelId property value. The unique identifier for the sensitivity label assigned to the file.
     * @param value Value to set for the sensitivityLabelId property.
     * @return a void
     */
    public void setSensitivityLabelId(@javax.annotation.Nullable final String value) {
        this._sensitivityLabelId = value;
    }
    /**
     * Sets the tenantId property value. The unique identifier for the tenant that hosts the file when this label is applied.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
