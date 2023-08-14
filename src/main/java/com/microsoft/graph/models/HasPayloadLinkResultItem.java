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
     * Instantiates a new hasPayloadLinkResultItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public HasPayloadLinkResultItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a hasPayloadLinkResultItem
     */
    @javax.annotation.Nonnull
    public static HasPayloadLinkResultItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HasPayloadLinkResultItem();
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
     * Gets the error property value. Exception information indicates if check for this item was successful or not.Empty string for no error.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasLink() {
        return this.hasLink;
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
     * Gets the payloadId property value. Key of the Payload, In the format of Guid.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayloadId() {
        return this.payloadId;
    }
    /**
     * Gets the sources property value. The reason where the link comes from.
     * @return a deviceAndAppManagementAssignmentSource
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceAndAppManagementAssignmentSource> getSources() {
        return this.sources;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("error", this.getError());
        writer.writeBooleanValue("hasLink", this.getHasLink());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("payloadId", this.getPayloadId());
        writer.writeCollectionOfEnumValues("sources", this.getSources());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the error property value. Exception information indicates if check for this item was successful or not.Empty string for no error.
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final String value) {
        this.error = value;
    }
    /**
     * Sets the hasLink property value. Indicate whether a payload has any link or not.
     * @param value Value to set for the hasLink property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasLink(@javax.annotation.Nullable final Boolean value) {
        this.hasLink = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the payloadId property value. Key of the Payload, In the format of Guid.
     * @param value Value to set for the payloadId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayloadId(@javax.annotation.Nullable final String value) {
        this.payloadId = value;
    }
    /**
     * Sets the sources property value. The reason where the link comes from.
     * @param value Value to set for the sources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSources(@javax.annotation.Nullable final java.util.List<DeviceAndAppManagementAssignmentSource> value) {
        this.sources = value;
    }
}
