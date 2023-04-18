package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BulkManagedDeviceActionResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Failed devices */
    private java.util.List<String> failedDeviceIds;
    /** Not found devices */
    private java.util.List<String> notFoundDeviceIds;
    /** Not supported devices */
    private java.util.List<String> notSupportedDeviceIds;
    /** The OdataType property */
    private String odataType;
    /** Successful devices */
    private java.util.List<String> successfulDeviceIds;
    /**
     * Instantiates a new bulkManagedDeviceActionResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BulkManagedDeviceActionResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bulkManagedDeviceActionResult
     */
    @javax.annotation.Nonnull
    public static BulkManagedDeviceActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkManagedDeviceActionResult();
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
     * Gets the failedDeviceIds property value. Failed devices
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFailedDeviceIds() {
        return this.failedDeviceIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the notFoundDeviceIds property value. Not found devices
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNotFoundDeviceIds() {
        return this.notFoundDeviceIds;
    }
    /**
     * Gets the notSupportedDeviceIds property value. Not supported devices
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNotSupportedDeviceIds() {
        return this.notSupportedDeviceIds;
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
     * Gets the successfulDeviceIds property value. Successful devices
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSuccessfulDeviceIds() {
        return this.successfulDeviceIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("failedDeviceIds", this.getFailedDeviceIds());
        writer.writeCollectionOfPrimitiveValues("notFoundDeviceIds", this.getNotFoundDeviceIds());
        writer.writeCollectionOfPrimitiveValues("notSupportedDeviceIds", this.getNotSupportedDeviceIds());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("successfulDeviceIds", this.getSuccessfulDeviceIds());
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
     * Sets the failedDeviceIds property value. Failed devices
     * @param value Value to set for the failedDeviceIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedDeviceIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.failedDeviceIds = value;
    }
    /**
     * Sets the notFoundDeviceIds property value. Not found devices
     * @param value Value to set for the notFoundDeviceIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotFoundDeviceIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.notFoundDeviceIds = value;
    }
    /**
     * Sets the notSupportedDeviceIds property value. Not supported devices
     * @param value Value to set for the notSupportedDeviceIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotSupportedDeviceIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.notSupportedDeviceIds = value;
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
     * Sets the successfulDeviceIds property value. Successful devices
     * @param value Value to set for the successfulDeviceIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSuccessfulDeviceIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.successfulDeviceIds = value;
    }
}
