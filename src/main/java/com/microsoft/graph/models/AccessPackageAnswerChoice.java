package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAnswerChoice implements AdditionalDataHolder, Parsable {
    /** The actual value of the selected choice. This is typically a string value which is understandable by applications. Required. */
    private String _actualValue;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The localized display values shown to the requestor and approvers. Required. */
    private AccessPackageLocalizedContent _displayValue;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new accessPackageAnswerChoice and sets the default values.
     * @return a void
     */
    public AccessPackageAnswerChoice() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.accessPackageAnswerChoice");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAnswerChoice
     */
    @javax.annotation.Nonnull
    public static AccessPackageAnswerChoice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAnswerChoice();
    }
    /**
     * Gets the actualValue property value. The actual value of the selected choice. This is typically a string value which is understandable by applications. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActualValue() {
        return this._actualValue;
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
     * Gets the displayValue property value. The localized display values shown to the requestor and approvers. Required.
     * @return a accessPackageLocalizedContent
     */
    @javax.annotation.Nullable
    public AccessPackageLocalizedContent getDisplayValue() {
        return this._displayValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageAnswerChoice currentObject = this;
        return new HashMap<>(3) {{
            this.put("actualValue", (n) -> { currentObject.setActualValue(n.getStringValue()); });
            this.put("displayValue", (n) -> { currentObject.setDisplayValue(n.getObjectValue(AccessPackageLocalizedContent::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actualValue", this.getActualValue());
        writer.writeObjectValue("displayValue", this.getDisplayValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actualValue property value. The actual value of the selected choice. This is typically a string value which is understandable by applications. Required.
     * @param value Value to set for the actualValue property.
     * @return a void
     */
    public void setActualValue(@javax.annotation.Nullable final String value) {
        this._actualValue = value;
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
     * Sets the displayValue property value. The localized display values shown to the requestor and approvers. Required.
     * @param value Value to set for the displayValue property.
     * @return a void
     */
    public void setDisplayValue(@javax.annotation.Nullable final AccessPackageLocalizedContent value) {
        this._displayValue = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
