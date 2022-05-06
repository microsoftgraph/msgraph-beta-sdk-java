package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagementTemplateDetailedInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The management category for the management template. Possible values are: custom, devices, identity, unknownFutureValue. Required. Read-only.  */
    private ManagementCategory _category;
    /** The display name for the management template. Required. Read-only.  */
    private String _displayName;
    /** The unique identifier for the management template. Required. Read-only.  */
    private String _managementTemplateId;
    /** The version property  */
    private Integer _version;
    /**
     * Instantiates a new managementTemplateDetailedInfo and sets the default values.
     * @return a void
     */
    public ManagementTemplateDetailedInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementTemplateDetailedInfo
     */
    @javax.annotation.Nonnull
    public static ManagementTemplateDetailedInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementTemplateDetailedInfo();
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
     * Gets the category property value. The management category for the management template. Possible values are: custom, devices, identity, unknownFutureValue. Required. Read-only.
     * @return a managementCategory
     */
    @javax.annotation.Nullable
    public ManagementCategory getCategory() {
        return this._category;
    }
    /**
     * Gets the displayName property value. The display name for the management template. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagementTemplateDetailedInfo currentObject = this;
        return new HashMap<>(4) {{
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(ManagementCategory.class)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("managementTemplateId", (n) -> { currentObject.setManagementTemplateId(n.getStringValue()); });
            this.put("version", (n) -> { currentObject.setVersion(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the managementTemplateId property value. The unique identifier for the management template. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementTemplateId() {
        return this._managementTemplateId;
    }
    /**
     * Gets the version property value. The version property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("managementTemplateId", this.getManagementTemplateId());
        writer.writeIntegerValue("version", this.getVersion());
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
     * Sets the category property value. The management category for the management template. Possible values are: custom, devices, identity, unknownFutureValue. Required. Read-only.
     * @param value Value to set for the category property.
     * @return a void
     */
    public void setCategory(@javax.annotation.Nullable final ManagementCategory value) {
        this._category = value;
    }
    /**
     * Sets the displayName property value. The display name for the management template. Required. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the managementTemplateId property value. The unique identifier for the management template. Required. Read-only.
     * @param value Value to set for the managementTemplateId property.
     * @return a void
     */
    public void setManagementTemplateId(@javax.annotation.Nullable final String value) {
        this._managementTemplateId = value;
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}
