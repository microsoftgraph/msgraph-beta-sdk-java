package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcBulkRemoteActionResult implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of all the Intune managed device IDs that completed the bulk action with a failure.
     */
    private java.util.List<String> failedDeviceIds;
    /**
     * A list of all the Intune managed device IDs that were not found when the bulk action was attempted.
     */
    private java.util.List<String> notFoundDeviceIds;
    /**
     * A list of all the Intune managed device IDs that were identified as unsupported for the bulk action.
     */
    private java.util.List<String> notSupportedDeviceIds;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * A list of all the Intune managed device IDs that completed the bulk action successfully.
     */
    private java.util.List<String> successfulDeviceIds;
    /**
     * Instantiates a new CloudPcBulkRemoteActionResult and sets the default values.
     */
    public CloudPcBulkRemoteActionResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcBulkRemoteActionResult
     */
    @jakarta.annotation.Nonnull
    public static CloudPcBulkRemoteActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcBulkRemoteActionResult();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the failedDeviceIds property value. A list of all the Intune managed device IDs that completed the bulk action with a failure.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFailedDeviceIds() {
        return this.failedDeviceIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("failedDeviceIds", (n) -> { this.setFailedDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("notFoundDeviceIds", (n) -> { this.setNotFoundDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("notSupportedDeviceIds", (n) -> { this.setNotSupportedDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("successfulDeviceIds", (n) -> { this.setSuccessfulDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the notFoundDeviceIds property value. A list of all the Intune managed device IDs that were not found when the bulk action was attempted.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNotFoundDeviceIds() {
        return this.notFoundDeviceIds;
    }
    /**
     * Gets the notSupportedDeviceIds property value. A list of all the Intune managed device IDs that were identified as unsupported for the bulk action.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNotSupportedDeviceIds() {
        return this.notSupportedDeviceIds;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the successfulDeviceIds property value. A list of all the Intune managed device IDs that completed the bulk action successfully.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSuccessfulDeviceIds() {
        return this.successfulDeviceIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("failedDeviceIds", this.getFailedDeviceIds());
        writer.writeCollectionOfPrimitiveValues("notFoundDeviceIds", this.getNotFoundDeviceIds());
        writer.writeCollectionOfPrimitiveValues("notSupportedDeviceIds", this.getNotSupportedDeviceIds());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("successfulDeviceIds", this.getSuccessfulDeviceIds());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the failedDeviceIds property value. A list of all the Intune managed device IDs that completed the bulk action with a failure.
     * @param value Value to set for the failedDeviceIds property.
     */
    public void setFailedDeviceIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.failedDeviceIds = value;
    }
    /**
     * Sets the notFoundDeviceIds property value. A list of all the Intune managed device IDs that were not found when the bulk action was attempted.
     * @param value Value to set for the notFoundDeviceIds property.
     */
    public void setNotFoundDeviceIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.notFoundDeviceIds = value;
    }
    /**
     * Sets the notSupportedDeviceIds property value. A list of all the Intune managed device IDs that were identified as unsupported for the bulk action.
     * @param value Value to set for the notSupportedDeviceIds property.
     */
    public void setNotSupportedDeviceIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.notSupportedDeviceIds = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the successfulDeviceIds property value. A list of all the Intune managed device IDs that completed the bulk action successfully.
     * @param value Value to set for the successfulDeviceIds property.
     */
    public void setSuccessfulDeviceIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.successfulDeviceIds = value;
    }
}
