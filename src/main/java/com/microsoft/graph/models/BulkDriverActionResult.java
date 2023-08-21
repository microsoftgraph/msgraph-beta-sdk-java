package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A complex type to represent the result of bulk driver action.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkDriverActionResult implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of driver Ids where the action is failed.
     */
    private java.util.List<String> failedDriverIds;
    /**
     * List of driver Ids that are not found.
     */
    private java.util.List<String> notFoundDriverIds;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * List of driver Ids where the action is successful.
     */
    private java.util.List<String> successfulDriverIds;
    /**
     * Instantiates a new bulkDriverActionResult and sets the default values.
     */
    public BulkDriverActionResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bulkDriverActionResult
     */
    @jakarta.annotation.Nonnull
    public static BulkDriverActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkDriverActionResult();
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
     * Gets the failedDriverIds property value. List of driver Ids where the action is failed.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFailedDriverIds() {
        return this.failedDriverIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("failedDriverIds", (n) -> { this.setFailedDriverIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("notFoundDriverIds", (n) -> { this.setNotFoundDriverIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("successfulDriverIds", (n) -> { this.setSuccessfulDriverIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the notFoundDriverIds property value. List of driver Ids that are not found.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNotFoundDriverIds() {
        return this.notFoundDriverIds;
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
     * Gets the successfulDriverIds property value. List of driver Ids where the action is successful.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSuccessfulDriverIds() {
        return this.successfulDriverIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("failedDriverIds", this.getFailedDriverIds());
        writer.writeCollectionOfPrimitiveValues("notFoundDriverIds", this.getNotFoundDriverIds());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("successfulDriverIds", this.getSuccessfulDriverIds());
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
     * Sets the failedDriverIds property value. List of driver Ids where the action is failed.
     * @param value Value to set for the failedDriverIds property.
     */
    public void setFailedDriverIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.failedDriverIds = value;
    }
    /**
     * Sets the notFoundDriverIds property value. List of driver Ids that are not found.
     * @param value Value to set for the notFoundDriverIds property.
     */
    public void setNotFoundDriverIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.notFoundDriverIds = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the successfulDriverIds property value. List of driver Ids where the action is successful.
     * @param value Value to set for the successfulDriverIds property.
     */
    public void setSuccessfulDriverIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.successfulDriverIds = value;
    }
}
