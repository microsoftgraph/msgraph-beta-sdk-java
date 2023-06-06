package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcResizeValidationResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The cloudPcId property */
    private String cloudPcId;
    /** The OdataType property */
    private String odataType;
    /** The validationResult property */
    private CloudPcResizeValidationCode validationResult;
    /**
     * Instantiates a new cloudPcResizeValidationResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcResizeValidationResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcResizeValidationResult
     */
    @javax.annotation.Nonnull
    public static CloudPcResizeValidationResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcResizeValidationResult();
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
     * Gets the cloudPcId property value. The cloudPcId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudPcId() {
        return this.cloudPcId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("cloudPcId", (n) -> { this.setCloudPcId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("validationResult", (n) -> { this.setValidationResult(n.getEnumValue(CloudPcResizeValidationCode.class)); });
        return deserializerMap;
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
     * Gets the validationResult property value. The validationResult property
     * @return a cloudPcResizeValidationCode
     */
    @javax.annotation.Nullable
    public CloudPcResizeValidationCode getValidationResult() {
        return this.validationResult;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloudPcId", this.getCloudPcId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("validationResult", this.getValidationResult());
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
     * Sets the cloudPcId property value. The cloudPcId property
     * @param value Value to set for the cloudPcId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudPcId(@javax.annotation.Nullable final String value) {
        this.cloudPcId = value;
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
     * Sets the validationResult property value. The validationResult property
     * @param value Value to set for the validationResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValidationResult(@javax.annotation.Nullable final CloudPcResizeValidationCode value) {
        this.validationResult = value;
    }
}
