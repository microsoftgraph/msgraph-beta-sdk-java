package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OfficeUserCheckinSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The failedUserCount property */
    private Integer failedUserCount;
    /** The OdataType property */
    private String odataType;
    /** The succeededUserCount property */
    private Integer succeededUserCount;
    /**
     * Instantiates a new officeUserCheckinSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OfficeUserCheckinSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a officeUserCheckinSummary
     */
    @javax.annotation.Nonnull
    public static OfficeUserCheckinSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OfficeUserCheckinSummary();
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
     * Gets the failedUserCount property value. The failedUserCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedUserCount() {
        return this.failedUserCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("failedUserCount", (n) -> { this.setFailedUserCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("succeededUserCount", (n) -> { this.setSucceededUserCount(n.getIntegerValue()); });
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
     * Gets the succeededUserCount property value. The succeededUserCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSucceededUserCount() {
        return this.succeededUserCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("failedUserCount", this.getFailedUserCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("succeededUserCount", this.getSucceededUserCount());
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
     * Sets the failedUserCount property value. The failedUserCount property
     * @param value Value to set for the failedUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedUserCount(@javax.annotation.Nullable final Integer value) {
        this.failedUserCount = value;
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
     * Sets the succeededUserCount property value. The succeededUserCount property
     * @param value Value to set for the succeededUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSucceededUserCount(@javax.annotation.Nullable final Integer value) {
        this.succeededUserCount = value;
    }
}
