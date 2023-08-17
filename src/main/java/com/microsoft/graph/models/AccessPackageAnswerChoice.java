package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAnswerChoice implements AdditionalDataHolder, Parsable {
    /**
     * The actual value of the selected choice. This is typically a string value which is understandable by applications. Required.
     */
    private String actualValue;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The localized display values shown to the requestor and approvers. Required.
     */
    private AccessPackageLocalizedContent displayValue;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new accessPackageAnswerChoice and sets the default values.
     */
    public AccessPackageAnswerChoice() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAnswerChoice
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAnswerChoice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAnswerChoice();
    }
    /**
     * Gets the actualValue property value. The actual value of the selected choice. This is typically a string value which is understandable by applications. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getActualValue() {
        return this.actualValue;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the displayValue property value. The localized display values shown to the requestor and approvers. Required.
     * @return a accessPackageLocalizedContent
     */
    @jakarta.annotation.Nullable
    public AccessPackageLocalizedContent getDisplayValue() {
        return this.displayValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("actualValue", (n) -> { this.setActualValue(n.getStringValue()); });
        deserializerMap.put("displayValue", (n) -> { this.setDisplayValue(n.getObjectValue(AccessPackageLocalizedContent::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actualValue", this.getActualValue());
        writer.writeObjectValue("displayValue", this.getDisplayValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actualValue property value. The actual value of the selected choice. This is typically a string value which is understandable by applications. Required.
     * @param value Value to set for the actualValue property.
     */
    public void setActualValue(@jakarta.annotation.Nullable final String value) {
        this.actualValue = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the displayValue property value. The localized display values shown to the requestor and approvers. Required.
     * @param value Value to set for the displayValue property.
     */
    public void setDisplayValue(@jakarta.annotation.Nullable final AccessPackageLocalizedContent value) {
        this.displayValue = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
