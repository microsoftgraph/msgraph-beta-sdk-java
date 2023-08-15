package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcBulkActionSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The failedCount property
     */
    private Integer failedCount;
    /**
     * The inProgressCount property
     */
    private Integer inProgressCount;
    /**
     * The notSupportedCount property
     */
    private Integer notSupportedCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The pendingCount property
     */
    private Integer pendingCount;
    /**
     * The successfulCount property
     */
    private Integer successfulCount;
    /**
     * Instantiates a new cloudPcBulkActionSummary and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public CloudPcBulkActionSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcBulkActionSummary
     */
    @jakarta.annotation.Nonnull
    public static CloudPcBulkActionSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcBulkActionSummary();
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
     * Gets the failedCount property value. The failedCount property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedCount() {
        return this.failedCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("failedCount", (n) -> { this.setFailedCount(n.getIntegerValue()); });
        deserializerMap.put("inProgressCount", (n) -> { this.setInProgressCount(n.getIntegerValue()); });
        deserializerMap.put("notSupportedCount", (n) -> { this.setNotSupportedCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pendingCount", (n) -> { this.setPendingCount(n.getIntegerValue()); });
        deserializerMap.put("successfulCount", (n) -> { this.setSuccessfulCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inProgressCount property value. The inProgressCount property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getInProgressCount() {
        return this.inProgressCount;
    }
    /**
     * Gets the notSupportedCount property value. The notSupportedCount property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotSupportedCount() {
        return this.notSupportedCount;
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
     * Gets the pendingCount property value. The pendingCount property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPendingCount() {
        return this.pendingCount;
    }
    /**
     * Gets the successfulCount property value. The successfulCount property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulCount() {
        return this.successfulCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("failedCount", this.getFailedCount());
        writer.writeIntegerValue("inProgressCount", this.getInProgressCount());
        writer.writeIntegerValue("notSupportedCount", this.getNotSupportedCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("pendingCount", this.getPendingCount());
        writer.writeIntegerValue("successfulCount", this.getSuccessfulCount());
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
     * Sets the failedCount property value. The failedCount property
     * @param value Value to set for the failedCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFailedCount(@jakarta.annotation.Nullable final Integer value) {
        this.failedCount = value;
    }
    /**
     * Sets the inProgressCount property value. The inProgressCount property
     * @param value Value to set for the inProgressCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInProgressCount(@jakarta.annotation.Nullable final Integer value) {
        this.inProgressCount = value;
    }
    /**
     * Sets the notSupportedCount property value. The notSupportedCount property
     * @param value Value to set for the notSupportedCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNotSupportedCount(@jakarta.annotation.Nullable final Integer value) {
        this.notSupportedCount = value;
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
     * Sets the pendingCount property value. The pendingCount property
     * @param value Value to set for the pendingCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPendingCount(@jakarta.annotation.Nullable final Integer value) {
        this.pendingCount = value;
    }
    /**
     * Sets the successfulCount property value. The successfulCount property
     * @param value Value to set for the successfulCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSuccessfulCount(@jakarta.annotation.Nullable final Integer value) {
        this.successfulCount = value;
    }
}
