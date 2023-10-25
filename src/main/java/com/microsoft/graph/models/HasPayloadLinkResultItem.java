package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class containing the result of HasPayloadLinks action.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HasPayloadLinkResultItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Exception information indicates if check for this item was successful or not.Empty string for no error.
     */
    private String error;
    /**
     * Indicate whether a payload has any link or not.
     */
    private Boolean hasLink;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Key of the Payload, In the format of Guid.
     */
    private String payloadId;
    /**
     * The reason where the link comes from.
     */
    private java.util.List<DeviceAndAppManagementAssignmentSource> sources;
    /**
     * Instantiates a new HasPayloadLinkResultItem and sets the default values.
     */
    public HasPayloadLinkResultItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HasPayloadLinkResultItem
     */
    @jakarta.annotation.Nonnull
    public static HasPayloadLinkResultItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HasPayloadLinkResultItem();
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
     * Gets the error property value. Exception information indicates if check for this item was successful or not.Empty string for no error.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("error", (n) -> { this.setError(n.getStringValue()); });
        deserializerMap.put("hasLink", (n) -> { this.setHasLink(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("payloadId", (n) -> { this.setPayloadId(n.getStringValue()); });
        deserializerMap.put("sources", (n) -> { this.setSources(n.getCollectionOfEnumValues(DeviceAndAppManagementAssignmentSource.class)); });
        return deserializerMap;
    }
    /**
     * Gets the hasLink property value. Indicate whether a payload has any link or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasLink() {
        return this.hasLink;
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
     * Gets the payloadId property value. Key of the Payload, In the format of Guid.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPayloadId() {
        return this.payloadId;
    }
    /**
     * Gets the sources property value. The reason where the link comes from.
     * @return a java.util.List<DeviceAndAppManagementAssignmentSource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceAndAppManagementAssignmentSource> getSources() {
        return this.sources;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("error", this.getError());
        writer.writeBooleanValue("hasLink", this.getHasLink());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("payloadId", this.getPayloadId());
        writer.writeCollectionOfEnumValues("sources", this.getSources());
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
     * Sets the error property value. Exception information indicates if check for this item was successful or not.Empty string for no error.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final String value) {
        this.error = value;
    }
    /**
     * Sets the hasLink property value. Indicate whether a payload has any link or not.
     * @param value Value to set for the hasLink property.
     */
    public void setHasLink(@jakarta.annotation.Nullable final Boolean value) {
        this.hasLink = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the payloadId property value. Key of the Payload, In the format of Guid.
     * @param value Value to set for the payloadId property.
     */
    public void setPayloadId(@jakarta.annotation.Nullable final String value) {
        this.payloadId = value;
    }
    /**
     * Sets the sources property value. The reason where the link comes from.
     * @param value Value to set for the sources property.
     */
    public void setSources(@jakarta.annotation.Nullable final java.util.List<DeviceAndAppManagementAssignmentSource> value) {
        this.sources = value;
    }
}
