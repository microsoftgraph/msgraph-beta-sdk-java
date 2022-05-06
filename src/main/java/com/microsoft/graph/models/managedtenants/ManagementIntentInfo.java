package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagementIntentInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The display name for the management intent. Optional. Read-only.  */
    private String _managementIntentDisplayName;
    /** The identifier for the management intent. Required. Read-only.  */
    private String _managementIntentId;
    /** The collection of management template information associated with the management intent. Optional. Read-only.  */
    private java.util.List<ManagementTemplateDetailedInfo> _managementTemplates;
    /**
     * Instantiates a new managementIntentInfo and sets the default values.
     * @return a void
     */
    public ManagementIntentInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementIntentInfo
     */
    @javax.annotation.Nonnull
    public static ManagementIntentInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementIntentInfo();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagementIntentInfo currentObject = this;
        return new HashMap<>(3) {{
            this.put("managementIntentDisplayName", (n) -> { currentObject.setManagementIntentDisplayName(n.getStringValue()); });
            this.put("managementIntentId", (n) -> { currentObject.setManagementIntentId(n.getStringValue()); });
            this.put("managementTemplates", (n) -> { currentObject.setManagementTemplates(n.getCollectionOfObjectValues(ManagementTemplateDetailedInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the managementIntentDisplayName property value. The display name for the management intent. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementIntentDisplayName() {
        return this._managementIntentDisplayName;
    }
    /**
     * Gets the managementIntentId property value. The identifier for the management intent. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementIntentId() {
        return this._managementIntentId;
    }
    /**
     * Gets the managementTemplates property value. The collection of management template information associated with the management intent. Optional. Read-only.
     * @return a managementTemplateDetailedInfo
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementTemplateDetailedInfo> getManagementTemplates() {
        return this._managementTemplates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("managementIntentDisplayName", this.getManagementIntentDisplayName());
        writer.writeStringValue("managementIntentId", this.getManagementIntentId());
        writer.writeCollectionOfObjectValues("managementTemplates", this.getManagementTemplates());
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
     * Sets the managementIntentDisplayName property value. The display name for the management intent. Optional. Read-only.
     * @param value Value to set for the managementIntentDisplayName property.
     * @return a void
     */
    public void setManagementIntentDisplayName(@javax.annotation.Nullable final String value) {
        this._managementIntentDisplayName = value;
    }
    /**
     * Sets the managementIntentId property value. The identifier for the management intent. Required. Read-only.
     * @param value Value to set for the managementIntentId property.
     * @return a void
     */
    public void setManagementIntentId(@javax.annotation.Nullable final String value) {
        this._managementIntentId = value;
    }
    /**
     * Sets the managementTemplates property value. The collection of management template information associated with the management intent. Optional. Read-only.
     * @param value Value to set for the managementTemplates property.
     * @return a void
     */
    public void setManagementTemplates(@javax.annotation.Nullable final java.util.List<ManagementTemplateDetailedInfo> value) {
        this._managementTemplates = value;
    }
}
