package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PasswordSingleSignOnField implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Title/label override for customization.  */
    private String _customizedLabel;
    /** Label that would be used if no customizedLabel is provided. Read only.  */
    private String _defaultLabel;
    /** Id used to identity the field type. This is an internal id and possible values are param_1, param_2, param_userName, param_password.  */
    private String _fieldId;
    /** Type of the credential. The values can be text, password.  */
    private String _type;
    /**
     * Instantiates a new passwordSingleSignOnField and sets the default values.
     * @return a void
     */
    public PasswordSingleSignOnField() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a passwordSingleSignOnField
     */
    @javax.annotation.Nonnull
    public static PasswordSingleSignOnField createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PasswordSingleSignOnField();
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
     * Gets the customizedLabel property value. Title/label override for customization.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomizedLabel() {
        return this._customizedLabel;
    }
    /**
     * Gets the defaultLabel property value. Label that would be used if no customizedLabel is provided. Read only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultLabel() {
        return this._defaultLabel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PasswordSingleSignOnField currentObject = this;
        return new HashMap<>(4) {{
            this.put("customizedLabel", (n) -> { currentObject.setCustomizedLabel(n.getStringValue()); });
            this.put("defaultLabel", (n) -> { currentObject.setDefaultLabel(n.getStringValue()); });
            this.put("fieldId", (n) -> { currentObject.setFieldId(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fieldId property value. Id used to identity the field type. This is an internal id and possible values are param_1, param_2, param_userName, param_password.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFieldId() {
        return this._fieldId;
    }
    /**
     * Gets the type property value. Type of the credential. The values can be text, password.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("customizedLabel", this.getCustomizedLabel());
        writer.writeStringValue("defaultLabel", this.getDefaultLabel());
        writer.writeStringValue("fieldId", this.getFieldId());
        writer.writeStringValue("type", this.getType());
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
     * Sets the customizedLabel property value. Title/label override for customization.
     * @param value Value to set for the customizedLabel property.
     * @return a void
     */
    public void setCustomizedLabel(@javax.annotation.Nullable final String value) {
        this._customizedLabel = value;
    }
    /**
     * Sets the defaultLabel property value. Label that would be used if no customizedLabel is provided. Read only.
     * @param value Value to set for the defaultLabel property.
     * @return a void
     */
    public void setDefaultLabel(@javax.annotation.Nullable final String value) {
        this._defaultLabel = value;
    }
    /**
     * Sets the fieldId property value. Id used to identity the field type. This is an internal id and possible values are param_1, param_2, param_userName, param_password.
     * @param value Value to set for the fieldId property.
     * @return a void
     */
    public void setFieldId(@javax.annotation.Nullable final String value) {
        this._fieldId = value;
    }
    /**
     * Sets the type property value. Type of the credential. The values can be text, password.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
