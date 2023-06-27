package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationAttributeCollectionInputConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The built-in or custom attribute for which a value is being collected.
     */
    private String attribute;
    /**
     * The default value of the attribute displayed to the end user.
     */
    private String defaultValue;
    /**
     * Whether the attribute is editable by the end user.
     */
    private Boolean editable;
    /**
     * Whether the attribute is displayed to the end user.
     */
    private Boolean hidden;
    /**
     * The inputType property
     */
    private AuthenticationAttributeCollectionInputType inputType;
    /**
     * The label of the attribute field that will be displayed to end user, unless overridden.
     */
    private String label;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The option values for certain multiple-option input types.
     */
    private java.util.List<AuthenticationAttributeCollectionOptionConfiguration> options;
    /**
     * Whether the field is required.
     */
    private Boolean required;
    /**
     * The regex for the value of the field.
     */
    private String validationRegEx;
    /**
     * Whether the value collected will be stored.
     */
    private Boolean writeToDirectory;
    /**
     * Instantiates a new authenticationAttributeCollectionInputConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationAttributeCollectionInputConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationAttributeCollectionInputConfiguration
     */
    @javax.annotation.Nonnull
    public static AuthenticationAttributeCollectionInputConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationAttributeCollectionInputConfiguration();
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
     * Gets the attribute property value. The built-in or custom attribute for which a value is being collected.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAttribute() {
        return this.attribute;
    }
    /**
     * Gets the defaultValue property value. The default value of the attribute displayed to the end user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * Gets the editable property value. Whether the attribute is editable by the end user.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEditable() {
        return this.editable;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("attribute", (n) -> { this.setAttribute(n.getStringValue()); });
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getStringValue()); });
        deserializerMap.put("editable", (n) -> { this.setEditable(n.getBooleanValue()); });
        deserializerMap.put("hidden", (n) -> { this.setHidden(n.getBooleanValue()); });
        deserializerMap.put("inputType", (n) -> { this.setInputType(n.getEnumValue(AuthenticationAttributeCollectionInputType.class)); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("options", (n) -> { this.setOptions(n.getCollectionOfObjectValues(AuthenticationAttributeCollectionOptionConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("required", (n) -> { this.setRequired(n.getBooleanValue()); });
        deserializerMap.put("validationRegEx", (n) -> { this.setValidationRegEx(n.getStringValue()); });
        deserializerMap.put("writeToDirectory", (n) -> { this.setWriteToDirectory(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hidden property value. Whether the attribute is displayed to the end user.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHidden() {
        return this.hidden;
    }
    /**
     * Gets the inputType property value. The inputType property
     * @return a AuthenticationAttributeCollectionInputType
     */
    @javax.annotation.Nullable
    public AuthenticationAttributeCollectionInputType getInputType() {
        return this.inputType;
    }
    /**
     * Gets the label property value. The label of the attribute field that will be displayed to end user, unless overridden.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLabel() {
        return this.label;
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
     * Gets the options property value. The option values for certain multiple-option input types.
     * @return a authenticationAttributeCollectionOptionConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationAttributeCollectionOptionConfiguration> getOptions() {
        return this.options;
    }
    /**
     * Gets the required property value. Whether the field is required.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequired() {
        return this.required;
    }
    /**
     * Gets the validationRegEx property value. The regex for the value of the field.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValidationRegEx() {
        return this.validationRegEx;
    }
    /**
     * Gets the writeToDirectory property value. Whether the value collected will be stored.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWriteToDirectory() {
        return this.writeToDirectory;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("attribute", this.getAttribute());
        writer.writeStringValue("defaultValue", this.getDefaultValue());
        writer.writeBooleanValue("editable", this.getEditable());
        writer.writeBooleanValue("hidden", this.getHidden());
        writer.writeEnumValue("inputType", this.getInputType());
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("options", this.getOptions());
        writer.writeBooleanValue("required", this.getRequired());
        writer.writeStringValue("validationRegEx", this.getValidationRegEx());
        writer.writeBooleanValue("writeToDirectory", this.getWriteToDirectory());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the attribute property value. The built-in or custom attribute for which a value is being collected.
     * @param value Value to set for the attribute property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttribute(@javax.annotation.Nullable final String value) {
        this.attribute = value;
    }
    /**
     * Sets the defaultValue property value. The default value of the attribute displayed to the end user.
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultValue(@javax.annotation.Nullable final String value) {
        this.defaultValue = value;
    }
    /**
     * Sets the editable property value. Whether the attribute is editable by the end user.
     * @param value Value to set for the editable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEditable(@javax.annotation.Nullable final Boolean value) {
        this.editable = value;
    }
    /**
     * Sets the hidden property value. Whether the attribute is displayed to the end user.
     * @param value Value to set for the hidden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHidden(@javax.annotation.Nullable final Boolean value) {
        this.hidden = value;
    }
    /**
     * Sets the inputType property value. The inputType property
     * @param value Value to set for the inputType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInputType(@javax.annotation.Nullable final AuthenticationAttributeCollectionInputType value) {
        this.inputType = value;
    }
    /**
     * Sets the label property value. The label of the attribute field that will be displayed to end user, unless overridden.
     * @param value Value to set for the label property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabel(@javax.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the options property value. The option values for certain multiple-option input types.
     * @param value Value to set for the options property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOptions(@javax.annotation.Nullable final java.util.List<AuthenticationAttributeCollectionOptionConfiguration> value) {
        this.options = value;
    }
    /**
     * Sets the required property value. Whether the field is required.
     * @param value Value to set for the required property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequired(@javax.annotation.Nullable final Boolean value) {
        this.required = value;
    }
    /**
     * Sets the validationRegEx property value. The regex for the value of the field.
     * @param value Value to set for the validationRegEx property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValidationRegEx(@javax.annotation.Nullable final String value) {
        this.validationRegEx = value;
    }
    /**
     * Sets the writeToDirectory property value. Whether the value collected will be stored.
     * @param value Value to set for the writeToDirectory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWriteToDirectory(@javax.annotation.Nullable final Boolean value) {
        this.writeToDirectory = value;
    }
}
