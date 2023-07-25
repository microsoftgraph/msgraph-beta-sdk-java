package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PasswordSingleSignOnField implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Title/label override for customization.
     */
    private String customizedLabel;
    /**
     * Label that would be used if no customizedLabel is provided. Read only.
     */
    private String defaultLabel;
    /**
     * Id used to identity the field type. This is an internal id and possible values are param_1, param_2, param_userName, param_password.
     */
    private String fieldId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Type of the credential. The values can be text, password.
     */
    private String type;
    /**
     * Instantiates a new passwordSingleSignOnField and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.additionalData;
    }
    /**
     * Gets the customizedLabel property value. Title/label override for customization.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomizedLabel() {
        return this.customizedLabel;
    }
    /**
     * Gets the defaultLabel property value. Label that would be used if no customizedLabel is provided. Read only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultLabel() {
        return this.defaultLabel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("customizedLabel", (n) -> { this.setCustomizedLabel(n.getStringValue()); });
        deserializerMap.put("defaultLabel", (n) -> { this.setDefaultLabel(n.getStringValue()); });
        deserializerMap.put("fieldId", (n) -> { this.setFieldId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fieldId property value. Id used to identity the field type. This is an internal id and possible values are param_1, param_2, param_userName, param_password.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFieldId() {
        return this.fieldId;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the type property value. Type of the credential. The values can be text, password.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("customizedLabel", this.getCustomizedLabel());
        writer.writeStringValue("defaultLabel", this.getDefaultLabel());
        writer.writeStringValue("fieldId", this.getFieldId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the customizedLabel property value. Title/label override for customization.
     * @param value Value to set for the customizedLabel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomizedLabel(@javax.annotation.Nullable final String value) {
        this.customizedLabel = value;
    }
    /**
     * Sets the defaultLabel property value. Label that would be used if no customizedLabel is provided. Read only.
     * @param value Value to set for the defaultLabel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultLabel(@javax.annotation.Nullable final String value) {
        this.defaultLabel = value;
    }
    /**
     * Sets the fieldId property value. Id used to identity the field type. This is an internal id and possible values are param_1, param_2, param_userName, param_password.
     * @param value Value to set for the fieldId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFieldId(@javax.annotation.Nullable final String value) {
        this.fieldId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the type property value. Type of the credential. The values can be text, password.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
    }
}
