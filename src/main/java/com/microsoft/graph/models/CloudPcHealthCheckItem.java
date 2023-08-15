package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcHealthCheckItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Additional message for this health check.
     */
    private String additionalDetails;
    /**
     * The connectivity health check item name.
     */
    private String displayName;
    /**
     * Timestamp when the last check occurs. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime lastHealthCheckDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The result property
     */
    private CloudPcConnectivityEventResult result;
    /**
     * Instantiates a new cloudPcHealthCheckItem and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public CloudPcHealthCheckItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcHealthCheckItem
     */
    @jakarta.annotation.Nonnull
    public static CloudPcHealthCheckItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcHealthCheckItem();
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
     * Gets the additionalDetails property value. Additional message for this health check.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAdditionalDetails() {
        return this.additionalDetails;
    }
    /**
     * Gets the displayName property value. The connectivity health check item name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("additionalDetails", (n) -> { this.setAdditionalDetails(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastHealthCheckDateTime", (n) -> { this.setLastHealthCheckDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("result", (n) -> { this.setResult(n.getEnumValue(CloudPcConnectivityEventResult.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastHealthCheckDateTime property value. Timestamp when the last check occurs. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastHealthCheckDateTime() {
        return this.lastHealthCheckDateTime;
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
     * Gets the result property value. The result property
     * @return a cloudPcConnectivityEventResult
     */
    @jakarta.annotation.Nullable
    public CloudPcConnectivityEventResult getResult() {
        return this.result;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("additionalDetails", this.getAdditionalDetails());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastHealthCheckDateTime", this.getLastHealthCheckDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("result", this.getResult());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the additionalDetails property value. Additional message for this health check.
     * @param value Value to set for the additionalDetails property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalDetails(@jakarta.annotation.Nullable final String value) {
        this.additionalDetails = value;
    }
    /**
     * Sets the displayName property value. The connectivity health check item name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastHealthCheckDateTime property value. Timestamp when the last check occurs. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastHealthCheckDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastHealthCheckDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastHealthCheckDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the result property value. The result property
     * @param value Value to set for the result property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResult(@jakarta.annotation.Nullable final CloudPcConnectivityEventResult value) {
        this.result = value;
    }
}
