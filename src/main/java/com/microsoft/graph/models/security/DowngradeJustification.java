package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DowngradeJustification implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether the downgrade is or is not justified.
     */
    private Boolean isDowngradeJustified;
    /**
     * Message that indicates why a downgrade is justified. The message will appear in administrative logs.
     */
    private String justificationMessage;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new downgradeJustification and sets the default values.
     */
    public DowngradeJustification() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a downgradeJustification
     */
    @jakarta.annotation.Nonnull
    public static DowngradeJustification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DowngradeJustification();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("isDowngradeJustified", (n) -> { this.setIsDowngradeJustified(n.getBooleanValue()); });
        deserializerMap.put("justificationMessage", (n) -> { this.setJustificationMessage(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDowngradeJustified property value. Indicates whether the downgrade is or is not justified.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDowngradeJustified() {
        return this.isDowngradeJustified;
    }
    /**
     * Gets the justificationMessage property value. Message that indicates why a downgrade is justified. The message will appear in administrative logs.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJustificationMessage() {
        return this.justificationMessage;
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
        writer.writeBooleanValue("isDowngradeJustified", this.getIsDowngradeJustified());
        writer.writeStringValue("justificationMessage", this.getJustificationMessage());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the isDowngradeJustified property value. Indicates whether the downgrade is or is not justified.
     * @param value Value to set for the isDowngradeJustified property.
     */
    public void setIsDowngradeJustified(@jakarta.annotation.Nullable final Boolean value) {
        this.isDowngradeJustified = value;
    }
    /**
     * Sets the justificationMessage property value. Message that indicates why a downgrade is justified. The message will appear in administrative logs.
     * @param value Value to set for the justificationMessage property.
     */
    public void setJustificationMessage(@jakarta.annotation.Nullable final String value) {
        this.justificationMessage = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
